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
import java.io.IOException;
import logica.Controladora;

/**
 *
 * @author ADRIAN
 */
@WebServlet(name = "SvUsuarioEliminar", urlPatterns = {"/usuario-eliminar"})
public class SvUsuarioEliminar extends HttpServlet {

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

    int id = Integer.parseInt(request.getParameter("id"));

    controladora.eliminarUsuario(id);

    response.sendRedirect("usuario");

  }

  @Override
  public String getServletInfo() {
    return "Short description";
  }// </editor-fold>

}
