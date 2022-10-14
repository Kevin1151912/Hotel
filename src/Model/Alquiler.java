/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Date;

/**
 *
 * @author kevin
 */
public class Alquiler {
    
    private Integer id;
    private Integer cantidad;
    private Date fecha;
    private Usuario us;
    private TipoHabitacion tH;

    public Alquiler(Integer id, Integer cantidad, Date fecha, Usuario us, TipoHabitacion tH) {
        this.id = id;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.us = us;
        this.tH = tH;
    }

    public Alquiler() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Usuario getUs() {
        return us;
    }

    public void setUs(Usuario us) {
        this.us = us;
    }

    public TipoHabitacion gettH() {
        return tH;
    }

    public void settH(TipoHabitacion tH) {
        this.tH = tH;
    }
    
    
    
}
