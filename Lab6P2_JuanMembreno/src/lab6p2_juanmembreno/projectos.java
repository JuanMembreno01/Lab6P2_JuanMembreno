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
public class projectos {

    private String titulo;
    private String descripcion;
    private String puntuacion;
    private String niveldificultad;
    private String duracion;
    private String cantidadparticipantes;
    private String fecha;

    public projectos() {
    }

    public projectos(String titulo, String descripcion, String puntuacion, String niveldificultad, String duracion, String cantidadparticipantes, String fecha) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.puntuacion = puntuacion;
        this.niveldificultad = niveldificultad;
        this.duracion = duracion;
        this.cantidadparticipantes = cantidadparticipantes;
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(String puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getNiveldificultad() {
        return niveldificultad;
    }

    public void setNiveldificultad(String niveldificultad) {
        this.niveldificultad = niveldificultad;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getCantidadparticipantes() {
        return cantidadparticipantes;
    }

    public void setCantidadparticipantes(String cantidadparticipantes) {
        this.cantidadparticipantes = cantidadparticipantes;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    

}
