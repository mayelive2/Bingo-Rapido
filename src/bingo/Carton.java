

/* Mayeleen Rodriguez Gomez 
cod: 2016114118*/

package bingo;

import java.util.ArrayList;
import java.util.Collections;

public class Carton {
    private ArrayList<Integer> numeros;
    private int tamano;

    public Carton(ArrayList<Integer> numeros) {
        this.numeros = (ArrayList<Integer>) numeros.clone();
        Collections.sort(numeros);
        this.tamano = numeros.size();
    }
    
    public boolean comprobar(ArrayList<Integer> bolasUsadas) {
        return numeros.containsAll(bolasUsadas); 
     }
    
    public ArrayList<Integer> getNumeros() {
        return numeros;
    }

    public int getTamano() {
        return tamano;
    }
    
}
