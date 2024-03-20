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
import java.util.ArrayList;
import java.util.List;
import logica.Controladora;
import logica.Usuario;

/**
 *
 * @author ADRIAN
 */
@WebServlet(name = "SvUsuario", urlPatterns = {"/usuario"})
public class SvUsuario extends HttpServlet {

  Controladora controladora = new Controladora();

  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

  }

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    processRequest(request, response);

    List<Usuario> usuarios = new ArrayList<>();
    usuarios = controladora.verUsuarios();
    HttpSession sesion = request.getSession();
    sesion.setAttribute("usuarios", usuarios);

    response.sendRedirect("ver-usuarios.jsp");

  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    processRequest(request, response);

    String usuario = request.getParameter("usuario");
    String contrasenia = request.getParameter("contrasenia");
    String rol = request.getParameter("rol");

    controladora.crearUsuario(usuario, contrasenia, rol);

    response.sendRedirect("registrar-usuario.jsp");
  }

  @Override
  public String getServletInfo() {
    return "Short description";
  }// </editor-fold>

}
