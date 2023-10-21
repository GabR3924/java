package com.example;

public class TiposD {

    public static void main(String[] arg){

        //1 numericos

        //1.1 enteros
        byte variable = 4;         //La diferencia entre estos
        short var2 = 10;           //tipos de variables es la capacidad
        int var3 = 30;             //siendo long la que mas capacidad tiene
        long var4 = 100;           //y byte la que menos

        //decimales
        float var5 = 5.5f;         //al igual que en los enteros doublw tiene mayor capacidad
        double var6 = 10.5d;       //que float. la f y la d al final de cada uno es para
        /*indicar que es o float (f) o double (d),los decimales siempre se escriben con . no con , */

        //booleanos
        boolean var7 = false;
        var7 = true;

        //texto
        char var8 = 'a';
        String var9 = "lorem ipsum dolor sit amet..";  //esto en realidad es una clase, por eso
        /*empieza con mayuscula, y las comillas dobles son obligatorias al crear un string
        si no lo marca como error*/
    }
}
