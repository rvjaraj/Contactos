/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.appdis.testejb.entidades;

import java.io.Serializable;

import java.util.List;



public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;
  
   
    private Integer id;
    
    private String cedula;
    
    private String nombre;
    
    private List<Telefono> listTelefonos;

    public Persona() {
    }

    public Persona(Integer id) {
        this.id = id;
    }

    public Persona(String cedula, String nombre) {
        
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public Persona(Integer id, String cedula, String nombre, List<Telefono> telefonoCollection) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.listTelefonos = telefonoCollection;
    }
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

     public List<Telefono> getListTelefonos() {
        return listTelefonos;
    }

    public void setListTelefonos(List<Telefono> listTelefonos) {
        this.listTelefonos = listTelefonos;
    }

    
   

    @Override
    public String toString() {
        return "ec.edu.ups.appdis.testejb.entidades.Persona[ id=" + id + " ]";
    }
    
}
