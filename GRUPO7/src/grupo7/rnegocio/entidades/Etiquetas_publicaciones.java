/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo7.rnegocio.entidades;

import java.util.*;
public class Etiquetas_publicaciones {
    private int id_ep;
    private Etiquetas etiquetas;
    private Publicaciones publicaciones;
    private Date creado;
    private Date actualizado;

    public Etiquetas_publicaciones() {
    }

    public Etiquetas_publicaciones(int id_ep, Etiquetas etiquetas, Publicaciones publicaciones, Date creado, Date actualizado) {
        this.id_ep = id_ep;
        this.etiquetas = etiquetas;
        this.publicaciones = publicaciones;
        this.creado = creado;
        this.actualizado = actualizado;
    }

    public int getId_ep() {
        return id_ep;
    }

    public void setId_ep(int id_ep) {
        this.id_ep = id_ep;
    }

    public Etiquetas getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(Etiquetas etiquetas) {
        this.etiquetas = etiquetas;
    }

    public Publicaciones getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(Publicaciones publicaciones) {
        this.publicaciones = publicaciones;
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

