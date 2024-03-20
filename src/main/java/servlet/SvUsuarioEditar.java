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
import logica.Usuario;

/**
 *
 * @author ADRIAN
 */
@WebServlet(name = "SvUsuarioEditar", urlPatterns = {"/usuario-editar"})
public class SvUsuarioEditar extends HttpServlet {

  Controladora controladora = new Controladora();

  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
  }

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    processRequest(request, response);

    int id = Integer.parseInt(request.getParameter("id"));

    Usuario usuario = controladora.verUsuario(id);

    HttpSession sesion = request.getSession();
    sesion.setAttribute("usuario", usuario);

    response.sendRedirect("editar-usuario.jsp");

  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    processRequest(request, response);

    String usuario = request.getParameter("usuario");
    String contrasenia = request.getParameter("contrasenia");
    String rol = request.getParameter("rol");

    Usuario usuarioAnterior = (Usuario) request.getSession().getAttribute("usuario");

    usuarioAnterior.setUsuario(usuario);
    usuarioAnterior.setContrasenia(contrasenia);
    usuarioAnterior.setRol(rol);

    controladora.editarUsuario(usuarioAnterior);

    response.sendRedirect("usuario");

  }

  @Override
  public String getServletInfo() {
    return "Short description";
  }// </editor-fold>

}
