/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo7.rnegocio.entidades;

import java.util.*;
public class Publicaciones {
   private int id_e;
    private Usuarios usuarios;
    private Niveles niveles;
    private String titulo;
    private String contenido;
    private int publicado;
    private int vistas;
    private Double votos;
    private Date creado;
    private Date actualizado; 

    public Publicaciones() {
    }

    public Publicaciones(int id_e, Usuarios usuarios, Niveles niveles, String titulo, String contenido, int publicado, int vistas, Double votos, Date creado, Date actualizado) {
        this.id_e = id_e;
        this.usuarios = usuarios;
        this.niveles = niveles;
        this.titulo = titulo;
        this.contenido = contenido;
        this.publicado = publicado;
        this.vistas = vistas;
        this.votos = votos;
        this.creado = creado;
        this.actualizado = actualizado;
    }

    public int getId_e() {
        return id_e;
    }

    public void setId_e(int id_e) {
        this.id_e = id_e;
    }

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

    public Niveles getNiveles() {
        return niveles;
    }

    public void setNiveles(Niveles niveles) {
        this.niveles = niveles;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getPublicado() {
        return publicado;
    }

    public void setPublicado(int publicado) {
        this.publicado = publicado;
    }

    public int getVistas() {
        return vistas;
    }

    public void setVistas(int vistas) {
        this.vistas = vistas;
    }

    public Double getVotos() {
        return votos;
    }

    public void setVotos(Double votos) {
        this.votos = votos;
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
