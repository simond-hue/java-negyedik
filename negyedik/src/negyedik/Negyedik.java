package negyedik;

import negyedik.ember.Ember;

public class Negyedik {

    public static void main(String[] args) {
        Ember simonDani = new Ember("Simon Dániel", "1999.04.13", "Budapest");
        Ember palfalvi = new Ember("Pálfalvi László", "1995.02.11", "Budapest");
        Ember jakus = new Ember("Jakus Dániel", "1997.10.05", "Budapest");
        System.out.println(simonDani);
        System.out.println(palfalvi);
        System.out.println(jakus);
    }
}
