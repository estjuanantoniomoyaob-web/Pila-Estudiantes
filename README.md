# Estructura de Datos: Pila (Stack) de Estudiantes en Java Spring Boot

Este proyecto implementa la estructura de datos **Pila (Stack)** utilizando exclusivamente **arreglos estáticos nativos de Java** (sin el uso de `ArrayList` ni colecciones dinámicas) en el marco de una aplicación web construida con **Spring Boot**.

## 👥 Datos del Estudiante
* **Nombre:** Juan Antonio Moya
* **Materia:** Estructura de Datos (EDA-311)
* **Proyecto:** Implementación de Pila con Arreglos Fijos

---

## 📌 Descripción del Proyecto

El objetivo es gestionar una pila de objetos de tipo `Estudiante` aplicando el principio **LIFO** (*Last In, First Out* — Último en entrar, primero en salir). La capacidad máxima del arreglo estático está definida en **50 elementos**.

### Atributos del Estudiante
Cada objeto `Estudiante` almacena las siguientes propiedades:
1. `codigo` (String)
2. `nombres` (String)
3. `apellidos` (String)
4. `email` (String)
5. `fechaNacimiento` (String)
6. `genero` (char)

---

## ⚙️ Estructura del Código

* **`com.Estructura_Pila_Estudiantes.estructura.Pila`**: Contiene la lógica interna de la Pila basada en un arreglo de tamaño fijo (`Estudiante[]`).
* **`com.Estructura_Pila_Estudiantes.controladores.Endpoints`**: Expone las rutas HTTP (endpoints REST) para interactuar con la pila desde un navegador o cliente HTTP.
* **`com.Estructura_Pila_Estudiantes.estructura.Estudiante`**: Clase modelo que define la entidad estudiante.
* **`com.Estructura_Pila_Estudiantes.estructura.PilaEstudiantesApplication`**: Clase principal encargada de arrancar la aplicación de Spring Boot.

---

## 🛠️ Operaciones de la Pila (Endpoints)

Todas las peticiones están expuestas bajo el prefijo `/api/v1`:

| Operación | Método | Endpoint / URL | Descripción |
| :--- | :--- | :--- | :--- |
| **Insertar** | `GET` | `/api/v1/insertar?codigo=...&nombres=...` | Agrega (empuja) un nuevo estudiante al tope de la pila. |
| **Eliminar** | `GET` | `/api/v1/eliminar` | Remueve y retorna el estudiante ubicado en el tope de la pila. |
| **Ver Pila** | `GET` | `/api/v1/ver` | Muestra el estado actual de la pila en orden LIFO. |
| **Tamaño** | `GET` | `/api/v1/tamanyo` | Retorna la cantidad actual de elementos en la pila. |

---

## 🚀 Cómo ejecutar el proyecto

1. Abrir la terminal integrada en la raíz del proyecto.
2. Compilar y ejecutar la aplicación con el comando:
   ```bash
   ./mvnw spring-boot:run