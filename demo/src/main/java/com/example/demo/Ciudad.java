package com.example.demo;

import lombok.Data;

//Esta es la clase ciudad con sus constructores lleno y vacio, getters y setters
@Data
public class Ciudad {
    private String nombre;
    private int numeroHabitantes;

    public Ciudad() {
    }

    public Ciudad(String nombre, int numeroHabitantes) {
        this.nombre = nombre;
        this.numeroHabitantes = numeroHabitantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroHabitantes() {
        return numeroHabitantes;
    }

    public void setNumeroHabitantes(int numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
    }
}
