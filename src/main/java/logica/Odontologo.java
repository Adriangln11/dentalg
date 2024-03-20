/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author ADRIAN
 */
@Entity
public class Odontologo extends Persona implements Serializable {

    //private int id_odontologo;
    private String especialidad;
    @OneToMany(mappedBy = "odontologo")
    private List<Turno> turnos;
    @OneToOne
    private Usuario usuario;
    @OneToOne
    private Horario horario;

    public Odontologo() {
    }

    public Odontologo(String especialidad, List<Turno> turnos, Usuario usuario, Horario horario, int id, String nombre, Date fecha_nac, String telefono, String direccion) {
        super(id, nombre, fecha_nac, telefono, direccion);
        this.especialidad = especialidad;
        this.turnos = turnos;
        this.usuario = usuario;
        this.horario = horario;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public List<Turno> getTurnos() {
        return turnos;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setTurnos(List<Turno> turnos) {
        this.turnos = turnos;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

}
