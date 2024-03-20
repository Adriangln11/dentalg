
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="componentes/head.jsp"%>
<%@include file="componentes/sidebar.jsp"%>
<%@include file="componentes/navbar.jsp"%>



<main>

    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="well well-sm">
                    <form class="form-horizontal" method="post">
                        <fieldset class="d-flex flex-column justify-center">
                            <legend class="text-center header">Registrar Odontologo</legend>


                            <div class="form-group d-md-flex">
                                <div class="form-group d-flex flex-column col-md-6 col-12">
                                    <span class=" col-md-offset-2 text-left"><i class="fa fa-user bigicon"></i></span>
                                    <div class="">
                                        <input id="fname" name="nombre" type="text" placeholder="Nombre" class="form-control">
                                    </div>
                                </div>
                                <div class="form-group d-flex flex-column  col-md-6 col-12">
                                    <span class="col-md-offset-2 text-left"><i class="fa fa-user bigicon"></i></span>
                                    <div class="">
                                        <input id="fname" name="fecha_nac" type="date" placeholder="Fecha de nacimiento DD/MM/AAAA" class="form-control">
                                    </div>
                                </div>
                            </div>

                            <div class="form-group d-md-flex">
                                <div class="form-group d-flex flex-column col-md-6 col-12">
                                    <span class=" col-md-offset-2 text-left"><i class="fa fa-user bigicon"></i></span>
                                    <div class="">
                                        <input id="fname" name="telefono" type="number" placeholder="Telefono +" class="form-control">
                                    </div>
                                </div>
                                <div class="form-group d-flex flex-column col-md-6 col-12">
                                    <span class=" col-md-offset-2 text-left"><i class="fa fa-user bigicon"></i></span>
                                    <div class="">
                                        <input id="fname" name="especialidad" type="text" placeholder="Especialidad" class="form-control">
                                    </div>
                                </div>
                            </div>

                            <div class="form-group d-md-flex">

                                <div class="form-group d-flex flex-column  col-md-12">
                                    <span class="col-md-offset-2 text-left"><i class="fa fa-user bigicon"></i></span>
                                    <div class="">
                                        <input id="fname" name="direccion" type="text" placeholder="Direccion" class="form-control">
                                    </div>
                                </div>
                            </div>

                            <div class="form-group d-flex flex-column align-items-center">
                                <div class="col-md-12 text-center">
                                    <button type="submit" class="btn btn-primary btn-lg">Registrar</button>
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


