package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RuletaRusa {
    private List<Integer> tambor;
    private int bala;
    private int posicionActual;
    private boolean decision;
    private Random random;

    public RuletaRusa() {
        tambor = new ArrayList<>();
        tambor.add(1);
        tambor.add(2);
        tambor.add(3);
        tambor.add(4);
        tambor.add(5);
        tambor.add(6);
        random = new Random();
        posicionActual = random.nextInt(tambor.size());
        bala = random.nextInt(tambor.size());

    }
    public boolean disparar () {
        if(bala == 6) {
            bala = 0;
        }
        if (posicionActual == bala ){
            System.out.println("DISPARO");
            decision = true;
        } else {
            System.out.println("FALLO");
            bala++;
            decision = false;
        }
        return decision;
    }

    public List<Integer> getTambor() {
        return tambor;
    }

    public void setTambor(List<Integer> tambor) {
        this.tambor = tambor;
    }

    public int getBala() {
        return bala;
    }

    public void setBala(int bala) {
        this.bala = bala;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public boolean isDecision() {
        return decision;
    }

    public void setDecision(boolean decision) {
        this.decision = decision;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    @Override
    public String toString() {
        return "RuletaRusa{" +
                "tambor=" + tambor +
                ", bala=" + bala +
                ", posicionActual=" + posicionActual +
                ", decision=" + decision +
                ", random=" + random +
                '}';
    }


}