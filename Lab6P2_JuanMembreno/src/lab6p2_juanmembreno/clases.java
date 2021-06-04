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
public class clases {
    private String nombre;
    private String seccion;
    private String codigo;
    private String codigocarrera;
    private String cantidadalumnos;
    private String numaula;
    private ArrayList<projectos> projectos;
    private ArrayList<alumnos> alumnos;

    public clases() {
    }

    public clases(String nombre, String seccion, String codigo, String codigocarrera, String cantidadalumnos, String numaula) {
        this.nombre = nombre;
        this.seccion = seccion;
        this.codigo = codigo;
        this.codigocarrera = codigocarrera;
        this.cantidadalumnos = cantidadalumnos;
        this.numaula = numaula;
    }

    public clases(String nombre, String seccion, String codigo, String codigocarrera, String cantidadalumnos, String numaula, ArrayList<projectos> projectos, ArrayList<alumnos> alumnos) {
        this.nombre = nombre;
        this.seccion = seccion;
        this.codigo = codigo;
        this.codigocarrera = codigocarrera;
        this.cantidadalumnos = cantidadalumnos;
        this.numaula = numaula;
        this.projectos = projectos;
        this.alumnos = alumnos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigocarrera() {
        return codigocarrera;
    }

    public void setCodigocarrera(String codigocarrera) {
        this.codigocarrera = codigocarrera;
    }

    public String getCantidadalumnos() {
        return cantidadalumnos;
    }

    public void setCantidadalumnos(String cantidadalumnos) {
        this.cantidadalumnos = cantidadalumnos;
    }

    public String getNumaula() {
        return numaula;
    }

    public void setNumaula(String numaula) {
        this.numaula = numaula;
    }

    public ArrayList<projectos> getProjectos() {
        return projectos;
    }

    public void setProjectos(ArrayList<projectos> projectos) {
        this.projectos = projectos;
    }

    public ArrayList<alumnos> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<alumnos> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "clases{" + "nombre=" + nombre + ", seccion=" + seccion + ", codigo=" + codigo + ", codigocarrera=" + codigocarrera + ", cantidadalumnos=" + cantidadalumnos + ", numaula=" + numaula + ", projectos=" + projectos + ", alumnos=" + alumnos + '}';
    }
    
}
