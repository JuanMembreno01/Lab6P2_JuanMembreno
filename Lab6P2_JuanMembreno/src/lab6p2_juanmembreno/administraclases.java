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
public class administraclases {
       private ArrayList<clases> clases = new ArrayList();
    private File archivo = null;

    public administraclases() {
    }
    
    public administraclases(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<clases> getListaclases() {
        return clases;
    }

    public void setListaclases(ArrayList<clases> listaclases) {
        this.clases = listaclases;
    }

    @Override
    public String toString() {
        return "clases=" + clases;
    }

    //extra mutador
    public void setPersona(clases p) {
        this.clases.add(p);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (clases t : clases) {
                bw.write(t.getNombre()+ ";");
                bw.write(t.getNombre()+ ";");
                bw.write(t.getSeccion()+ ";");
                bw.write(t.getCodigo()+ ";");
                bw.write(t.getCodigocarrera()+ ";");
                bw.write(t.getCantidadalumnos()+ ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        clases = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    clases.add(new clases(sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next()));
                    
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
}
