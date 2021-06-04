/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_juanmembreno;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class maestros {
   private String nombre;
   private String apellido;
   private String numregistro;
   private String titulo;
   private String titulopostgrado;
   private String cantidad;
   private String facultad;
    private String usuario;
    private String contraseña;
    private ArrayList<projectos> projectos;

    public maestros() {
    }

    public maestros(String nombre, String apellido, String numregistro, String titulo, String titulopostgrado, String cantidad, String facultad, String usuario, String contraseña) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numregistro = numregistro;
        this.titulo = titulo;
        this.titulopostgrado = titulopostgrado;
        this.cantidad = cantidad;
        this.facultad = facultad;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public maestros(String nombre, String apellido, String numregistro, String titulo, String titulopostgrado, String cantidad, String facultad, String usuario, String contraseña, ArrayList<projectos> projectos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numregistro = numregistro;
        this.titulo = titulo;
        this.titulopostgrado = titulopostgrado;
        this.cantidad = cantidad;
        this.facultad = facultad;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.projectos = projectos;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumregistro() {
        return numregistro;
    }

    public void setNumregistro(String numregistro) {
        this.numregistro = numregistro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulopostgrado() {
        return titulopostgrado;
    }

    public void setTitulopostgrado(String titulopostgrado) {
        this.titulopostgrado = titulopostgrado;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public ArrayList<projectos> getProjectos() {
        return projectos;
    }

    public void setProjectos(ArrayList<projectos> projectos) {
        this.projectos = projectos;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "maestros{" + "nombre=" + nombre + ", apellido=" + apellido + ", numregistro=" + numregistro + ", titulo=" + titulo + ", titulopostgrado=" + titulopostgrado + ", cantidad=" + cantidad + ", facultad=" + facultad + ", projectos=" + projectos + '}';
    }
    
}
