package co.edu.uniquindio.taller1.ejercicio2;

import co.edu.uniquindio.taller1.model.Atraccion;
import co.edu.uniquindio.taller1.model.Visitantes;


public class MainEjercicio2 {

    public static void main(String[] args) {

        Atraccion atraccion1 = new Atraccion("montaña rusa", "10:00 a.m - 6:00 p.m", "es un tipo de atracción basado en un sistema de raíles que forman una o varías vías que suben y bajan en circuitos", 14, "Bajo", 130);
        Atraccion atraccion2 = new Atraccion("montaña acuatica", "10:00 a.m - 5:00 p.m", "es un tipo de atracción basado en la inmersion acuatica", 10, "Medio", 130);
        Atraccion atraccion3 = new Atraccion("botes acuaticos", "10:00 a.m - 5:00 p.m", "botes chocones en el lago", 3, "Bajo", 90);
        Atraccion atraccion4 = new Atraccion("cumbre", "8:00 a.m - 6:00 p.m", "es un tipo de atracción basado en un sistema de raíles suben y bajan", 11, "Alto", 90);
        Atraccion atraccion5 = new Atraccion("karts", "8:00 a.m - 5:00 p.m", "es un tipo de atracción basado en carreras de carros", 11, "Alto", 80);
        Atraccion atraccion6 = new Atraccion("Barco", "10:00 a.m - 6:00 p.m", "es un tipo de atracción en forma de bote", 3, "Bajo", 80);
        Atraccion atraccion7 = new Atraccion("pulpo", "8:00 a.m - 6:00 p.m", "es un tipo de atracción que da giros", 18, "Alto", 70);
        Atraccion atraccion8 = new Atraccion("krater", "8:00 a.m - 6:00 p.m", "es un tipo de atracción basado que sube y baja", 18, "Alto", 90);
        Visitantes visitante1 = new Visitantes("Carla", "Rosales", 15, "12345", "Adolecente", "Femenino", 55.6);
        Visitantes visitante2 = new Visitantes("Fernanda", "Cano", 26, "5684", "Adulto", "Femenino", 65.2);
        Visitantes visitante3 = new Visitantes("Juan", "Rios", 7, "0012345", "Niño", "Masculino", 40.0);
        Visitantes visitante4 = new Visitantes("Elena", "Torres", 76, "00125", "Adulto", "Femenino", 86.7);
        Visitantes visitante5 = new Visitantes("Marina", "Cataño", 65, "29185", "Adulto", "Femenino", 75.6);
        Visitantes visitante6 = new Visitantes("Jose", "Restrepo", 57, "5412", "Adulto", "Masculino", 98.7);
        Visitantes visitante7 = new Visitantes("Ruben", "Ruiz", 15, "98742", "Adulto", "Masculino", 60.2);
        Visitantes visitante8 = new Visitantes("Daniel", "Duque", 47, "81475", "Adulto", "Masculino", 117.2);


      /*1. Metodo que verifique dada la edad de un visitante a qué atracciones se puede subir*/

        String atraccionAptaEdad = obtenerAtraccionAptaEdad (atraccion1.getNombre(),atraccion2.getNombre(), atraccion3.getNombre(), atraccion4.getNombre(), atraccion5.getNombre(),atraccion6.getNombre(), atraccion7.getNombre(),atraccion8.getNombre();
        System.out.println(("Segun la edad del visitante , se puede montar a la atraccion:" +atraccionAptaEdad));

      /*2. Obtener el número de atracciones para niños y mostrar la información de cada atracción*/

        Integer cantidadAtraccionesNinios = obtenerCantidadAtraccionesNinos (atraccion1.getRango_edad(),atraccion2.getRango_edad(), atraccion3.getRango_edad(),atraccion4.getRango_edad(),atraccion5.getRango_edad(),atraccion6.getRango_edad(),atraccion7.getRango_edad(),atraccion8.getRango_edad();
        System.out.println(("La cantidad de Atracciones paraa Ninios son:" + cantidadAtraccionesNinios));

        /*2.1 Obtener la información de cada atracción*/

        String informacionAtraccion1 = obtenerInformacionAtraccion1(atraccion1.getNombre(),atraccion1.getHorario_operacion(), atraccion1.getRango_edad(), atraccion1.getNivel_peligro(), atraccion1.getPeso_maxi_permitido(), atraccion1.getDescripcion();
        System.out.println(("La atraccion escogida es:"+informacionAtraccion1));

        String informacionAtraccion2 = obtenerInformacionAtraccion2(atraccion2.getNombre(),atraccion2.getHorario_operacion(), atraccion2.getRango_edad(), atraccion2.getNivel_peligro(), atraccion2.getPeso_maxi_permitido(), atraccion2.getDescripcion();
        System.out.println(("La atraccion escogida es:"+informacionAtraccion2));

        String informacionAtraccion3 = obtenerInformacionAtraccion3(atraccion3.getNombre(),atraccion3.getHorario_operacion(), atraccion3.getRango_edad(), atraccion3.getNivel_peligro(), atraccion3.getPeso_maxi_permitido(), atraccion3.getDescripcion();
        System.out.println(("La atraccion escogida es:"+informacionAtraccion3));

        String informacionAtraccion4 = obtenerInformacionAtraccion4(atraccion4.getNombre(),atraccion4.getHorario_operacion(), atraccion4.getRango_edad(), atraccion4.getNivel_peligro(), atraccion4.getPeso_maxi_permitido(), atraccion4.getDescripcion();
        System.out.println(("La atraccion escogida es:"+informacionAtraccion4));

        String informacionAtraccion5 = obtenerInformacionAtraccion5(atraccion5.getNombre(),atraccion5.getHorario_operacion(), atraccion5.getRango_edad(), atraccion5.getNivel_peligro(), atraccion5.getPeso_maxi_permitido(), atraccion5.getDescripcion();
        System.out.println(("La atraccion escogida es:"+informacionAtraccion5));

        String informacionAtraccion6 = obtenerInformacionAtraccion6(atraccion6.getNombre(),atraccion6.getHorario_operacion(), atraccion6.getRango_edad(), atraccion6.getNivel_peligro(), atraccion6.getPeso_maxi_permitido(), atraccion6.getDescripcion();
        System.out.println(("La atraccion escogida es:"+informacionAtraccion6));

        String informacionAtraccion7 = obtenerInformacionAtraccion7(atraccion7.getNombre(),atraccion7.getHorario_operacion(), atraccion7.getRango_edad(), atraccion7.getNivel_peligro(), atraccion7.getPeso_maxi_permitido(), atraccion7.getDescripcion();
        System.out.println(("La atraccion escogida es:"+informacionAtraccion7));

        String informacionAtraccion8 = obtenerInformacionAtraccion8(atraccion8.getNombre(),atraccion8.getHorario_operacion(), atraccion8.getRango_edad(), atraccion8.getNivel_peligro(), atraccion8.getPeso_maxi_permitido(), atraccion8.getDescripcion();
        System.out.println(("La atraccion escogida es:"+informacionAtraccion8));

     /*Metodo para Obtener el visitante con mayor edad y que sea adulto*/

        String visitanteMayorEdad = obtenerVisitanteMayorEdad (visitante1.getEdad(),visitante2.getEdad(),visitante3.getEdad(),visitante4.getEdad(),visitante5.getEdad(),visitante6.getEdad(),visitante7.getEdad(),visitante8.getEdad();
        System.out.println(("El visitante de mayor edad es:" +visitanteMayorEdad));

     /*Obtener el visitante con mayor edad y que sea adolecente*/

        int esAdolecente1 = verificarSiVisitanteEsAdolecente(visitante1.getEdad());
        int esAdolecente2 = verificarSiVisitanteEsAdolecente(visitante2.getEdad());
        int esAdolecente3 = verificarSiVisitanteEsAdolecente(visitante3.getEdad());
        int esAdolecente4 = verificarSiVisitanteEsAdolecente(visitante4.getEdad());
        int esAdolecente5 = verificarSiVisitanteEsAdolecente(visitante5.getEdad());
        int esAdolecente6 = verificarSiVisitanteEsAdolecente(visitante6.getEdad());
        int esAdolecente7 = verificarSiVisitanteEsAdolecente(visitante7.getEdad());
        int esAdolecente8 = verificarSiVisitanteEsAdolecente(visitante8.getEdad());
        String visitanteMayorAdolecente = obtenervisitanteMayorAdolecente(esAdolecente1,esAdolecente2,esAdolecente3,esAdolecente4,esAdolecente5,esAdolecente6,esAdolecente7,esAdolecente8);
        System.out.println(("El visitante con mayor edad adolecente es:" +visitanteMayorAdolecente));

        /*Obtener el visitante con mayor edad y que sea ninio*/

        int esNinio1 = verificarSiVisitanteEsNinio(visitante1.getEdad());
        int esNinio2 = verificarSiVisitanteEsNinio(visitante2.getEdad());
        int esNinio3 = verificarSiVisitanteEsNinio(visitante3.getEdad());
        int esNinio4 = verificarSiVisitanteEsNinio(visitante4.getEdad());
        int esNinio5 = verificarSiVisitanteEsNinio(visitante5.getEdad());
        int esNinio6 = verificarSiVisitanteEsNinio(visitante6.getEdad());
        int esNinio7 = verificarSiVisitanteEsNinio(visitante7.getEdad());
        int esNinio8 = verificarSiVisitanteEsNinio(visitante8.getEdad());
        String visitanteMayorNinio = obtenervisitanteMayorNinio(esNinio1,esNinio2,esAdolecente3,esNinio4,esNinio5,esNinio6,esNinio7,esNinio8);
        System.out.println(("El visitante con mayor edad Ninio es:" +visitanteMayorNinio));

    }

    private static String obtenerAtraccionAptaEdad(String atraccion1, String atraccion2, String atraccion3, String atraccion4, String atraccion5, String atraccion6, String atraccion7, String atraccion8,Integer edad){

        String atraccion = "";

                if (edad>=3 && edad <=10) {
                    atraccion = atraccion2 + atraccion3 + atraccion6;
                } else if (edad>10 && edad<=17){
                    atraccion = atraccion1+atraccion2+atraccion3+atraccion4+atraccion5+atraccion6;
                } else
                    atraccion = atraccion1+atraccion2+atraccion3+atraccion4+atraccion5+atraccion6+atraccion7+atraccion8;

                return atraccion;
    }

    private static Integer obtenerCantidadAtraccionesNinos (Integer atraccion1, Integer atraccion2,Integer atraccion3, Integer atraccion4, Integer atraccion5, Integer atraccion6, Integer atraccion7, Integer atraccion8){
        int contadorAtraccionNinios = 0;

        if (atraccion1 <= 10) {
            contadorAtraccionNinios = contadorAtraccionNinios + 1;
        }

        if (atraccion2 <= 10) {
            contadorAtraccionNinios = contadorAtraccionNinios + 1;
        }

        if (atraccion3 <= 10) {
            contadorAtraccionNinios = contadorAtraccionNinios + 1;
        }

        if (atraccion4 <= 10) {
            contadorAtraccionNinios = contadorAtraccionNinios + 1;
        }

        if (atraccion5 <= 10) {
            contadorAtraccionNinios = contadorAtraccionNinios + 1;
        }

        if (atraccion6 <= 10) {
            contadorAtraccionNinios = contadorAtraccionNinios + 1;
        }

        if (atraccion7 <= 10) {
            contadorAtraccionNinios = contadorAtraccionNinios + 1;
        }

        if (atraccion8 <= 10) {
            contadorAtraccionNinios = contadorAtraccionNinios + 1;
        } else
            contadorAtraccionNinios = contadorAtraccionNinios;

        return contadorAtraccionNinios;
    }

    private static String obtenerInformacionAtraccion1(String nombre, String horario_operacion, String descripcion, int rango_edad, String nivel_peligro, int peso_maxi_permitido){
        String informacion = "";
        informacion = informacion + "\n" +
                "nombre: " + nombre + "\n" +
                "horario_operacion: " + horario_operacion + "\n" +
                "descripcion: " + descripcion + "\n" +
                "rango_edad: " + rango_edad + "\n" +
                "nivel_peligro: " + nivel_peligro + "\n" +
                "peso_maxi_permitido: " peso_maxi_permitido + "\n" ;

        return informacion;
    }

    private static String obtenerInformacionAtraccion2(String nombre, String horario_operacion, String descripcion, int rango_edad, String nivel_peligro, int peso_maxi_permitido){
        String informacion = "";
        informacion = informacion + "\n" +
                "nombre: " + nombre + "\n" +
                "horario_operacion: " + horario_operacion + "\n" +
                "descripcion: " + descripcion + "\n" +
                "rango_edad: " + rango_edad + "\n" +
                "nivel_peligro: " + nivel_peligro + "\n" +
                "peso_maxi_permitido: " + peso_maxi_permitido + "\n";

        return informacion;
    }

    private static String obtenerInformacionAtraccion3(String nombre, String horario_operacion, String descripcion, int rango_edad, String nivel_peligro, int peso_maxi_permitido){
        String informacion = "";
        informacion = informacion + "\n" +
                "nombre: " + nombre + "\n" +
                "horario_operacion: " + horario_operacion + "\n" +
                "descripcion: " + descripcion + "\n" +
                "rango_edad: " + rango_edad + "\n" +
                "nivel_peligro: " + nivel_peligro + "\n" +
                "peso_maxi_permitido: " + peso_maxi_permitido + "\n" ;

        return informacion;
    }

    private static String obtenerInformacionAtraccion4(String nombre, String horario_operacion, String descripcion, int rango_edad, String nivel_peligro, int peso_maxi_permitido){
        String informacion = "";
        informacion = informacion + "\n" +
                "nombre: " + nombre + "\n" +
                "horario_operacion: " + horario_operacion + "\n" +
                "descripcion: " + descripcion + "\n" +
                "rango_edad: " + rango_edad + "\n" +
                "nivel_peligro: " + nivel_peligro + "\n" +
                "peso_maxi_permitido: " + peso_maxi_permitido + "\n" ;

        return informacion;
    }

    private static String obtenerInformacionAtraccion5(String nombre, String horario_operacion, String descripcion, int rango_edad, String nivel_peligro, int peso_maxi_permitido){
        String informacion = "";
        informacion = informacion + "\n" +
                "nombre: " + nombre + "\n" +
                "horario_operacion: " + horario_operacion + "\n" +
                "descripcion: " + descripcion + "\n" +
                "rango_edad: " + rango_edad + "\n" +
                "nivel_peligro: " + nivel_peligro + "\n" +
                "peso_maxi_permitido: " + peso_maxi_permitido + "\n";

        return informacion;
    }

    private static String obtenerInformacionAtraccion6(String nombre, String horario_operacion, String descripcion, int rango_edad, String nivel_peligro, int peso_maxi_permitido){
        String informacion = "";
        informacion = informacion + "\n" +
                "nombre: " + nombre + "\n" +
                "horario_operacion: " + horario_operacion + "\n" +
                "descripcion: " + descripcion + "\n" +
                "rango_edad: " + rango_edad + "\n" +
                "nivel_peligro: " + nivel_peligro + "\n" +
                "peso_maxi_permitido: " + peso_maxi_permitido + "\n";

        return informacion;
    }

    private static String obtenerInformacionAtraccion7(String nombre, String horario_operacion, String descripcion, int rango_edad, String nivel_peligro, int peso_maxi_permitido){
        String informacion = "";
        informacion = informacion + "\n" +
                "nombre: " + nombre + "\n" +
                "horario_operacion: " + horario_operacion + "\n" +
                "descripcion: " + descripcion + "\n" +
                "rango_edad: " + rango_edad + "\n" +
                "nivel_peligro: " + nivel_peligro + "\n" +
                "peso_maxi_permitido: " + peso_maxi_permitido + "\n";

        return informacion;
    }

    private static String obtenerInformacionAtraccion8(String nombre, String horario_operacion, String descripcion, int rango_edad, String nivel_peligro, int peso_maxi_permitido){
        String informacion = "";
        informacion = informacion + "\n" +
                "nombre: " + nombre + "\n" +
                "horario_operacion: " + horario_operacion + "\n" +
                "descripcion: " + descripcion + "\n" +
                "rango_edad: " + rango_edad + "\n" +
                "nivel_peligro: " + nivel_peligro + "\n" +
                "peso_maxi_permitido: " + peso_maxi_permitido + "\n";

        return informacion;
    }

    private static String obtenerVisitanteMayorEdad(Integer edadVisitante1,Integer edadVisitante2,Integer edadVisitante3,Integer edadVisitante4,Integer edadVisitante5,Integer edadVisitante6,Integer edadVisitante7,Integer edadVisitante8){
        String visitanteMayorEdad = "";

        if (edadVisitante1 > edadVisitante2 && edadVisitante1 > edadVisitante3 && edadVisitante1 > edadVisitante4 && edadVisitante1 > edadVisitante5 && edadVisitante1 > edadVisitante6 && edadVisitante1 > edadVisitante7 && edadVisitante1 > edadVisitante8);
        visitanteMayorEdad = "Carla";

        else if (edadVisitante2 > edadVisitante1 && edadVisitante2 > edadVisitante3 && edadVisitante2 > edadVisitante4 && edadVisitante2 > edadVisitante5 && edadVisitante2 > edadVisitante6 && edadVisitante2 > edadVisitante7 && edadVisitante2 > edadVisitante8);
        visitanteMayorEdad = "Fernanda";

        else if (edadVisitante3 > edadVisitante1 && edadVisitante3 > edadVisitante2 && edadVisitante3 > edadVisitante4 && edadVisitante3 > edadVisitante5 && edadVisitante3 > edadVisitante6 && edadVisitante3 > edadVisitante7 && edadVisitante3 > edadVisitante8);
        visitanteMayorEdad = "Juan";

        else if (edadVisitante4 > edadVisitante1 && edadVisitante4 > edadVisitante2 && edadVisitante4 > edadVisitante3 && edadVisitante4 > edadVisitante5 && edadVisitante4 > edadVisitante6 && edadVisitante4 > edadVisitante7 && edadVisitante4 > edadVisitante8);
        visitanteMayorEdad = "Elena";

        else if (edadVisitante5 > edadVisitante1 && edadVisitante5 > edadVisitante2 && edadVisitante5 > edadVisitante3 && edadVisitante5 > edadVisitante4 && edadVisitante5 > edadVisitante6 && edadVisitante5 > edadVisitante7 && edadVisitante5 > edadVisitante8);
        visitanteMayorEdad = "Marina";

        else if (edadVisitante6 > edadVisitante1 && edadVisitante6 > edadVisitante2 && edadVisitante6 > edadVisitante3 && edadVisitante6 > edadVisitante4 && edadVisitante6 > edadVisitante5 && edadVisitante6 > edadVisitante7 && edadVisitante6 > edadVisitante8);
        visitanteMayorEdad = "Jose";

        else if (edadVisitante7 > edadVisitante1 && edadVisitante7 > edadVisitante2 && edadVisitante7 > edadVisitante3 && edadVisitante7 > edadVisitante4 && edadVisitante7 > edadVisitante5 && edadVisitante7 > edadVisitante6 && edadVisitante7 > edadVisitante8);
        visitanteMayorEdad = "Ruben";

        else if (edadVisitante8 > edadVisitante1 && edadVisitante8 > edadVisitante2 && edadVisitante8 > edadVisitante3 && edadVisitante8 > edadVisitante4 && edadVisitante8 > edadVisitante5 && edadVisitante8 > edadVisitante6 && edadVisitante8 > edadVisitante7);
        visitanteMayorEdad = "daniel";

        return visitanteMayorEdad;




