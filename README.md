Tarea: Concurso de Natación – Programación
Orientada a Objetos en Java- consola
Enunciado:
Desarrolla un sistema en Java que gestione la inscripción de participantes para un concurso
de natación, aplicando los principios de la Programación Orientada a Objetos (POO).
Todos los participantes deben registrarse con los siguientes atributos comunes:
- Nombre
- Edad
- Género
- Condición de salud (buena o no)
- Tipo de entidad (colegio, universidad, empresa pública, empresa privada o sindicato)
Solo podrán participar personas que cumplan con los siguientes requisitos:
- Tener entre 18 y 25 años
- Estar en buena condición de salud
Cada tipo de entidad debe agregarse como una subclase de Participante, y debe incluir un
atributo propio (por ejemplo: nombre del colegio, nombre de la empresa, tipo de sindicato,
etc.).
-----------------------------------------------------------------------------------------------
Clases y su descripción

Participante:	Clase base. Contiene atributos comunes y la validación puedeParticipar().
ParticipanteColegio: Subclase. Hereda de Participante y agrega nombreColegio.

ParticipanteUniversidad: Subclase. Hereda de Participante y agrega nombreUniversidad.
ParticipanteEmpresa: Subclase. Hereda de Participante y agrega tipoEmpresa y nombreEmpresa.
ParticipanteSindicato: Subclase. Hereda de Participante y agrega tipoSindicato.
ConcursoNatacion: Clase principal (con main). Controla el menú, entradas y muestra datos.

Resumen del Código Completo del Concurso de Natación
El código implementa un sistema orientado a objetos para registrar participantes en un concurso de natación, diferenciándolos por su procedencia: colegio, universidad, empresa o sindicato. Está compuesto por una clase base (padre), varias subclases (hijas) que heredan de ella, y una clase principal que contiene el menú interactivo para gestionar la aplicación.

 CLASE PADRE: Participante
Es la clase base (abstracta o general) de la jerarquía.
Contiene los atributos comunes: nombre, edad, género, buenaSalud, tipoEntidad.
Tiene un método puedeParticipar() que determina si un participante está apto (mayor de edad y en buena salud).
El método getInfo() devuelve la información básica del participante.
Justificación: Esta clase concentra las propiedades y comportamientos comunes a todos los tipos de participantes, lo que evita duplicación de código.

 CLASES HIJAS (SUBCLASES):
Cada una hereda de Participante y representa un tipo específico con su propia información adicional.
ParticipanteColegio
Atributo propio: nombreColegio.
Sobrescribe getInfo() para agregar el nombre del colegio.
ParticipanteUniversidad
Atributo propio: nombreUniversidad.
ParticipanteEmpresa
Atributos propios: tipoEmpresa y nombreEmpresa.

ParticipanteSindicato
Atributo propio: tipoSindicato.

Justificación: Cada subclase extiende la funcionalidad base para incluir información específica según el origen del participante, usando herencia y polimorfismo (con @Override de getInfo()).
 
 CLASE PRINCIPAL: ConcursoNatacion
Contiene el método main con un menú interactivo.
Permite al usuario:

-	Registrar nuevos participantes.
-	Ver todos los registrados.
-	Ver solo los aptos.
-	Salir del sistema.

Usa una lista List<Participante> para almacenar todos los objetos, sin importar su subtipo.

Crea dinámicamente la instancia de la subclase correspondiente según la opción del usuario.

Justificación: Esta clase controla el flujo de ejecución del programa. Mediante polimorfismo, puede almacenar diferentes tipos de participantes en una única colección y tratarlos de forma uniforme.

Este diseño aplica correctamente los principios de Programación Orientada a Objetos:
-	Abstracción (modelo común),
-	Encapsulamiento (datos y comportamiento),
-	Herencia (evitar repetición),
-	Polimorfismo (manejo flexible de objetos).
