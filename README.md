# Estructura de Datos: Pila (Stack) de Estudiantes en Java Spring Boot

Este proyecto implementa la estructura de datos **Pila (Stack)** utilizando exclusivamente **arreglos estáticos nativos de Java** en el marco de una aplicación web construida con **Spring Boot**.

---

## 👥 Datos del Estudiante
* **Nombre:** Juan Antonio Moya
* **Correo:** est.juanantonio.moya.ob@unifranz.edu.bo
* **Materia:** Estructura de Datos (EDA-311)

---

## Cómo ejecutar el proyecto Spring Boot (CMD / Terminal)

1. Abre la consola en la raíz de la carpeta del proyecto.

2. Ejecuta el siguiente comando según tu sistema operativo:

   mvnw spring-boot:run

3. Una vez que veas en la consola el mensaje `Started ... Application in X seconds`, la aplicación estará activa y disponible en `http://localhost:8080`.

---

## Procedimiento de Prueba y Ejemplos de Uso

Sigue esta secuencia en tu navegador para verificar el correcto funcionamiento LIFO de la Pila:

* **Obtener Tamaño Inicial:**
* http://localhost:8080/api/v1/tamanyo# Estructura de Datos: Pila (Stack) de Estudiantes en Java Spring Boot

Este proyecto implementa la estructura de datos **Pila (Stack)** utilizando exclusivamente **arreglos estáticos nativos de Java** en el marco de una aplicación web construida con **Spring Boot**.

---

## 👥 Datos del Estudiante
* **Nombre:** Juan Antonio Moya
* **Correo:** est.juanantonio.moya.ob@unifranz.edu.bo
* **Materia:** Estructura de Datos (EDA-311)

---

## Cómo ejecutar el proyecto Spring Boot (CMD / Terminal)

1. Abre la consola en la raíz de la carpeta del proyecto.

2. Ejecuta el siguiente comando según tu sistema operativo:

   mvnw spring-boot:run

3. Una vez que veas en la consola el mensaje `Started ... Application in X seconds`, la aplicación estará activa y disponible en `http://localhost:8080`.

---

## Procedimiento de Prueba y Ejemplos de Uso

Sigue esta secuencia en tu navegador para verificar el correcto funcionamiento LIFO de la Pila:

* **Obtener Tamaño Inicial:**
# Estructura de Datos: Pila (Stack) de Estudiantes en Java Spring Boot

Este proyecto implementa la estructura de datos **Pila (Stack)** utilizando exclusivamente **arreglos estáticos nativos de Java** en el marco de una aplicación web construida con **Spring Boot**.

---

## 👥 Datos del Estudiante
* **Nombre:** Juan Antonio Moya
* **Correo:** est.juanantonio.moya.ob@unifranz.edu.bo
* **Materia:** Estructura de Datos (EDA-311)

---

## Cómo ejecutar el proyecto Spring Boot (CMD / Terminal)

1. Abre la consola en la raíz de la carpeta del proyecto.

2. Ejecuta el siguiente comando según tu sistema operativo:
```cmd
    mvnw spring-boot:run
```

3. Una vez que veas en la consola el mensaje `Started ... Application in X seconds`, la aplicación estará activa y disponible en `http://localhost:8080`.

---

## Procedimiento de Prueba y Ejemplos de Uso

Sigue esta secuencia en tu navegador para verificar el correcto funcionamiento LIFO de la Pila:

* **Obtener Tamaño Inicial:**
 ```cmd
     http://localhost:8080/api/v1/tamanyo
```
* **Insertar Primer Estudiante:**
```cmd
     http://localhost:8080/api/v1/insertar?codigo=101&nombres=Juan Antonio&apellidos=Moya Oblitas &email=est.juanantonio.moya.ob@unifranz.edu.bo&fechaNacimiento=2005-08-09&genero=M
```
* **Insertar Segundo Estudiante:**
```cmd
      http://localhost:8080/api/v1/insertar?codigo=102&nombres=Dabeyba Jessica&apellidos=Perez Chura&email=JessiPerez@email.com&fechaNacimiento=2006-05-12&genero=F
```
* **Ver Pila:**
```cmd
     http://localhost:8080/api/v1/ver
```
* **Eliminar (Desapilar):**
```cmd
     http://localhost:8080/api/v1/eliminar
```

