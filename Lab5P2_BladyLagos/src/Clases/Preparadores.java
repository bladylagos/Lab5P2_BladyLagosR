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
public class Preparadores {

    private String nombrep;
    private String apellidop;
    private String nacionalidadp;
    private String edadp;
    private String idp;
    private String yearcontratop;
    private String especialidadp;
    private String nombretitulop;

    public Preparadores() {
    }

    public Preparadores(String nombrep, String apellidop, String nacionalidadp, String edadp, String idp, String yearcontratop, String especialidadp, String nombretitulop) {
        this.nombrep = nombrep;
        this.apellidop = apellidop;
        this.nacionalidadp = nacionalidadp;
        this.edadp = edadp;
        this.idp = idp;
        this.yearcontratop = yearcontratop;
        this.especialidadp = especialidadp;
        this.nombretitulop = nombretitulop;
    }

    public String getNombrep() {
        return nombrep;
    }

    public void setNombrep(String nombrep) {
        this.nombrep = nombrep;
    }

    public String getApellidop() {
        return apellidop;
    }

    public void setApellidop(String apellidop) {
        this.apellidop = apellidop;
    }

    public String getNacionalidadp() {
        return nacionalidadp;
    }

    public void setNacionalidadp(String nacionalidadp) {
        this.nacionalidadp = nacionalidadp;
    }

    public String getEdadp() {
        return edadp;
    }

    public void setEdadp(String edadp) {
        this.edadp = edadp;
    }

    public String getIdp() {
        return idp;
    }

    public void setIdp(String idp) {
        this.idp = idp;
    }

    public String getYearcontratop() {
        return yearcontratop;
    }

    public void setYearcontratop(String yearcontratop) {
        this.yearcontratop = yearcontratop;
    }

    public String getEspecialidadp() {
        return especialidadp;
    }

    public void setEspecialidadp(String especialidadp) {
        this.especialidadp = especialidadp;
    }

    public String getNombretitulop() {
        return nombretitulop;
    }

    public void setNombretitulop(String nombretitulop) {
        this.nombretitulop = nombretitulop;
    }

    public String toString() {
        return nombrep;
    }
}
