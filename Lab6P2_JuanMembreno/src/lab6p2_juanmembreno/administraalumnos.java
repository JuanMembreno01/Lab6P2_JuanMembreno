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
public class administraalumnos {

    private ArrayList<alumnos> alumnos = new ArrayList();
    private File archivo = null;

    public administraalumnos() {
    }

    public administraalumnos(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<alumnos> getListaalumnos() {
        return alumnos;
    }

    public void setListaalumnos(ArrayList<alumnos> listaalumnos) {
        this.alumnos = listaalumnos;
    }

    @Override
    public String toString() {
        return "alumnos=" + alumnos;
    }

    //extra mutador
    public void setPersona(alumnos p) {
        this.alumnos.add(p);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (alumnos t : alumnos) {
                bw.write(t.getNombre() + ";");
                bw.write(t.getApellido() + ";");
                bw.write(t.getEdad() + ";");
                bw.write(t.getNumregistro() + ";");
                bw.write(t.getId() + ";");
                bw.write(t.getCarrera() + ";");
                bw.write(t.getAño() + ";");
                bw.write(t.getPromedio() + ";");
                bw.write(t.getFacultad() + ";");
                bw.write(t.getUsuario() + ";");
                bw.write(t.getContraseña() + ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        alumnos = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    alumnos.add(new alumnos(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(),sc.next(), sc.next(),sc.next(), sc.next()));

                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
}
