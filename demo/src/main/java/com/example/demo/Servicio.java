package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

//Este servicio se compone de un objeto ciudad y una lista que las va almacenando
@Service
public class Servicio {
    ArrayList<Ciudad> listaCiudad = new ArrayList<Ciudad>();
    Ciudad c;

    //A este método se le dan datos desde el controlador que se guardan en una ciudad para que esa ciudad se guarde
    //en la lista
    public void createCiudad(String nombre, int numeroHabitantes){
        c = new Ciudad();
        c.setNombre(nombre);
        c.setNumeroHabitantes(numeroHabitantes);
        listaCiudad.add(c);
    }

    //Este método devuelve la lita con todas las ciudades
    public ArrayList getCiudad(){
        return listaCiudad;
    }
}
