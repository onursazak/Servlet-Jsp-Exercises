package com.onur.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.SendResult;

import com.onur.web.dao.GadgetsDao;
import com.onur.web.model.Gadgets;

/**
 * Servlet implementation class GetGadgetsController
 */
@WebServlet("/getGadgets")
public class GetGadgetsController extends HttpServlet {
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int  gid = Integer.parseInt(request.getParameter("gid"));
		GadgetsDao dao = new GadgetsDao();
		Gadgets g1 = dao.getGadgets(gid);
		
		request.setAttribute("gadget", g1);
		
		
		//response.sendRedirect("showGadgets.jsp");
		RequestDispatcher rd = request.getRequestDispatcher("showGadgets.jsp");
		rd.forward(request, response);
		
		
	}

	

}
