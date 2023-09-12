package co.edu.uniquindio.taller1.model;

public class Atraccion {

    private String nombre;
    private String horario_operacion;
    private String descripcion;
    private int rango_edad;
    private String nivel_peligro;
    private int peso_maxi_permitido;

    public Atraccion(String nombre, String horario_operacion, String descripcion, int rango_edad, String nivel_peligro, int peso_maxi_permitido) {
        this.nombre = nombre;
        this.horario_operacion = horario_operacion;
        this.descripcion = descripcion;
        this.rango_edad = rango_edad;
        this.nivel_peligro = nivel_peligro;
        this.peso_maxi_permitido = peso_maxi_permitido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHorario_operacion() {
        return horario_operacion;
    }

    public void setHorario_operacion(String horario_operacion) {
        this.horario_operacion = horario_operacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getRango_edad() {
        return rango_edad;
    }

    public void setRango_edad(int rango_edad) {
        this.rango_edad = rango_edad;
    }

    public String getNivel_peligro() {
        return nivel_peligro;
    }

    public void setNivel_peligro(String nivel_peligro) {
        this.nivel_peligro = nivel_peligro;
    }

    public int getPeso_maxi_permitido() {
        return peso_maxi_permitido;
    }

    public void setPeso_maxi_permitido(int peso_maxi_permitido) {
        this.peso_maxi_permitido = peso_maxi_permitido;
    }
}
