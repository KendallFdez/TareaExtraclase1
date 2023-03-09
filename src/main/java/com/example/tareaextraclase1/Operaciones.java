package com.example.tareaextraclase1;

/**
 * La clase Operaciones se encarga de realizar las operaciones matematicas necesarias pora el proyecto con las edades de las personas
 * @author Kendall Fernández
 */
public class Operaciones {

    /**
     * Suma las edades de las personas
     * @param num1 Edad de la primera persona
     * @param num2 Edad de la segunda persona
     * @return Retorna la suma de las dos edaddes
     */
    public static int sumar(int num1, int num2) {
        int result = num1 + num2;
        System.out.println(String.valueOf(result));
        return result;
    }
    /**
     * Resta las edades de las personas
     * @param num1 Edad de la primera persona
     * @param num2 Edad de la segunda persona
     * @return Retorna la resta de las dos edaddes
     */
    public static int restar(int num1, int num2) {
        int result = num1 - num2;
        System.out.println(String.valueOf(result));
        return result;
    }
    /**
     * Multiplica las edades de las personas
     * @param num1 Edad de la primera persona
     * @param num2 Edad de la segunda persona
     * @return Retorna la multiplicación de las dos edaddes
     */
    public static int multiplicar(int num1, int num2) {
        int result = num1 * num2;
        System.out.println(String.valueOf(result));
        return result;
    }
    /**
     * Divide las edades de las personas
     * @param num1 Edad de la primera persona
     * @param num2 Edad de la segunda persona
     * @return Retorna la división de las dos edaddes
     */
    public static int dividir(int num1, int num2) {
        int result = num1 / num2;
        System.out.println(String.valueOf(result));
        return result;
    }
}
