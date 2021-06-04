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
public class administraprojectos {
          private ArrayList<projectos> projectos = new ArrayList();
    private File archivo = null;

    public administraprojectos() {
    }
    
    public administraprojectos(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<projectos> getListaclases() {
        return projectos;
    }

    public void setListaclases(ArrayList<projectos> listaprojectos) {
        this.projectos = listaprojectos;
    }

    @Override
    public String toString() {
        return "projectos=" + projectos;
    }

    //extra mutador
    public void setPersona(projectos p) {
        this.projectos.add(p);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (projectos t : projectos) {
                bw.write(t.getTitulo()+ ";");
                bw.write(t.getDescripcion()+ ";");
                bw.write(t.getPuntuacion()+ ";");
                bw.write(t.getNiveldificultad()+ ";");
                bw.write(t.getDuracion()+ ";");
                bw.write(t.getCantidadparticipantes()+ ";");
                bw.write(t.getFecha()+ ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        projectos = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    projectos.add(new projectos(sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next()));
                    
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
}
