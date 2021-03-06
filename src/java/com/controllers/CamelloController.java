package com.controllers;

import com.comun.Util;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CamelloController extends HttpServlet {

       /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String palabra = request.getParameter("txtpalabra");
        HttpSession session = request.getSession(false);
        session.setAttribute("palabra", Util.getCamello(palabra));
        response.sendRedirect("/Camello");
    }

}
