/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


/**
 *
 * @author kevin
 */
public class TipoHabitacion {
    
    private Integer id;
    private String descripcion;
    private Integer tarifa;
    private Integer Cantidad;

    public TipoHabitacion(Integer id, String descripcion, Integer tarifa, Integer Cantidad) {
        this.id = id;
        this.descripcion = descripcion;
        this.tarifa = tarifa;
        this.Cantidad = Cantidad;
    }

    public TipoHabitacion() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getTarifa() {
        return tarifa;
    }

    public void setTarifa(Integer tarifa) {
        this.tarifa = tarifa;
    }

    public Integer getCantidad() {
        return Cantidad;
    }

    public void setCantidad(Integer Cantidad) {
        this.Cantidad = Cantidad;
    }
    
    
    
}
