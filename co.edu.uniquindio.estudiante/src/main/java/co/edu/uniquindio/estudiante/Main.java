package co.edu.uniquindio.estudiante;

import co.edu.uniquindio.estudiante.model.estudiante;

public class Main {
    public static void main(String[] args) {
    // 3 estudiantes
    estudiante estudiante1 = new estudiante();
    estudiante1.setNombre("Juan");
    estudiante1.setEdad(17);
    estudiante1.setCorreo("juan@mail.com");
    estudiante1.setSemestre(3);
    estudiante1.setNota1(3.0);
    estudiante1.setNota2(3.5);
    estudiante1.setNota3(4.5);

    estudiante estudiante2 = new estudiante();
    estudiante2.setNombre("Maria");
    estudiante2.setEdad(15);
    estudiante2.setCorreo("pepita@mail.com");
    estudiante2.setSemestre(1);
    estudiante2.setNota1(2.0);
    estudiante2.setNota2(2.5);
    estudiante2.setNota3(4.5);

    estudiante estudiante3 = new estudiante();
    estudiante3.setNombre("pepe");
    estudiante3.setEdad(20);
    estudiante3.setCorreo("pepe@mail.com");
    estudiante3.setSemestre(4);
    estudiante3.setNota1(4.0);
    estudiante3.setNota2(2.5);
    estudiante3.setNota3(4.5);

    // Funcion para calcular la Nota definitiva los estudiantes

    calcularNotaDefinitivaEstudiante1(nota1,nota2,nota3);
    calcularNotaDefinitivaEstudiante2(nota1,nota2,nota3);
    calcularNotaDefinitivaEstudiante3(nota1,nota2,nota3);

    //Funcion para calcular promedio del curso

    calcularPromedioCcurso(NotaDefinitivaEstudiante1,NotaDefinitivaEstudiante2, NotaDefinitivaEstudiante3);

    // Funcion para crear el promedio de edad

    promedioEdad(edadEstudiante1,edadEstudiante2,edadEstudiante3);

    // Funcion para calcular el promedio de la nota1 de los estudiantes

    promedioNota1 (nota1Estudiante1, nota1Estudiante2, nota1Estudiante3);


    }

    














    }
}