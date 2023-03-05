package org.example;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Tamagochi {
    private final String nombre;
    private Estado humor;
    private int nivel;

    private LocalTime ultimaComida;
    private LocalTime ultimoJuego;

    public Tamagochi(String Nombre) {
        this.nombre = Nombre;
        this.humor = Estado.CONTENTA;
        this.ultimaComida = LocalTime.now();
        this.ultimoJuego = LocalTime.now();


    }

    public void comer (){

        int sJuego = obtenerSeg(getUltimoJuego());

        switch (getHumor()){
            case CONTENTA -> setNivel(getNivel()+1);

            case HAMBRIENTO -> setHumor(Estado.CONTENTA);

            case ABURRIDO -> {
                if (sJuego > 30) setHumor(Estado.CONTENTA);
            }


            default -> System.out.println("default");
        }

        setUltimaComida(LocalTime.now());
    }

    public void jugar () {

        switch (getHumor()){

            case CONTENTA -> setNivel(getNivel()+2);

            case ABURRIDO -> setHumor(Estado.CONTENTA);

            case HAMBRIENTO -> System.out.println("NO tengo Energias para jugar!!!!");

            default -> System.out.println();
        }
        setUltimoJuego(LocalTime.now());




    }

    public void verMascota(){

        int segundosJuegos = obtenerSeg(getUltimoJuego());
        int segundosComida = obtenerSeg(getUltimaComida());

        if (segundosJuegos > 30) setHumor(Estado.ABURRIDO);
        if (segundosComida > 60)setHumor(Estado.HAMBRIENTO);


        if (getHumor().equals(Estado.CONTENTA)) System.out.println("\uD83D\uDE0A" + "  nivel("+getNivel()+")");
        if (getHumor().equals(Estado.ABURRIDO)) System.out.println("\uD83D\uDE10" + "  nivel("+getNivel()+")");
        if (getHumor().equals(Estado.HAMBRIENTO)) System.out.println("\uD83E\uDD74" + "  nivel("+getNivel()+")");


    }

    public boolean dormir(){
        System.out.println("Chau nos vemos luego!!");
        return  true;
    }

    //// getters and Setters


    public Estado getHumor() {
        return humor;
    }

    public void setHumor(Estado humor) {
        this.humor = humor;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public LocalTime getUltimaComida() {
        return ultimaComida;
    }

    public void setUltimaComida(LocalTime ultimaComida) {
        this.ultimaComida = ultimaComida;
    }

    public LocalTime getUltimoJuego() {
        return ultimoJuego;
    }

    public void setUltimoJuego(LocalTime ultimoJuego) {
        this.ultimoJuego = ultimoJuego;
    }


    @Override
    public String toString() {
        return "Tamagochi{" +
                "nombre='" + nombre + '\'' +
                ", humor=" + humor +
                ", nivel=" + nivel +
                ", ultimaComida=" + ultimaComida +
                ", ultimoJuego=" + ultimoJuego +
                '}';
    }

    private int obtenerSeg(LocalTime actividad){
        LocalTime ahora = LocalTime.now();
        return (int)ChronoUnit.SECONDS.between(actividad, ahora);
    }
}
