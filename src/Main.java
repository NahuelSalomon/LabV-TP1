import Models.Espartano;
import Models.Vikingo;
import Strategy.BeberEspartanoImp;
import Strategy.BeberVikingoImp;
import Strategy.OrinarEspartanoImp;
import Strategy.OrinarVikingoImp;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) {

        List<Vikingo> vikingos = new ArrayList<Vikingo>();
        List<Espartano> espartanos = new ArrayList<Espartano>();

        System.out.println("VIKINGOS\n");

        for(int i = 1; i <= 20;i++) {
            Vikingo vikingo = new Vikingo("Vikingo "+i, (int) (Math.random() * 100), (int) (Math.random() * 100), new OrinarVikingoImp(), new BeberVikingoImp(), (int) (Math.random() * 100));
            vikingos.add(vikingo);
        }

        vikingos.forEach( f -> {
            System.out.println(f.toString());
            f.orinar();
            f.beber();
            System.out.println();
        });

        System.out.println("\n\n\n");

        System.out.println("ESPARTANOS\n");

        for(int i = 1; i <= 20;i++) {
            Espartano espartano = new Espartano("Espartano "+i, (int) (Math.random() * 100), (int) (Math.random() * 100), new OrinarEspartanoImp(), new BeberEspartanoImp(), (int) (Math.random() * 100));
            espartanos.add(espartano);
        }

        espartanos.forEach( f -> {
            System.out.println(f.toString());
            f.orinar();
            f.beber();
            System.out.println();
        });



    }
}
