package com.example.tareaextraclase1;

/**
 * La clase persona es un objeto con atributos String nombre,String provincia y int Edad.Sus metodos son getters y setters de los atritubutos y un print de los mismos
 * @author Kendall Fernández
 */
public class Persona {
    private String nombre;
    private String provincia;
    private int edad;

    /**
     * Contructor del objeto Persona
     * @param nombre Un String que se toma de un textfield de la interfaz
     * @param provincia Un String que se selecciona de una lista de opciones predefinidas en la interfaz
     * @param edad Un int que se toma de un textfield de la interfaz y se puede verificar
     */
    public Persona(String nombre, String provincia, int edad) {
        this.nombre = nombre;
        this.provincia = provincia;
        this.edad = edad;
    }

    /**
     * Metodo para devolver el nombre
     * @return Retorna el nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Cambia el nombre de persona aunque en este caso se cambia atraves de la interfaz
     * @param nombre El nuevo nombre a usar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Metodo para devolver la provincia
     * @return Retorna la provincia de la persona
     */
    public String getProvincia() {
        return provincia;
    }
    /**
     * Cambia la provincia de persona aunque en este caso se cambia atraves de la interfaz
     * @param provincia La nueva provincia a usar
     */
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    /**
     * Metodo para devolver la edad
     * @return Retorna la edad de la persona
     */
    public int getEdad() {
        return edad;
    }
    /**
     * Cambia la edad de persona aunque en este caso se cambia atraves de la interfaz
     * @param edad La nueva edad a usar
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Imprime la persona con sus atributos
     */
    public void printPersona() {
        System.out.println("Persona{nombre:"+this.nombre+",provincia:"+this.provincia+",edad:"+this.edad+"}");
    }
}

