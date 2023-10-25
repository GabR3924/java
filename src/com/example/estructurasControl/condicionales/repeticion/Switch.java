package com.example.estructurasControl.condicionales.repeticion;

public class Switch {

    public static void main(String[] args) {
        String dia = "Domingo";

        switch (dia){
            case "Lune":
                System.out.println("Mano tengo fe");
                break;
            case "Martes":
                System.out.println("Tengo sueno");
                break;
            case "Lunes":
                System.out.println("Quiero ver arcane");
                break;
            default:
                System.out.println("jajas");
        }
    }
}
