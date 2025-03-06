package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        while (continuar){
            boolean salir = true;
            RuletaRusa run = new RuletaRusa();
            int decision;
            System.out.println(run.toString());
            do {
                System.out.println("Bienvenido a la ruleta rusa. Elija una opción: ");
                System.out.println("1. Iniciar juego");
                System.out.println("2. Reiniciar juego");
                System.out.println("3. Salir del juego");
                // No cree un metodo reiniciar. Lo que hice fue que el juegue este en un while y cuando hay un disparo
                // se vuelve a reiniciar y ahí esta la opción de salir o iniciar nuevamente.
                // La opción de reiniciar hace que se puede reinicar el juego en cualquier momento de la partida
                decision = sc.nextInt();
                switch (decision) {
                    case 1:
                        System.out.println("Usted es el jugador 1 y tiene la posicion " + run.getPosicionActual());
                        System.out.println(run.getBala());
                        System.out.println(run.toString());
                        run.disparar();
                        if(run.isDecision() == false) {
                            continue;
                        } else {
                            salir = false;
                        }
                        break;
                    case 2:
                        salir = false;
                        break;
                    case 3:
                        salir = false;
                        continuar = false;
                        break;
                }
            } while(salir);
        }

    }
}