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

    public int EmberekSzama(int honap){
        int db = 0;
        for(Ember e : emberekLista){
            if(e.SzulHonap() == honap){
                db++;
            }
        }
        return db;
    }
    
    public double EletkorAvg(){
        double sum = 0;
        int db = this.emberekLista.size();
        for(Ember e : emberekLista){
            sum += e.Eletkor();
        }
        return sum/db;
    }
    
    public String Legfiatalabb(){
        int min = emberekLista.get(0).Eletkor();
        String nevek = "";
        for(int i = 1; i < emberekLista.size(); i++){
            if(emberekLista.get(i).Eletkor() < min){
                min = emberekLista.get(i).Eletkor();
            }
        }
        for(int i = 0; i < emberekLista.size(); i++){
            if(emberekLista.get(i).Eletkor() == min){
                nevek += emberekLista.get(i).getNev() + ", ";
            }
        }
        return nevek;
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
