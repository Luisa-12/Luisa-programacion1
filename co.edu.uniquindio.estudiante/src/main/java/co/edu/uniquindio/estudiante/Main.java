package co.edu.uniquindio.estudiante;

import co.edu.uniquindio.estudiante.model.Estudiante;

public class Main {
    public static void main(String[] args) {
    // 3 estudiantes
    Estudiante estudiante1 = new Estudiante();
    estudiante1.setNombre("Juan");
    estudiante1.setEdad(17);
    estudiante1.setCorreo("juan@mail.com");
    estudiante1.setSemestre(3);
    estudiante1.setNota1(3.0);
    estudiante1.setNota2(3.5);
    estudiante1.setNota3(4.5);

    Estudiante estudiante2 = new Estudiante();
    estudiante2.setNombre("Maria");
    estudiante2.setEdad(15);
    estudiante2.setCorreo("pepita@mail.com");
    estudiante2.setSemestre(1);
    estudiante2.setNota1(2.0);
    estudiante2.setNota2(2.5);
    estudiante2.setNota3(4.5);

    Estudiante estudiante3 = new Estudiante();
    estudiante3.setNombre("pepe");
    estudiante3.setEdad(20);
    estudiante3.setCorreo("pepe@mail.com");
    estudiante3.setSemestre(4);
    estudiante3.setNota1(4.0);
    estudiante3.setNota2(2.5);
    estudiante3.setNota3(4.5);

    // Funcion para calcular la Nota definitiva los estudiantes

    double notaPromedioE1 = calcularNotaDefinitivaEstudiante(estudiante1.getNota1(),estudiante1.getNota2(), estudiante1.getNota3());
    double notaPromedioE2 = calcularNotaDefinitivaEstudiante(estudiante2.getNota1(),estudiante2.getNota2(), estudiante2.getNota3());
    double notaPromedioE3 = calcularNotaDefinitivaEstudiante(estudiante3.getNota1(),estudiante3.getNota2(), estudiante3.getNota3());

    System.out.println("La nota promedio del estudiante 1 es: "+notaPromedioE1);
    System.out.println("La nota promedio del estudiante 2 es: "+notaPromedioE2);
    System.out.println("La nota promedio del estudiante 3 es: "+notaPromedioE3);

    //Funcion para calcular promedio del curso

    double promedioCurso = calcularPromedioCurso(notaPromedioE1, notaPromedioE2, notaPromedioE3);
    System.out.println("El promedio del curso es: "+promedioCurso);


    // Funcion para crear el promedio de edad

    int promedioEdad = calcularPromedioEdad (estudiante1.getEdad(), estudiante2.getEdad(), estudiante3.getEdad());
    System.out.println(("El promedio de edad es: "+promedioEdad));

//     Funcion para calcular el promedio de la nota1 de los estudiantes

    double promedioNota1 = calcularPromedioNota1(estudiante1.getNota1(), estudiante2.getNota1(), estudiante3.getNota1());

    System.out.println("El promedio de la Nota 1 es: "+promedioNota1);

    }

    private static double calcularNotaDefinitivaEstudiante(double nota1, double nota2, double nota3) {
        double promedio = 0.0;
        promedio = (nota1 + nota2 + nota3)/3.0;
        return promedio;
    }

    private static double calcularPromedioCurso(double notaPromedioE1, double  notaPromedioE2, double  notaPromedioE3 ) {
        double promedioCurso = 0.0;
        promedioCurso = (notaPromedioE1+notaPromedioE2+notaPromedioE3)/3.0;
        return promedioCurso;
    }

    private static int calcularPromedioEdad (int edad, int edad2, int edad3) {
        int promedioEdad = 0;
        promedioEdad = (int) ((edad+edad2+edad3)/3.0);
        return promedioEdad;

    }
    private static double calcularPromedioNota1(double nota1E1, double nota1E2, double nota1E3) {
        double promedio = 0.0;
        promedio = (nota1E1+nota1E2+nota1E3)/3.0;
        return promedio;

    }

}