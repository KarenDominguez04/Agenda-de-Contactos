package com.example.ApiContacto.Repositorios;

import java.util.ArrayList;

import com.example.ApiContacto.Modelos.ContactoModelo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactoRepo extends MongoRepository<ContactoModelo, String> {
    ContactoModelo findByEtiqueta(String etiqueta);
    ArrayList<ContactoModelo> findByNombre(String nombre);
    ContactoModelo findByCorreo(String correo);
    ContactoModelo findByTelefono(String telefono);
}
