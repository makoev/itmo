package com.myproject;

import java.io.IOException;
import java.lang.reflect.Field;

import cla.CityClass;
import cla.HotelClass;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class BookingServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/html; charset=cp1251");
		if (req.getParameter("flag").equals("1")) {
			HotelClass[] spbhotels = {
					new HotelClass("Terrassa", "4,6", "Ул. Казанская».", "3",
							"+7 (812) 245-37-76",
							"http://ginza.ru/spb/restaurant/terrassa"),
					new HotelClass("SunDay Ginza", "3,8", "Ул. Южная дорога",
							"4/2", "+7 (812) 640 16 16",
							"http://ginza.ru/spb/restaurant/sunday_ginza") };
			HotelClass[] mschotels = {
					new HotelClass("White Rabbit", "4,4", "Смоленская пл.", "3",
							"+7 (495) 255-09-06",
							"http://whiterabbitmoscow.ru/"),
					new HotelClass("Sky Lounge", "4,3", "Ленинский пр-т».", "32А",
							"+7 (495) 781-57-75", "http://www.skylounge.ru/") };
			CityClass[] cities = { new CityClass(spbhotels), new CityClass(mschotels) };

			resp.getWriter().print("<table class=\"type2\">");
			resp.getWriter().print("<tr>");
			for (Field field : cities[Integer
					.parseInt(req.getParameter("city"))].hotels[0].getClass()
					.getDeclaredFields()) {
				resp.getWriter().print("<th>" + field.getName().toUpperCase() + "</th>");
			}
			resp.getWriter().print("</tr>");
			for (int i = 0; i < cities[Integer.parseInt(req
					.getParameter("city"))].hotels.length; i++) {
				resp.getWriter().print("<tr>");
				for (Field field : cities[Integer.parseInt(req
						.getParameter("city"))].hotels[i].getClass()
						.getDeclaredFields()) {
					try {
						resp.getWriter()
								.print("<td>"
										+ field.get(cities[Integer.parseInt(req
												.getParameter("city"))].hotels[i])
										+ "</td>");
					} catch (IllegalArgumentException | IllegalAccessException e) {
						e.printStackTrace();
					}
				}
				resp.getWriter().print("</tr>");
			}
			resp.getWriter().print("</table>");

		} else if (req.getParameter("flag").equals("0")) {
			resp.getWriter().println("");
		}
	}
}
