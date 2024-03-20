/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import logica.Controladora;

/**
 *
 * @author ADRIAN
 */
@WebServlet(name = "SvLogin", urlPatterns = {"/login"})
public class SvLogin extends HttpServlet {

  Controladora controladora = new Controladora();

  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
  }

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    processRequest(request, response);

  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    processRequest(request, response);

    String usuario = request.getParameter("usuario");
    String contrasenia = request.getParameter("contrasenia");

    boolean existe = false;

    existe = controladora.existeUsuario(usuario, contrasenia);

    if (!existe) {
      response.sendRedirect("login.jsp");
      return;
    }

    HttpSession sesion = request.getSession(true);
    sesion.setAttribute("login", usuario);
    response.sendRedirect("index.jsp");

  }

  @Override
  public String getServletInfo() {
    return "Short description";
  }// </editor-fold>

}
