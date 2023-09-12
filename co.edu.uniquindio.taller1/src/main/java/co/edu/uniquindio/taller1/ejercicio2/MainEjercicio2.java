package co.edu.uniquindio.taller1.ejercicio2;

import co.edu.uniquindio.taller1.model.Atraccion;
import co.edu.uniquindio.taller1.model.Visitantes;


public class MainEjercicio2 {

    public static void main(String[] args) {

        Atraccion atraccion1 = new Atraccion ("montaña rusa", "10:00 a.m - 6:00 p.m", "es un tipo de atracción basado en un sistema de raíles que forman una o varías vías que suben y bajan en circuitos",4, "Bajo",130 );
        Atraccion atraccion2 = new Atraccion ("montaña acuatica","10:00 a.m - 5:00 p.m","es un tipo de atracción basado en la inmersion acuatica", 10 , "Medio", 130 );
        Atraccion atraccion3 = new Atraccion ("botes acuaticos","10:00 a.m - 5:00 p.m","botes chocones en el lago", 3 , "Bajo", 90 );
        Atraccion atraccion4 = new Atraccion ("cumbre", "8:00 a.m - 6:00 p.m", "es un tipo de atracción basado en un sistema de raíles suben y bajan", 11 , "Alto", 90 );
        Atraccion atraccion5 = new Atraccion ("karts","8:00 a.m - 5:00 p.m", "es un tipo de atracción basado en carreras de carros",11 , "Alto",80 );
        Atraccion atraccion6 = new Atraccion ("Barco", "10:00 a.m - 6:00 p.m","es un tipo de atracción en forma de bote",3 , "Bajo",80 );
        Atraccion atraccion7 = new Atraccion ("pulpo","8:00 a.m - 6:00 p.m","es un tipo de atracción que da giros", 18 ,"Alto",70 );
        Atraccion atraccion8 = new Atraccion ("krater","8:00 a.m - 6:00 p.m","es un tipo de atracción basado que sube y baja", 18 , "Alto",90 );
        Atraccion atraccion9 = new Atraccion ("rapidos","10:00 a.m - 6:00 p.m","es un tipo de atracción que simula la corriente del rio",11 , "Bajo",120 );
        Atraccion atraccion10 = new Atraccion ("toro mecanico","10:00 a.m - 5:00 p.m","es un tipo de atraccióno que simula el movimiento de un toro",18 , "Alto",120 );
        Visitantes visitante1 = new Visitantes ("Carla", "Rosales",15, "12345", "Adolecente", "Femenino",  55.6);
        Visitantes visitante2 = new Visitantes ("Fernanda","Cano", 26, "5684", "Adulto", "Femenino",65.2);
        Visitantes visitante3 = new Visitantes ("Juan", "Rios",  7, "0012345", "Niño", "Masculino",40.0);
        Visitantes visitante4 = new Visitantes ("Elena","Torres",76, "00125", "Adulto","Femenino",86.7);
        Visitantes visitante5 = new Visitantes ("Marina","Cataño",65, "29185","Adulto", "Femenino",75.6);
        Visitantes visitante6 = new Visitantes ( "Jose", "Restrepo", 57,"5412","Adulto","Masculino",98.7);
        Visitantes visitante7 = new Visitantes ( "Ruben", "Ruiz",15, "98742","Adulto","Masculino",60.2);
        Visitantes visitante8 = new Visitantes ("Daniel", "Duque",47, "81475","Adulto","Masculino",117.2);
        Visitantes visitante9 = new Visitantes ( "Marcela","Tovar",45,"33258","Adulto","Femenina",78.2);
        Visitantes visitante10 = new Visitantes ( "Maria",  "Rosales", 9,"12345","Niño","Femenina",40);

    }
