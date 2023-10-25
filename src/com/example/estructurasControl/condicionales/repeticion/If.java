package com.example.estructurasControl.condicionales.repeticion;

public class If {

   public static void main(String[] args){

        int edad = 27;

        if(edad >= 18){
        System.out.println("Es menor de edad");
        }else{
        System.out.println("Es menor de edad");
        }

        String dia = "Martes";
        boolean result = dia.equals("martes");

        //if else if
       if(dia.equals("Lunes")){
            System.out.println("Mano tengo fe");
       }else if(result){
           System.out.println("Tengo sueno");
       }else{
           System.out.println("Quiero ver arcane");
       }

   }
}