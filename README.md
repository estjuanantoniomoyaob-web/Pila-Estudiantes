# Estructura de Datos: Pila (Stack) de Estudiantes en Java Spring Boot

Este proyecto implementa la estructura de datos **Pila (Stack)** utilizando exclusivamente **arreglos estáticos nativos de Java** (de tamaño fijo y sin colecciones dinámicas como `ArrayList`). Todo está expuesto mediante una interfaz REST web usando **Spring Boot**.

---

## 👥 Datos del Estudiante
* **Nombre:** Juan Antonio Moya
* **Correo Institucional:** est.juanantonio.moya.ob@unifranz.edu.bo
* **Materia:** Estructura de Datos (EDA-311)
* **Universidad:** Unifranz

---

## 📌 Descripción de la Pila

Una **Pila** es una estructura de datos lineal que sigue el principio **LIFO** (*Last In, First Out*), lo que significa que el **último elemento en ingresar es el primero en salir**.

El arreglo estático de esta pila está limitado a un máximo de **50 elementos**. Cada elemento es un objeto de la clase `Estudiante` que almacena:
* `codigo`: Identificador único del estudiante.
* `nombres`: Nombre(s) del estudiante.
* `apellidos`: Apellido(s) del estudiante.
* `email`: Correo electrónico.
* `fechaNacimiento`: Fecha de nacimiento (`YYYY-MM-DD`).
* `genero`: Género (`M` o `F`).

---

## 🛠️ Explicación Detallada de los Enlaces (URLs / Endpoints)

Una vez que la aplicación está ejecutándose localmente (`http://localhost:8080`), puedes probar y verificar el funcionamiento de la pila ingresando las siguientes URLs directamente en la barra de direcciones de tu navegador:

### 1. Consultar Tamaño Actual de la Pila
Muestra la cantidad total de estudiantes almacenados en ese momento.
* **Método:** `GET`
* **URL:** `http://localhost:8080/api/v1/tamanyo`
* **Ejemplo de Respuesta:** `Tamanyo: 0`

---

### 2. Insertar (Apilar / Push) un Estudiante
Para insertar un registro en la Pila, se envían los atributos del estudiante como parámetros de consulta en la URL mediante el uso de `?` y `&`.

* **Método:** `GET`
* **Estructura de la URL:**
  `http://localhost:8080/api/v1/insertar?codigo=VALOR&nombres=VALOR&apellidos=VALOR&email=VALOR&fechaNacimiento=VALOR&genero=VALOR`

* **Ejemplo de uso en el navegador (Copiar y pegar):**
  ```text
  http://localhost:8080/api/v1/insertar?codigo=101&nombres=Juan&apellidos=Moya&email=est.juanantonio.moya.ob@unifranz.edu.bo&fechaNacimiento=2000-01-01&genero=M
