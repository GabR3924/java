package com.example;

public class Operadores {

    public static void main(String[] args){

        //Aritmeticos
        int num1 = 10;
        int num2 = 20;
        int result = num1 + num2;   //se puede cambiar el nombre de la variable utilizando refactor, de esta manera el nombre cambien en todos los lugares en donde se este utilizando

        System.out.println(result);
        System.out.println(result + 5.77);

        int resta = num1 - num2;

        System.out.println("resta");
        System.out.println(resta);

        /*
        Comparacion
        - > Mayor que
        - < menir que
        - >= Mayor igual que
        - <= menor igual que
        - == igual que
        el triple igual === solo esta en js, aqui no se necesita pq el lenguaje es fuertemente tipado So ya viene por defecto
        */

        boolean res = num1 > num2;

        System.out.println(res);

        /*
        lOGICOS
        -and
        -&& (ampersan)
        -or
        -||*/

        boolean result3 = num1 > 5 && num1 < 30;

        System.out.println("result3");
        System.out.println(result3);

        int edad = 17;
        boolean carnet = edad > 15 && edad <= 26;

        System.out.println("carnet");
        System.out.println(carnet);
    }
}
