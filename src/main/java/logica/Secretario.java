/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 *
 * @author ADRIAN
 */
@Entity
public class Secretario extends Persona implements Serializable {

    private String sector;
    @OneToOne
    private Usuario usuario;

    public Secretario() {
    }

    public Secretario(String sector, Usuario usuario, int id, String nombre, Date fecha_nac, String telefono, String direccion) {
        super(id, nombre, fecha_nac, telefono, direccion);
        this.sector = sector;
        this.usuario = usuario;
    }

    public String getSector() {
        return sector;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
