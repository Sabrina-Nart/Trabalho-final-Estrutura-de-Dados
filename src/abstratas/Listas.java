
package abstratas;

import classes.ListaMassa;
import classes.Massa;
import classes.Pao;
import classes.Sonho;

public class Listas {

    private static ListaMassa listaMassa = new ListaMassa();
    private static Pao listaPao = new Pao();
    private static Sonho listaSonho = new Sonho();
    
/////////////////
    
    public static ListaMassa getListaMassa() {
        return listaMassa;
    }
     
/////////////////
    
    public static Pao getListaPao() {
        return listaPao;
    }
    
/////////////////
    
    public static Sonho getListaSonho() {
        return listaSonho;
    }
    
/////////////////   
}
