package Fajl;

import java.util.List;
import java.util.LinkedList;

public class Fajl {
    private String nev;
    private String kiterjesztes;
    private String tartalom;
    
    private List<Attributum> attributumLista;

    public Fajl(String nev, String kiterjesztes){
        this.attributumLista = new LinkedList<>();
        
        this.nev = nev;
        this.kiterjesztes = kiterjesztes;
    }
    
    public Fajl(String nev, String kiterjesztes, String tartalom) {
        this.nev = nev;
        this.kiterjesztes = kiterjesztes;
        this.tartalom = tartalom;
    }
    
    public void AddAttributum(Attributum a){
        if(!this.attributumLista.contains(a)){
            attributumLista.add(a);
        }
    }
    
    public void RemoveAttributum(Attributum a){
        if(this.attributumLista.contains(a)){
            attributumLista.remove(a);
        }
    }

    @Override
    public String toString() {
        String s = this.nev + "." + this.kiterjesztes;
        for(Attributum a : attributumLista){
            s += " " + a.name();
        }
        return s;
    }
}
