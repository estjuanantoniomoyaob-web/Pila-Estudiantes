package com.Estructura_Pila_Estudiantes.estructura;

import org.springframework.stereotype.Component;

@Component
public class Pila {
    private Estudiante[] arreglo = new Estudiante[50];
    private int tope = -1;

    public void agregar(Estudiante estudiante) {
        if (tope == arreglo.length - 1) {
            return;
        }
        tope++;
        arreglo[tope] = estudiante;
    }

    public Estudiante quitar() {
        if (tope == -1) {
            return null;
        }
        Estudiante extraido = arreglo[tope];
        arreglo[tope] = null;
        tope--;
        return extraido;
    }

    public Estudiante[] mostrar() {
        int cantidad = tamanyo();
        Estudiante[] resultado = new Estudiante[cantidad];
        
        int pos = 0;
        for (int i = tope; i >= 0; i--) {
            resultado[pos] = arreglo[i];
            pos++;
        }
        return resultado;
    }

    public int tamanyo() {
        return tope + 1;
    }
}