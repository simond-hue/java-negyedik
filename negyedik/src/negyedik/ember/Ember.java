package negyedik.ember;

import java.util.Calendar;
import java.util.TimeZone;

public class Ember {
    private String nev;
    private String szuldatum;
    private String szulhely;

    public Ember(String nev, String szuldatum, String szulhely) {
        this.nev = nev;
        this.szuldatum = szuldatum;
        this.szulhely = szulhely;
    }

    public int SzuletesiEv(){
        return Integer.parseInt(this.szuldatum.substring(0,4));
    }
    
    public int SzulHonap(){
        return Integer.parseInt(szuldatum.split("-")[1]);
    }
    
    public int SzulNap(){
        return Integer.parseInt(szuldatum.split("-")[2]);     
    }
    
    public int Eletkor(){
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Europe/Paris"));
        int year = cal.get(Calendar.YEAR);
        return year-this.SzuletesiEv();
    }
    
    @Override
    public String toString() {
        return String.format("%s: %s [%s]",this.nev,this.szuldatum,this.szulhely);
    }
}
