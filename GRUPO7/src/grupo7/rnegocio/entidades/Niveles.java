/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo7.rnegocio.entidades;

import java.util.*;
public class Niveles {
    private int id_n;
    private String nombre;
    private Date creado;
    private Date actualizado; 

    public Niveles() {
    }

    public Niveles(int id_n, String nombre, Date creado, Date actualizado) {
        this.id_n = id_n;
        this.nombre = nombre;
        this.creado = creado;
        this.actualizado = actualizado;
    }

    public int getId_n() {
        return id_n;
    }

    public void setId_n(int id_n) {
        this.id_n = id_n;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getCreado() {
        return creado;
    }

    public void setCreado(Date creado) {
        this.creado = creado;
    }

    public Date getActualizado() {
        return actualizado;
    }

    public void setActualizado(Date actualizado) {
        this.actualizado = actualizado;
    } 
}
