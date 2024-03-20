/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistensia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Usuario;
import persistensia.exceptions.NonexistentEntityException;

/**
 *
 * @author ADRIAN
 */
public class ControladoraPersistencia {

  HorarioJpaController horarioJPA = new HorarioJpaController();
  OdontologoJpaController odontologoJPA = new OdontologoJpaController();
  PacienteJpaController pacienteJPA = new PacienteJpaController();
  PersonaJpaController personaJPA = new PersonaJpaController();
  ResponsableJpaController responsableJPA = new ResponsableJpaController();
  SecretarioJpaController secretarioJPA = new SecretarioJpaController();
  TurnoJpaController turnoJPA = new TurnoJpaController();
  UsuarioJpaController usuarioJPA = new UsuarioJpaController();

  public ControladoraPersistencia() {
  }

  public void crearUsuario(Usuario usuario) {
    usuarioJPA.create(usuario);
  }

  public List<Usuario> verUsuarios() {
    return usuarioJPA.findUsuarioEntities();
  }

  public Usuario verUsuario(int id) {
    return usuarioJPA.findUsuario(id);
  }

  public void eliminarUsuario(int id) {
    try {
      usuarioJPA.destroy(id);
    } catch (NonexistentEntityException ex) {
      Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  public void editarUsuario(Usuario usuario) {
    try {
      usuarioJPA.edit(usuario);
    } catch (Exception ex) {
      Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

}
