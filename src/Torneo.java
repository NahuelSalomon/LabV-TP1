import Models.Espartano;
import Models.Humano;
import Models.Vikingo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Torneo {

    private List<Vikingo> equipoVikingos;
    private List<Espartano> equipoEspartanos;

    public Torneo(List<Vikingo> equipoVikingos, List<Espartano> equipoEspartanos) {
        this.equipoVikingos = equipoVikingos;
        Collections.sort(this.equipoVikingos, (x, y) -> x.getPeso().compareTo(y.getPeso()));
        this.equipoEspartanos = equipoEspartanos;
        Collections.sort(this.equipoEspartanos, (x, y) -> x.getPeso().compareTo(y.getPeso()));
    }

    public void competir() {
        System.out.println("Bienvenidos al torneo!! A continuacion empezaremos con los enfrentamientos\n\n\n");


        while(!equipoVikingos.isEmpty() && !equipoEspartanos.isEmpty()) {
            enfrentamientoIndividual(equipoVikingos.get(0),equipoEspartanos.get(0));
        }

        if(equipoVikingos.isEmpty()) {
            System.out.println("El equipo de vikingos es el ganador del torneo!");
        }
        else {
            System.out.println("El equipo de espartanos es el ganador del torneo!");
        }

    }

    private void enfrentamientoIndividual(Vikingo vikingo, Espartano espartano) {

        System.out.println("\n");
        System.out.println("Van a competir el vikingo "+vikingo.getNombre()+" "+vikingo.getCapaciadVejiga()+ " contra el espartano "+ espartano.getNombre()+" "+espartano.getCapaciadVejiga());
        System.out.println("\n");

        vikingo.beber();
        espartano.beber();


        try {
            System.out.println("Han empezado a competir..");
            Thread.sleep(5000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(vikingo.getCapaciadVejiga() > espartano.getCapaciadVejiga()) {
            espartano.orinar();
            vikingo.setCapaciadVejiga(vikingo.getCapaciadVejiga() - espartano.getCapaciadVejiga());
            System.out.println("El espartano " + espartano.getNombre() + " ha quedado fuera, el ganador es el vikingo "+ vikingo.getNombre());
            equipoEspartanos.remove(espartano);
        }
        else if(vikingo.getCapaciadVejiga() < espartano.getCapaciadVejiga()){
            vikingo.orinar();
            espartano.setCapaciadVejiga(espartano.getCapaciadVejiga() - vikingo.getCapaciadVejiga());
            System.out.println("El vikingo " + vikingo.getNombre() + " ha quedado fuera, el ganador es el espartano "+ espartano.getNombre());
            equipoVikingos.remove(vikingo);
        }

    }

}
