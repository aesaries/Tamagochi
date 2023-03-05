package org.example;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        String nombreTamagochi = "Yuri";
        boolean dormir = false;
        int accion;
        Tamagochi tamagochi = new Tamagochi(nombreTamagochi);



        while (!dormir){

            tamagochi.verMascota();

            accion = menu();
            if(accion == 1) tamagochi.comer();
            if(accion == 2) tamagochi.jugar();
            if (accion == 3) dormir = tamagochi.dormir();

        }

    }

    static int menu(){
        System.out.println("Que hacemos? 1-Comer | 2-Jugar? | 3-Dormir");
        System.out.print("-> ");
        return sc.nextInt();
    }

}