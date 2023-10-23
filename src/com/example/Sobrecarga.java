package com.example;
/*
* Sobrecarga permite duplicar un metodo siempre y cuando tengan diferentes nro/tipo de parametro */
public class Sobrecarga {
    public static void main(String[] args) {
        System.out.println(suma(50, 300));
    }

    static  int suma(int nro1, int nro2){
        return nro1 + nro2;
    }

    static  int suma(int nro1, int nro2, int nro3){
        return nro1 + nro2;
    }
}
}
