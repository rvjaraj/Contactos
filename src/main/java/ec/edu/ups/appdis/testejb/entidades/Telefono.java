/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.appdis.testejb.entidades;

import java.io.Serializable;


public class Telefono implements Serializable {
    

    private static final long serialVersionUID = -558553967080513790L;
    
    private Integer id;
    
   
    private int numero;
    
   
    private String tipo;
    
   
    private Persona personaId;

    public Telefono() {
    }

    public Telefono(Integer id) {
        this.id = id;
    }

    public Telefono(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }

    public Telefono(Integer id, int numero, String tipo, Persona personaId) {
        this.id = id;
        this.numero = numero;
        this.tipo = tipo;
        this.personaId = personaId;
    }
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Persona getPersonaId() {
        return personaId;
    }

    public void setPersonaId(Persona personaId) {
        this.personaId = personaId;
    }

  
   
    @Override
    public String toString() {
        return "ec.edu.ups.appdis.testejb.entidades.Telefono[ id=" + id + " ]";
    }
    
}
