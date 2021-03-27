import Models.Espartano;
import Models.Vikingo;
import Strategy.BeberEspartanoImp;
import Strategy.BeberVikingoImp;
import Strategy.OrinarEspartanoImp;
import Strategy.OrinarVikingoImp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String args[]) {

        List<Vikingo> vikingos = new ArrayList<Vikingo>();
        List<Espartano> espartanos = new ArrayList<Espartano>();

        Vikingo vikingo = new Vikingo("Pablo",29,75,10);
        Vikingo vikingo2 = new Vikingo("Jose", 20, 60, 5);
        Vikingo vikingo3 = new Vikingo("Rama", 40, 100, 20);
        Vikingo vikingo4 = new Vikingo("Franco", 35, 70, 8);
        Vikingo vikingo5 = new Vikingo("Fabricio", 45, 68, 12);

        vikingos.add(vikingo); vikingos.add(vikingo2); vikingos.add(vikingo3); vikingos.add(vikingo4); vikingos.add(vikingo5);

        Espartano espartano = new Espartano("Santiago", 32, 70, 11);
        Espartano espartano2 = new Espartano("Manuel", 41, 75, 7);
        Espartano espartano3 = new Espartano("Samuel",20,57, 13);
        Espartano espartano4 = new Espartano("Lucas", 25, 80, 8);
        Espartano espartano5 = new Espartano("Martin", 10, 100,18);

        espartanos.add(espartano); espartanos.add(espartano2); espartanos.add(espartano3); espartanos.add(espartano4); espartanos.add(espartano5);

        Torneo torneo = new Torneo(vikingos,espartanos);

        torneo.competir();

    }
}
