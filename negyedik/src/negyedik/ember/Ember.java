package negyedik.ember;

public class Ember {
    private String nev;
    private String szuldatum;
    private String szulhely;

    public Ember(String nev, String szuldatum, String szulhely) {
        this.nev = nev;
        this.szuldatum = szuldatum;
        this.szulhely = szulhely;
    }

    @Override
    public String toString() {
        return String.format("%s - %s [%s]",this.nev,this.szuldatum,this.szulhely);
    }
}
