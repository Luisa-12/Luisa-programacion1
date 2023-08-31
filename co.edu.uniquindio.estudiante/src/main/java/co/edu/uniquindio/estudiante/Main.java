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

        double notaPromedioE1 = calcularNotaDefinitivaEstudiante(estudiante1.getNota1(), estudiante1.getNota2(), estudiante1.getNota3());
        double notaPromedioE2 = calcularNotaDefinitivaEstudiante(estudiante2.getNota1(), estudiante2.getNota2(), estudiante2.getNota3());
        double notaPromedioE3 = calcularNotaDefinitivaEstudiante(estudiante3.getNota1(), estudiante3.getNota2(), estudiante3.getNota3());

        System.out.println("La nota promedio del estudiante 1 es: " + notaPromedioE1);
        System.out.println("La nota promedio del estudiante 2 es: " + notaPromedioE2);
        System.out.println("La nota promedio del estudiante 3 es: " + notaPromedioE3);

        //Funcion para calcular promedio del curso

        double promedioCurso = calcularPromedioCurso(notaPromedioE1, notaPromedioE2, notaPromedioE3);
        System.out.println("El promedio del curso es: " + promedioCurso);


        // Funcion para crear el promedio de edad

        int promedioEdad = calcularPromedioEdad(estudiante1.getEdad(), estudiante2.getEdad(), estudiante3.getEdad());
        System.out.println(("El promedio de edad es: " + promedioEdad));

        //     Funcion para calcular el promedio de la nota1 de los estudiantes

        double promedioNota1 = calcularPromedioNota1(estudiante1.getNota1(), estudiante2.getNota1(), estudiante3.getNota1());

        System.out.println("El promedio de la Nota 1 es: " + promedioNota1);

        // Funcion para calcular la nota mayor del curso

        double notaMayor = obtenerNotaMayor(notaPromedioE1, notaPromedioE2, notaPromedioE3);

        System.out.println("La nota mas alta del curso es: " + notaMayor);


        //Funcion para calcular la nota menor del curso

        double notaMenor = obtenerNotaMenor(notaPromedioE1, notaPromedioE2, notaPromedioE3);

        System.out.println("La nota mas baja del curso es: " + notaMenor);

        //Funcion para verificar si el estudiante aprobo el curso

        String aprobo = aproboCurso(notaPromedioE1);

        System.out.println("El estudiante " + aprobo + " el curso");

        //Funcion para obtener el porcentaje de estudiantes que ganaron el curso

        double porcentaje = porcentajeAprobados(notaPromedioE1, notaPromedioE2, notaPromedioE3);

        System.out.println("El porcentaje de estudiantes que aprobaron es: " + porcentaje);

        // Funcion para calcular el porcentaje de los que perdieron el curso

        int cantidadReprobados = obtenerCantidadEstudiantesReprobados(notaPromedioE1, notaPromedioE2, notaPromedioE3);
        double porcentajeReprobados = calcularPorcentajePerdieronCurso(cantidadReprobados);
        System.out.println("El porcentaje de estudiantes que perdieron el curso es de: " + porcentajeReprobados);

        // Funcion para obtener el estudiante que obtuvo todas sus notas mayores o iguales a 4.0

        String estudianteNotaMayor4 = obtenerEstudianteNotasMayor4(estudiante1.getNota1(), estudiante1.getNota2(), estudiante1.getNota3(), estudiante2.getNota1(), estudiante2.getNota2(), estudiante2.getNota3(), estudiante3.getNota1(), estudiante3.getNota2(), estudiante3.getNota3());
        System.out.println("El estudiante que obtuvo todas sus notas mayores a 4.0 es: " + estudianteNotaMayor4);

        // Funcion que obtenga la nota maxima del estudiante 1

        double notaMaxEstudiante1 = notaMaximaE1(estudiante1.getNota1(), estudiante1.getNota2(), estudiante1.getNota3());
        System.out.println("La nota maxima del estudiante 1 es: " + notaMaxEstudiante1);

        // Funcion que obtenga la nota maxima del estudiante 2

        double notaMaxEstudiante2 = notaMaximaE2(estudiante2.getNota1(), estudiante2.getNota2(), estudiante2.getNota3());
        System.out.println("La nota maxima del estudiante 2 es: " + notaMaxEstudiante2);

        // Funcion que obtenga la nota maxima del estudiante 3

        double notaMaximaEstudiante3 = notaMaximaE3(estudiante3.getNota1(), estudiante3.getNota2(), estudiante3.getNota3());
        System.out.println("La nota maxima del estudiante 3 es: " + notaMaximaEstudiante3);
    }

    private static double calcularNotaDefinitivaEstudiante(double nota1, double nota2, double nota3) {
        double promedio = 0.0;
        promedio = (nota1 + nota2 + nota3) / 3.0;
        return promedio;
    }

    private static double calcularPromedioCurso(double notaPromedioE1, double notaPromedioE2, double notaPromedioE3) {
        double promedioCurso = 0.0;
        promedioCurso = (notaPromedioE1 + notaPromedioE2 + notaPromedioE3) / 3.0;
        return promedioCurso;
    }

    private static int calcularPromedioEdad(int edad, int edad2, int edad3) {
        int promedioEdad = 0;
        promedioEdad = (int) ((edad + edad2 + edad3) / 3.0);
        return promedioEdad;

    }

    private static double calcularPromedioNota1(double nota1E1, double nota1E2, double nota1E3) {
        double promedio = 0.0;
        promedio = (nota1E1 + nota1E2 + nota1E3) / 3.0;
        return promedio;

    }

    private static double obtenerNotaMayor(double notaPromedioE1, double notaPromedioE2, double notaPromedioE3) {
        double notaMayor = notaPromedioE1;

        if (notaPromedioE2 > notaMayor) {
            notaMayor = notaPromedioE2;
        }

        if (notaPromedioE3 > notaMayor) {
            notaMayor = notaPromedioE3;
        }

        return notaMayor;
    }

    private static double obtenerNotaMenor(double notaPromedioE1, double notaPromedioE2, double notaPromedioE3) {
        double notaMenor = notaPromedioE1;

        if (notaPromedioE2 < notaMenor) {
            notaMenor = notaPromedioE2;
        }

        if (notaPromedioE3 < notaMenor) {
            notaMenor = notaPromedioE3;
        }

        return notaMenor;
    }

    private static String aproboCurso(double notaPromedioE1) {
        double notaMinimaAprobatoria = 3.0;
        String aprobo = " ";
        if (notaPromedioE1 >= notaMinimaAprobatoria) {
            aprobo = "aprobó";
        } else {
            aprobo = "no aprobó";
        }
        return aprobo;
    }

    private static double porcentajeAprobados(double notaPromedioE1, double notaPromedioE2, double notaPromedioE3) {
        int estudiantesAprobados = 0;
        double notaMinimaAprobatoria = 3.0;

        if (notaPromedioE1 >= notaMinimaAprobatoria) {
            estudiantesAprobados = estudiantesAprobados + 1;
        }

        if (notaPromedioE2 >= notaMinimaAprobatoria) {
            estudiantesAprobados = estudiantesAprobados + 1;
        }

        if (notaPromedioE3 >= notaMinimaAprobatoria) {
            estudiantesAprobados = estudiantesAprobados + 1;
        }

        double porcentaje = (double) estudiantesAprobados / 3 * 100;
        return porcentaje;
    }


    private static int obtenerCantidadEstudiantesReprobados(double notaPromedioE1, double notaPromedioE2, double notaPromedioE3) {
        int reprobados = 0;

        if (notaPromedioE1 < 3.0) {
            reprobados = reprobados + 1;
        } else if (notaPromedioE2 < 3.0) {
            reprobados = reprobados + 1;
        } else if (notaPromedioE3 < 3.0) {
            reprobados = reprobados + 1;
        }
        return reprobados;
    }

    private static double calcularPorcentajePerdieronCurso(int cantidadReprobados) {
        double porcentaje = 0;
        porcentaje = (cantidadReprobados * 100) / 3.0;
        return porcentaje;

    }

    private static String obtenerEstudianteNotasMayor4(double E1Nota1, double E1Nota2, double E1Nota3, double E2Nota1, double E2Nota2, double E2Nota3, double E3Nota1, double E3Nota2, double E3Nota3) {
        String estudiante = "";

        if (E1Nota1 >= 4.0 && E1Nota2 >= 4.0 && E1Nota3 >= 4.0) {
            estudiante = "Juan";

        } else if (E2Nota1 >= 4.0 && E2Nota2 >= 4.0 && E2Nota3 >= 4.0) {
            estudiante = "Maria";

        } else if (E3Nota1 >= 4.0 && E3Nota2 >= 4.0 && E3Nota3 >= 4.0) {
            estudiante = "Pepe";
        } else {
            estudiante = "Ninguno";
        }
        return estudiante;
    }

    private static double notaMaximaE1(double nota1, double nota2, double nota3) {
        double notaMaxima = 0.0;

        if (nota1 > nota2 && nota1 > nota3) {
            notaMaxima = nota1;
        } else if (nota2 > nota1 && nota2 > nota3) {
            notaMaxima = nota2;
        } else {
            notaMaxima = nota3;
        }
        return notaMaxima;
    }

    private static double notaMaximaE2(double nota1, double nota2, double nota3) {
        double notaMaxima = 0.0;

        if (nota1 > nota2 && nota1 > nota3) {
            notaMaxima = nota1;
        } else if (nota2 > nota1 && nota2 > nota3) {
            notaMaxima = nota2;
        } else {
            notaMaxima = nota3;
        }
        return notaMaxima;
    }

    private static double notaMaximaE3(double nota1, double nota2, double nota3) {
        double notaMaxima = 0.0;

        if (nota1 > nota2 && nota1 > nota3) {
            notaMaxima = nota1;
        } else if (nota2 > nota1 && nota2 > nota3) {
            notaMaxima = nota2;
        } else {
            notaMaxima = nota3;
        }
        return notaMaxima;
    }
}