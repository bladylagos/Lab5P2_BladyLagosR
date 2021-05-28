/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Gerardo Lagos
 */
public class Entrenadores {

    private String nombree;
    private String apellidoe;
    private String nacionalidade;
    private String edade;
    private String yearcontratoe;//años de contrato como entrenador
    private String cantcopase;

    public Entrenadores() {
    }

    public Entrenadores(String nombree, String apellidoe, String nacionalidade, String edade, String yearcontratoe, String cantcopase) {
        this.nombree = nombree;
        this.apellidoe = apellidoe;
        this.nacionalidade = nacionalidade;
        this.edade = edade;
        this.yearcontratoe = yearcontratoe;
        this.cantcopase = cantcopase;
    }

    public String getNombree() {
        return nombree;
    }

    public void setNombree(String nombree) {
        this.nombree = nombree;
    }

    public String getApellidoe() {
        return apellidoe;
    }

    public void setApellidoe(String apellidoe) {
        this.apellidoe = apellidoe;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getEdade() {
        return edade;
    }

    public void setEdade(String edade) {
        this.edade = edade;
    }

    public String getYearcontratoe() {
        return yearcontratoe;
    }

    public void setYearcontratoe(String yearcontratoe) {
        this.yearcontratoe = yearcontratoe;
    }

    public String getCantcopase() {
        return cantcopase;
    }

    public void setCantcopase(String cantcopase) {
        this.cantcopase = cantcopase;
    }

    public String toString() {
        return nombree;
    }

}
