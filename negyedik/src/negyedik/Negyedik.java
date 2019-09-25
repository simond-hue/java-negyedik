package negyedik;

import negyedik.ember.Ember;
import negyedik.ember.Emberek;
import java.util.List;

public class Negyedik {

    public static void main(String[] args) {
        Emberek emberek = new Emberek("emberek.txt");
        System.out.println(emberek.EmberekSzama(1));
        System.out.println(emberek.EletkorAvg());
        System.out.println(emberek.Legfiatalabb());
        List<Integer> legidosebbEmberEletkorIndexek = emberek.LegidosebbIndexek();
        for(int i = 0; i < legidosebbEmberEletkorIndexek.size(); i++){
            System.out.print(legidosebbEmberEletkorIndexek.get(i) + ",");
        }
    }
}
