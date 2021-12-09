package com.example.ApiContacto.Modelos;

import org.springframework.data.annotation.Id;

public class ContactoModelo {
    @Id
    private Long id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    //private String direccion;
    //private String etiqueta;
    
    public class di{
        String adres;
        String label;
    }


    public Long getId() {
        return id;
    }
    //public String getEtiqueta() {
    //    return etiqueta;
    //}
    //public void setEtiqueta(String etiqueta) {
      //  this.etiqueta = etiqueta;
    //}
    public void setId(Long id) {
        this.id = id;
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
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    //public String getDireccion() {
        //return direccion;
    //}
    //public void setDireccion(String direccion) {
    //        this.direccion = direccion;
    //}
    
}
