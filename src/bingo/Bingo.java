
/* Mayeleen Rodriguez Gomez 
cod: 2016114118*/

package bingo;

import java.util.ArrayList;
import java.util.Collections;

public abstract class Bingo {

    private ArrayList<Integer> bombo;
    private ArrayList<Integer> bolasExtraidas;
    private ArrayList<Carton> cartones;
    private ArrayList<Carton> cartonesGanadores;
    private boolean finalizado;
    private int bolaMayor;
    private int tamanoCarton;
    private int ultimaBola;

    public Bingo() {
        this.bombo = new ArrayList<>();
        for (int i = 1; i <= bolaMayor; i++) {
            bombo.add(i);
        }

        bolasExtraidas = new ArrayList<>();
        cartones = new ArrayList<>();
        cartonesGanadores = new ArrayList<>();
        this.ultimaBola = 0;
        finalizado = false;
    }

    public Carton generarUnCarton() {
        ArrayList<Integer> todosNumeros = new ArrayList<>();
        ArrayList<Integer> numerosCarton = new ArrayList<>();
        Carton o;
        do {
            for (int i = 1; i <= bolaMayor; i++) {
                todosNumeros.add(i);
            }
            Collections.shuffle(todosNumeros);
            for (int i = 1; i <= tamanoCarton; i++) {
                numerosCarton.add(todosNumeros.get(i));
            }
            o = new Carton(numerosCarton);
            System.out.println(o.toString());
        } while (aceptable(o) && cartones.contains(o));
        cartones.add(o);
        return o;
    }

    public abstract boolean aceptable(Carton o);

    public int extraerUnaBola() {
        Collections.shuffle(bombo);
        ultimaBola = bombo.get(0);
        bolasExtraidas.add(bombo.get(0));
        bombo.remove(0);
        for (int i = 0; i < cartones.size(); i++) {
            if (cartones.get(i).comprobar(bolasExtraidas)) {
                cartonesGanadores.add(cartones.get(i));
                this.finalizado = true;
            }
        }
        return ultimaBola;
    }

    public int getBolaMayor() {
        return bolaMayor;
    }

    public ArrayList<Integer> getBombo() {
        return bombo;
    }

    public ArrayList<Integer> getBolasExtraidas() {
        return bolasExtraidas;
    }

    public int getUltimaBola() {
        return ultimaBola;
    }

    public int getTamanoCarton() {
        return tamanoCarton;
    }

    public ArrayList<Carton> getCartonesBingo() {
        return cartonesGanadores;
    }

}
