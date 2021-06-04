/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_juanmembreno;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class administramaestros {
     private ArrayList<maestros> maestros = new ArrayList();
    private File archivo = null;

    public administramaestros() {
    }
    
    public administramaestros(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<maestros> getListamaestros() {
        return maestros;
    }

    public void setListaalumnos(ArrayList<maestros> listamaestros) {
        this.maestros = listamaestros;
    }

    @Override
    public String toString() {
        return "maestros=" + maestros;
    }

    //extra mutador
    public void setPersona(maestros p) {
        this.maestros.add(p);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (maestros t : maestros) {
                bw.write(t.getNombre()+ ";");
                bw.write(t.getApellido()+ ";");
                bw.write(t.getNumregistro()+ ";");
                bw.write(t.getTitulo()+ ";");
                bw.write(t.getTitulopostgrado()+ ";");
                bw.write(t.getCantidad()+ ";");
                bw.write(t.getFacultad()+ ";");
                bw.write(t.getUsuario()+ ";");
                bw.write(t.getContraseña()+ ";");
                bw.write(t.getProjectos()+ ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        maestros = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    maestros.add(new maestros(sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next()));
                    
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }

}
