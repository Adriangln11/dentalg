/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;

/**
 *
 * @author ADRIAN
 */
@Entity
public class Responsable extends Persona implements Serializable {

    private String tipo_resp;

    public Responsable() {
    }

    public Responsable(String tipo_resp, int id, String nombre, Date fecha_nac, String telefono, String direccion) {
        super(id, nombre, fecha_nac, telefono, direccion);
        this.tipo_resp = tipo_resp;
    }

    public String getTipo_resp() {
        return tipo_resp;
    }

    public void setTipo_resp(String tipo_resp) {
        this.tipo_resp = tipo_resp;
    }

}
