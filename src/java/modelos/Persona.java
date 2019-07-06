/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Administrator
 */
public class Persona {
 
    private int id;
    private String docente;
    private String s_academico;
    private int horas_semanales;

    public Persona() {
    }

    public Persona(int id, String docente, String s_academico, int horas_semanales) {
        this.id = id;
        this.docente = docente;
        this.s_academico = s_academico;
        this.horas_semanales = horas_semanales;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public String getS_academico() {
        return s_academico;
    }

    public void setS_academico(String s_academico) {
        this.s_academico = s_academico;
    }

    public int getHoras_semanales() {
        return horas_semanales;
    }

    public void setHoras_semanales(int horas_semanales) {
        this.horas_semanales = horas_semanales;
    }
    
}
