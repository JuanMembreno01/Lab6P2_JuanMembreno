/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_juanmembreno;

/**
 *
 * @author usuario
 */
public class alumnos {
    private String nombre;
    private String apellido;
    private String edad;
    private String numregistro;
    private String id;
    private String carrera;
    private String año;
    private String promedio;
    private String facultad;
    private String usuario;
    private String contraseña;

    public alumnos() {
    }

    public alumnos(String nombre, String apellido, String edad, String numregistro, String id, String carrera, String año, String promedio, String facultad, String usuario, String contraseña) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.numregistro = numregistro;
        this.id = id;
        this.carrera = carrera;
        this.año = año;
        this.promedio = promedio;
        this.facultad = facultad;
        this.usuario = usuario;
        this.contraseña = contraseña;
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

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getNumregistro() {
        return numregistro;
    }

    public void setNumregistro(String numregistro) {
        this.numregistro = numregistro;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getPromedio() {
        return promedio;
    }

    public void setPromedio(String promedio) {
        this.promedio = promedio;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
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
        return nombre;
    }
    
    
}
