
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="componentes/head.jsp"%>
<%@include file="componentes/sidebar.jsp"%>
<%@include file="componentes/navbar.jsp"%>
<%@page import="logica.Usuario"%>



<main>
  <% Usuario usuario = (Usuario)request.getSession().getAttribute("usuario");%>

  <div class="container">
    <div class="row">
      <div class="col-md-12">
        <div class="well well-sm">
          <form class="form-horizontal" method="post" action="usuario-editar">
            <fieldset class="d-flex flex-column justify-center">
              <legend class="text-center header">Editar Usuario</legend>


              <div class="form-group d-md-flex">
                <div class="form-group d-flex flex-column col-md-6 col-12">
                  <span class=" col-md-offset-2 text-left"><i class="fa fa-user bigicon"></i></span>
                  <div class="">
                    <input id="fname" name="usuario" type="text" placeholder="Usuario" class="form-control" value="<%=usuario.getUsuario()%>">
                  </div>
                </div>
                <div class="form-group d-flex flex-column  col-md-6 col-12">
                  <span class="col-md-offset-2 text-left"><i class="fa fa-user bigicon"></i></span>
                  <div class="">
                    <input id="fname" name="contrasenia" type="password" placeholder="Contraseña" class="form-control" value="<%=usuario.getContrasenia()%>">
                  </div>
                </div>
              </div>

              <div class="form-group d-md-flex">
                <div class="form-group d-flex flex-column  col-12">
                  <span class=" col-md-offset-2 text-left"><i class="fa fa-user bigicon"></i></span>
                  <div class="">
                    <input id="fname" name="rol" type="text" placeholder="Rol" class="form-control" value="<%=usuario.getRol()%>">
                  </div>
                </div>

              </div>



              <div class="form-group d-flex flex-column align-items-center">
                <div class="col-md-12 text-center">
                  <button type="submit" class="btn btn-primary btn-lg">Guardar</button>
                </div>
              </div>
            </fieldset>
          </form>
        </div>
      </div>
    </div>
  </div>

</main>

<%@include file="componentes/footer.jsp"%>
<%@include file="componentes/logoutmodal.jsp"%>
<%@include file="componentes/scripts.jsp"%>


