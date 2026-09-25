package com.Estructura_Pila_Estudiantes.controladores;

import org.springframework.web.bind.annotation.*;
import com.Estructura_Pila_Estudiantes.estructura.Pila;
import com.Estructura_Pila_Estudiantes.estructura.Estudiante;

@RestController
@RequestMapping("/api/v1")
public class Endpoints {

    Pila pilita = new Pila();

    @GetMapping("/insertar")
    public String insertar(
            @RequestParam String codigo,
            @RequestParam String nombres,
            @RequestParam String apellidos,
            @RequestParam String email,
            @RequestParam String fechaNacimiento,
            @RequestParam char genero) {
        
        Estudiante est = new Estudiante();
        est.codigo = codigo;
        est.nombres = nombres;
        est.apellidos = apellidos;
        est.email = email;
        est.fechaNacimiento = fechaNacimiento;
        est.genero = genero;

        pilita.agregar(est);
        return "Insertado: " + nombres + " " + apellidos;
    }

    @GetMapping("/eliminar")
    public String eliminar() {
        Estudiante eliminado = pilita.quitar();
        if (eliminado == null) {
            return "Pila vacia";
        }
        return "Eliminado: " + eliminado.nombres + " " + eliminado.apellidos;
    }

    @GetMapping("/ver")
    public Estudiante[] ver() {
        return pilita.mostrar();
    }

    @GetMapping("/tamanyo")
    public String tamanyo() {
        return "Tamanyo: " + pilita.tamanyo();
    }
}