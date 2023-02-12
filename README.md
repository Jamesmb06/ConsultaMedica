
# Taller final.2 - Consulta Medica

---

### ¿Cómo correr el proyecto?
> 1. Posterior a clonar este repositorio en su ordenador, abrir el IDE de preferencia (en este caso se usó IntelliJ IDEA) y buscar la opción run.

### Desarrollo del proyecto
> 1. Se identiciaron las entidades involucradas en el sistema en este caso Cita, Historial, Paciente, luego se procede a identificar las caracteristicas
 y acciones comunes.
> 2. Identificar interfaces y los métodos de la api.
> 5. Definir la estructura y los controladores
> 6. Definir estructura del api.
> 7. Definir controladores.

### Estructura de las carpetas
> - Model: Clases abstractas y principales de la api.
> - controller: Controladores para recibir peticiones del api.
> - services: Interfaces contienen los métodos abstractos, estos comportamientos son aplicados solo por las clases que implementen la interface.
> - repository: Clases para los metodos de los datos.

## Documentación de la API

---

### Para registrar un paciente:
localhost:8080/pacientes/post

Tipo (Paciente)
```json
{
    "nombre": "Juan",
    "apellido": "Pérez",
    "telefono": "555-555-5555",
    "cedula": "123-456-789"
}
```

### Para mirar pacientes registrados:
localhost:8080/pacientes/get

---

### Registrar citas:

localhost:8080/cita/post

Tipo (Cita)
```json
{
    "id": "1",
    "paciente": {
        "nombre": "Maria",
        "apellido": "Gonzalez",
        "telefono": "555-555-5555",
        "cedula": "123-456-789"
    },
    "fechaHora": "2023-02-12T10:30:00"
}


```

### Consultar citas registradas:

localhost:8080/cita/post

---

### ----------------------


Tipo ------------
```json
{
------------
}
```

---

### ----------------
-----------------

Tipo -------------
```json
{
  --------------
}
```

### ----------------

---



## Patrones de diseño aplicados:

Se utiliza la arquitectura de Capas, Las clases services estan marcadas con la anotacion @Service lo que indica que son clases que proporcionan servicios 
a la aplicación.
las clases Repository están marcadas con la anotación @Repository, lo que indica que son clases que se encargan de la persistencia de datos.
las clases de servicio y repositorio dependen de las interfaces, lo que les permite ser intercambiables y fácilmente modificables sin afectar el resto
de la aplicación.
Se Usa List almacenar colecciones de objetos. en la clase PacienteRepository la propiedad pacientes tiene que es una lista de objetos de tipo Paciente.
La clase PacienteService también utiliza una lista de pacientes en su método listPacientes para devolver todos los pacientes registrados en el repositorio.

