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
public class Jugadores {

    /*
    Jugadores: tienen nombre, apellido, nacionalidad, edad, numero de jugador,
cantidad de partidos jugados (0 por defecto), cantidad de copas ganadas con el
club (0 por defecto), cantidad de tarjetas amarillas y tarjetas rojas totales
(ambos 0 por defecto) y años de duración de su contrato actual. 
     */
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private String edad;
    private String numjugador;
    private String cantjugados;//cantidad de partidos jugados (0 por defecto)
    private String cantcopas;//cantidad de copas ganadas con el club (0 por defecto)
    private String cantamarillas;//cantidad de tarjetas amarillas (ambos 0 por defecto)
    private String cantrojas;//cantidad de tarjetas rojas (ambos 0 por defecto)
    private String yearduracion;//años de duración de su contrato actual.

    public Jugadores() {
    }

    public Jugadores(String nombre, String apellido, String nacionalidad, String edad, String numjugador, String cantjugados, String cantcopas, String cantamarillas, String cantrojas, String yearduracion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.numjugador = numjugador;
        this.cantjugados = cantjugados;
        this.cantcopas = cantcopas;
        this.cantamarillas = cantamarillas;
        this.cantrojas = cantrojas;
        this.yearduracion = yearduracion;
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

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getNumjugador() {
        return numjugador;
    }

    public void setNumjugador(String numjugador) {
        this.numjugador = numjugador;
    }

    public String getCantjugados() {
        return cantjugados;
    }

    public void setCantjugados(String cantjugados) {
        this.cantjugados = cantjugados;
    }

    public String getCantcopas() {
        return cantcopas;
    }

    public void setCantcopas(String cantcopas) {
        this.cantcopas = cantcopas;
    }

    public String getCantamarillas() {
        return cantamarillas;
    }

    public void setCantamarillas(String cantamarillas) {
        this.cantamarillas = cantamarillas;
    }

    public String getCantrojas() {
        return cantrojas;
    }

    public void setCantrojas(String cantrojas) {
        this.cantrojas = cantrojas;
    }

    public String getYearduracion() {
        return yearduracion;
    }

    public void setYearduracion(String yearduracion) {
        this.yearduracion = yearduracion;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
