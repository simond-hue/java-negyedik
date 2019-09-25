package oroklodes;

import Fajl.Fajl;
import Fajl.Attributum;

public class Oroklodes {
    
    public static void main(String[] args) {
        Fajl f1 = new Fajl("recept", "txt");
        
        f1.AddAttributum(Attributum.archiv);
        f1.AddAttributum(Attributum.csakOlvashato);
        
        System.out.println(f1);
    }
    
}
