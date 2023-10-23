package com.example;

public class Funciones {

    public static void main(String[] args){
        //opcion1: funcion sin parametro y sin tipo de retorno
//            showMenu();
//            showMenu();

        //opcion2: funcion sin parametro y con tipo de retorno
            String menu = getMenu();
            System.out.println(menu);

        //opcion3: funcion con parametron y sin tipo de retorno
            imprimirSaludo("OpenBootcamp");

        //Opcion 4 : Funcion con parametros y  con tipo de retorno
        String saludo = obtenerSaludo("gabriela", "Rodriguez");
        System.out.println(saludo);
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

    static void imprimirSaludo(String nombre) {
        System.out.println("Buenas tardes " + nombre);
    }

    static String obtenerSaludo(String nombre, String apellido){
        return "Buenos tardeees " + nombre + " " + apellido;
    }
}
