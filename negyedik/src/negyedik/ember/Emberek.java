package negyedik.ember;

import java.io.*;
import java.util.List;
import java.io.FileReader;
import java.util.LinkedList;

public class Emberek {
    private List<Ember> emberekLista;
    
    public Emberek(String filename){
        this.emberekLista = new LinkedList<>();
        try{
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line = br.readLine();
            while(line != null){
                String[] adatok = line.split(";");
                emberekLista.add(new Ember(adatok[0],adatok[1],adatok[2]));
                line = br.readLine();
            }
            br.close();
        }
        catch(FileNotFoundException e){
            System.out.println("Nem található a fájl!");
        }
        catch(Exception e){
            System.out.println("Hiba!");
        }
    }

    @Override
    public String toString() {
        String s = "";
        for(Ember e : emberekLista){
            s+=e.toString()+"\n";
        }
        return s;
    }
}
