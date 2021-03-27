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

    public <E extends Humano> String presentarEquipo(List<E> humanos) {
        StringBuilder builder = new StringBuilder();

        builder.append("Este es el equipo de " + humanos.get(0).getClass().getSimpleName() + "s\n");

        humanos.forEach(f -> {
            builder.append(f.toString() + "\n");
        });

        return builder.toString();

    }

    public void competir() {
        int i = 1;
        System.out.println("\nBienvenidos al torneo!! A continuacion presentaremos a los equipos y luego empezaremos con los enfrentamientos\n" +
                           "La modalidad del torneo es por eliminación directa, cuando un competidor de un equipo queda afuera continua su\n" +
                           "proximo companiero compitiendo contra el mismo competidor que perdio, y así sucesivamente hasta que queden todos\n" +
                           "los competidores de un equipo afuera.\n");

        try {
            Thread.sleep(5000);
            System.out.println(presentarEquipo(this.equipoEspartanos));
            Thread.sleep(3000);
            System.out.println(presentarEquipo(this.equipoVikingos));
            Thread.sleep(3000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        while (!equipoVikingos.isEmpty() && !equipoEspartanos.isEmpty()) {
            System.out.println("\n\n--------------------------------------------------------------------------------------");
            System.out.println("Enfrentamiento " + i);
            enfrentamientoIndividual(equipoVikingos.get(0), equipoEspartanos.get(0));
            i++;
        }

        if (equipoVikingos.isEmpty()) {
            System.out.println("El equipo de vikingos es el ganador del torneo!");
        } else {
            System.out.println("El equipo de espartanos es el ganador del torneo!");
        }

    }

    private void enfrentamientoIndividual(Vikingo vikingo, Espartano espartano) {

        System.out.println("\n");
        System.out.println("Van a competir el " + vikingo.presentar() + " \ncontra el " + espartano.presentar());
        System.out.println("\n");

        vikingo.beber();
        espartano.beber();


        try {
            System.out.println("Han empezado a competir..");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        if(vikingo.getCapaciadVejiga() > espartano.getCapaciadVejiga()) {
            espartano.orinar();
            vikingo.setCapaciadVejiga(vikingo.getCapaciadVejiga() - espartano.getCapaciadVejiga());
            System.out.println("El espartano " + espartano.getNombre() + " ha quedado fuera, el ganador es el vikingo "+ vikingo.getNombre()+" que pasa a la siguiente ronda");
            equipoEspartanos.remove(espartano);
            try{Thread.sleep(3000);} catch (InterruptedException e) {e.printStackTrace();}
        }
        else if(vikingo.getCapaciadVejiga() < espartano.getCapaciadVejiga()){
            vikingo.orinar();
            espartano.setCapaciadVejiga(espartano.getCapaciadVejiga() - vikingo.getCapaciadVejiga());
            System.out.println("El vikingo " + vikingo.getNombre() + " ha quedado fuera, el ganador es el espartano "+ espartano.getNombre()+" que pasa a la siguiente ronda");
            equipoVikingos.remove(vikingo);
            try{Thread.sleep(3000);} catch (InterruptedException e) {e.printStackTrace();}
        }
    }


}
