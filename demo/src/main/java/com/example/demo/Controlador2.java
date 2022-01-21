package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

//Este controlador se encarga de solicitar los datos guardados en el servicio
@RestController
public class Controlador2 {

    //Llamas al servicio
    @Autowired
    Servicio s;

    //Devuelves la lista guardada en el servicio
    @GetMapping("/controlador1/getCiudad")
    public ArrayList returnPersona(){
        return s.listaCiudad;
    }
}
