package oroklodes;

public class Meret {
    private long meret;
    private Mertekegyseg mertekEgyseg;
    
    public Meret(long meret){
        this.meret = meret;
        this.mertekEgyseg = Mertekegyseg.Byte;
    }
    
    public Meret(long meret, Mertekegyseg mertekEgyseg){
        this.meret = meret;
        this.mertekEgyseg = mertekEgyseg;
    }
    
    public String getNormalizalt(){
        long m = this.meret;
        int db = 0;
        while(m/1024 > 0){
            m/=1024;
            db++;
        }
        
        Mertekegyseg me = Mertekegyseg.Byte;
        switch(db){
            case 1: me = Mertekegyseg.KB;
            case 2: me = Mertekegyseg.MB;
            case 3: me = Mertekegyseg.GB;
            case 4: me = Mertekegyseg.TB;
        }
        
        return m + " " + me.name();
    }
    
    
}
