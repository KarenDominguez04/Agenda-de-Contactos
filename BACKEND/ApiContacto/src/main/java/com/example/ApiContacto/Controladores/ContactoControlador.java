package com.example.ApiContacto.Controladores;

import java.util.ArrayList;
import java.util.Optional;

import com.example.ApiContacto.Modelos.ContactoModelo;
import com.example.ApiContacto.Servicios.ContactoServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST,RequestMethod.DELETE})
@RequestMapping("/contacto")
public class ContactoControlador {
    @Autowired
    ContactoServicio serv;
    @PostMapping
    public ContactoModelo guardaContacto(@RequestBody ContactoModelo contacto){
        return serv.guardaContacto(contacto);
    }
    @GetMapping()
    public ArrayList<ContactoModelo> consultaTodos(){
        return serv.consultaTodos();
    }
    @DeleteMapping(path = "/{id}")
    public boolean eliminaContacto(@PathVariable("id") Long id){
        return serv.eliminaContacto(id);
    }
    @GetMapping(path = "/{id}")
    public Optional<ContactoModelo> consultaPorId(@PathVariable("id")Long id){
        return serv.consultaContactoId(id);
    }
    @GetMapping(path = "buscar/{nombre}")
    public ArrayList<ContactoModelo> obtenerPorNombre(@PathVariable("nombre") String nombre){
        return serv.obtenerContactoPorNombres(nombre);
    }
    @GetMapping(path = "/buscacorreo/{correo}")
    public ContactoModelo obtenerPorCorreo(@PathVariable("correo") String correo){
        return serv.obtenerPorCorreo(correo);
    }
    @GetMapping(path = "/telefono/{telefono}")
    public ContactoModelo obtenerPorTelefono(@PathVariable("telefono") String telefono){
        return serv.obtenerPorTelefono(telefono);
    }
    @GetMapping(path = "/etiqueta/{etiqueta}")
    public ContactoModelo obtenerPorEtiqueta(@PathVariable("etiqueta") String etiqueta){
        return serv.obtenerPorEtiqueta(etiqueta);
    }
}
