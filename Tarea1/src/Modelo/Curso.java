/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author PaulaJCh
 */
public class Curso {
    private String nombre;
    private String siglas;
    private String creditos;

    public Curso(String nombre, String siglas, String creditos) {
        this.nombre = nombre;
        this.siglas = siglas;
        this.creditos = creditos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public String getCreditos() {
        return creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }
    
     public String getInformacion(){
      return " Nombre: "+nombre+" Siglas "+siglas+" Créditos "+creditos;
  }   
}
