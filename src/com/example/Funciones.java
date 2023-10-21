package com.example;

public class Funciones {

    public static void main(String[] args){
        //opcion1: funcion sin parametro y sin tipo de retorno
//            showMenu();
//            showMenu();

        //opcion2: funcion sin parametro y con tipo de retorno
            String menu = getMenu();
            System.out.println(menu);
    }

    //void es un tipo de dato que indica que no devuelve nada...

    static void showMenu(){
        System.out.println("Bienvenidos al Ecommerce de skincare");
        System.out.println("1 - ver Skincare");
        System.out.println("1 - Comprar skincare");
        System.out.println("3 - salir");
    }

    static String getMenu(){
        return "Bienvenidos al Ecommerce de skincare: \n 1 - ver Skincare";
        // \n es un salto de linea, tipo <br/> en js
    }
}
