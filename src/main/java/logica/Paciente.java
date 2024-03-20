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
public class Paciente extends Persona implements Serializable {

    private boolean imss;
    private String tipo_sangre;
    @OneToOne
    private Responsable responsable;
    @OneToMany(mappedBy = "paciente")
    private List<Turno> turnos;

    public Paciente() {
    }

    public Paciente(boolean imss, String tipo_sangre, Responsable responsable, List<Turno> turnos, int id, String nombre, Date fecha_nac, String telefono, String direccion) {
        super(id, nombre, fecha_nac, telefono, direccion);
        this.imss = imss;
        this.tipo_sangre = tipo_sangre;
        this.responsable = responsable;
        this.turnos = turnos;
    }

    public boolean isImss() {
        return imss;
    }

    public String getTipo_sangre() {
        return tipo_sangre;
    }

    public Responsable getResponsable() {
        return responsable;
    }

    public List<Turno> getTurnos() {
        return turnos;
    }

    public void setImss(boolean imss) {
        this.imss = imss;
    }

    public void setTipo_sangre(String tipo_sangre) {
        this.tipo_sangre = tipo_sangre;
    }

    public void setResponsable(Responsable responsable) {
        this.responsable = responsable;
    }

    public void setTurnos(List<Turno> turnos) {
        this.turnos = turnos;
    }

}
