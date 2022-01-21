package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

//Desde este controlador se llama al servicio para almacenar una ciudad
@RestController
public class Controlador1 {

    //Creo un objeto servicio
    @Autowired
    Servicio s;

    //A partir de la informacion proporcionada en la cabecera obtengo los datos que enviar al servicio para que guarde
    //la ciudad correspondientes
    @PostMapping("/controlador1/addCiudad")
    public void addCiudad(@RequestHeader (value="nombre") String nombre, @RequestHeader (value = "habitantes") int habitantes){
        s.createCiudad(nombre, habitantes);
    }
}
