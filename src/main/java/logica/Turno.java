/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author ADRIAN
 */
@Entity
public class Turno implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  @Temporal(TemporalType.DATE)
  private Date fecha;
  private String hora;
  private String afeccion;
  @ManyToOne
  @JoinColumn(name = "id_odontologo")
  private Odontologo odontologo;
  @ManyToOne
  @JoinColumn(name = "id_paciente")
  private Paciente paciente;

  public Turno() {
  }

  public Turno(int id, Date fecha, String hora, String afeccion) {
    this.id = id;
    this.fecha = fecha;
    this.hora = hora;
    this.afeccion = afeccion;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Odontologo getOdontologo() {
    return odontologo;
  }

  public void setOdontologo(Odontologo odontologo) {
    this.odontologo = odontologo;
  }

  public Paciente getPaciente() {
    return paciente;
  }

  public void setPaciente(Paciente paciente) {
    this.paciente = paciente;
  }

  public Date getFecha() {
    return fecha;
  }

  public void setFecha(Date fecha) {
    this.fecha = fecha;
  }

  public String getHora() {
    return hora;
  }

  public void setHora(String hora) {
    this.hora = hora;
  }

  public String getAfeccion() {
    return afeccion;
  }

  public void setAfeccion(String afeccion) {
    this.afeccion = afeccion;
  }

}
