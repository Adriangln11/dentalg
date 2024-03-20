
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="componentes/head.jsp"%>
<%@include file="componentes/sidebar.jsp"%>
<%@include file="componentes/navbar.jsp"%>
<%@page import="logica.Usuario"%>
<%@page import="java.util.List"%>

<!-- Begin Page Content -->
<main class="vh-100 container-fluid overflow-y-scroll">

  <!-- Page Heading -->
  <h1 class="h3 mb-2 text-gray-800">Usuarios Registrados</h1>
  <a target="_blank"href="registrar-usuario.jsp">Registrar nuevo usuario</a>.</p>

<!-- DataTales Example -->
<div class="card shadow mb-4">
  <div class="card-header py-3">
    <h6 class="m-0 font-weight-bold text-primary">Usuarios</h6>
  </div>
  <div class="card-body">
    <div class="table-responsive">
      <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
        <thead>
          <tr>
            <th>Id</th>
            <th>Username</th>
            <th>Rol</th>
          </tr>
        </thead>
        <tfoot>
          <tr>
            <th>Id</th>
            <th>Username</th>
            <th>Rol</th>
          </tr>
        </tfoot>
        <%List<Usuario> usuarios = (List)request.getSession().getAttribute("usuarios");%>
        <tbody>
          <%for(Usuario usuario : usuarios){%>
          <tr>
            <td><%= usuario.getId_usuario() %></td>
            <td><%= usuario.getUsuario() %></td>
            <td><%= usuario.getRol() %></td>
            <td class="d-flex justify-content-center">
              <form action="usuario-eliminar" method="post">
                <button type="submit" class="btn btn-danger m-1">
                  Eliminar
                  <i class="fas fa-trash-alt"></i>
                </button>
                <input type="hidden" name="id" value="<%=usuario.getId_usuario()%>"/>
              </form>
              <form action="usuario-editar" method="get">
                <button type="submit" class="btn btn-info m-1">
                  Editar
                  <i class="fas fa-pencil-alt"></i>
                </button>
                <input type="hidden" name="id" value="<%=usuario.getId_usuario()%>"/>
              </form>
            </td>
          </tr>

          <% } %>

        </tbody>
      </table>
    </div>
  </div>
</div>

</main>
<!-- /.container-fluid -->


<%@include file="componentes/footer.jsp"%>
<%@include file="componentes/logoutmodal.jsp"%>
<%@include file="componentes/scripts.jsp"%>


