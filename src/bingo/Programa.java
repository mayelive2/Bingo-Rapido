
/* Mayeleen Rodriguez Gomez 
cod: 2016114118*/


package bingo;

import java.util.ArrayList;

public class Programa {

    public static void main(String[] args) {
        Bingo bingo = new Bingo() {
            @Override
            public boolean aceptable(Carton o) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        Carton carton1 = bingo.generarUnCarton();
        Carton carton2 = bingo.generarUnCarton();
        Carton carton3 = bingo.generarUnCarton();
        
        
        
          
        
        
    }
    
}
