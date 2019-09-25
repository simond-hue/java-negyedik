package negyedik;

import negyedik.ember.Ember;
import negyedik.ember.Emberek;

public class Negyedik {

    public static void main(String[] args) {
        Emberek emberek = new Emberek("emberek.txt");
        System.out.println(emberek.EmberekSzama(1));
        System.out.println(emberek.EletkorAvg());
        System.out.println(emberek.Legfiatalabb());
    }
}
