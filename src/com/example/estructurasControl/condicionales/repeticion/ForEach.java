package com.example.estructurasControl.condicionales.repeticion;

public class ForEach {

    public static  void main(String[] args){

        for (int i = 0; i <= 10; i++){
//            System.out.println("hola" + i);
        }

        //Array
        String[] nombres = {"Pepe", "juan", "Luz"};
        int[] numeros = {1, 3, 6, 9};

        //forEach
        for (String nombre : nombres){
//            System.out.println(nombre);
        }

        int suma = 0;
        for (int numero : numeros){
            System.out.println(numero);
            suma += numero;
        }
        System.out.println(suma);
    }
}
