/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.List;
import persistensia.ControladoraPersistencia;

public class Controladora {

  public Controladora() {
  }

  ControladoraPersistencia controlPersistencia = new ControladoraPersistencia();

  public void crearUsuario(String username, String contrasenia, String rol) {
    Usuario usuario = new Usuario();
    usuario.setUsuario(username);
    usuario.setContrasenia(contrasenia);
    usuario.setRol(rol);

    controlPersistencia.crearUsuario(usuario);
  }

  public List<Usuario> verUsuarios() {
    return controlPersistencia.verUsuarios();
  }

  public Usuario verUsuario(int id) {
    return controlPersistencia.verUsuario(id);
  }

  public void eliminarUsuario(int id) {
    controlPersistencia.eliminarUsuario(id);
  }

  public void editarUsuario(Usuario usuario) {
    controlPersistencia.editarUsuario(usuario);
  }

  public boolean existeUsuario(String usuario, String contrasenia) {
    boolean existe = false;

    List<Usuario> usuarios;
    usuarios = controlPersistencia.verUsuarios();

    for (Usuario usu : usuarios) {
      if (usu.getUsuario().equals(usuario)) {
        existe = usu.getContrasenia().equals(contrasenia);

      }
    }

    return existe;
  }

}
