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
public class Psicologos {

    private String nombres;
    private String apellidos;
    private String nacionalidads;
    private String edads;
    private String tituloUs;
    private String ids;
    private String especialidads;
    private String cantinformess;
    private String cantjugadoress;

    public Psicologos() {
    }

    public Psicologos(String nombres, String apellidos, String nacionalidads, String edads, String tituloUs, String ids, String especialidads, String cantinformess, String cantjugadoress) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.nacionalidads = nacionalidads;
        this.edads = edads;
        this.tituloUs = tituloUs;
        this.ids = ids;
        this.especialidads = especialidads;
        this.cantinformess = cantinformess;
        this.cantjugadoress = cantjugadoress;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNacionalidads() {
        return nacionalidads;
    }

    public void setNacionalidads(String nacionalidads) {
        this.nacionalidads = nacionalidads;
    }

    public String getEdads() {
        return edads;
    }

    public void setEdads(String edads) {
        this.edads = edads;
    }

    public String getTituloUs() {
        return tituloUs;
    }

    public void setTituloUs(String tituloUs) {
        this.tituloUs = tituloUs;
    }

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public String getEspecialidads() {
        return especialidads;
    }

    public void setEspecialidads(String especialidads) {
        this.especialidads = especialidads;
    }

    public String getCantinformess() {
        return cantinformess;
    }

    public void setCantinformess(String cantinformess) {
        this.cantinformess = cantinformess;
    }

    public String getCantjugadoress() {
        return cantjugadoress;
    }

    public void setCantjugadoress(String cantjugadoress) {
        this.cantjugadoress = cantjugadoress;
    }

    public String toString() {
        return nombres;
    }
}
