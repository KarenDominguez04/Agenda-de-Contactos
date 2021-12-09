package com.example.ApiContacto.Servicios;

import java.util.ArrayList;
import java.util.Optional;

import com.example.ApiContacto.Modelos.ContactoModelo;
import com.example.ApiContacto.Repositorios.ContactoRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactoServicio {
    @Autowired
    ContactoRepo repo;

    public ContactoModelo guardaContacto(ContactoModelo contacto){
        return repo.save(contacto);
    }
    public ArrayList<ContactoModelo> consultaTodos(){
        return(ArrayList<ContactoModelo>) repo.findAll();
    }
    public boolean eliminaContacto(String id){
        if (repo.existsById(id)){
            repo.deleteById(id);
            return true;
        }
        else{
            return false;
        }
    }
    public Optional<ContactoModelo> consultaContactoId(String id){
        return repo.findById(id);
    }
    public ArrayList<ContactoModelo> obtenerContactoPorNombres(String nombre){
        return repo.findByNombre(nombre);
    } 
    public ContactoModelo obtenerPorCorreo(String correo){
        return repo.findByCorreo(correo);
    }
    public ContactoModelo obtenerPorTelefono(String telefono) {
        return repo.findByTelefono(telefono);
    }
    public ContactoModelo obtenerPorEtiqueta(String etiqueta) {
        return repo.findByEtiqueta(etiqueta);
    }
}
