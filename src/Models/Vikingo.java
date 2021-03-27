package Models;

import Interfaces.Beber;
import Interfaces.Orinar;
import Strategy.BeberVikingoImp;
import Strategy.OrinarVikingoImp;

public class Vikingo extends Humano {

    private Integer toleranciaExtra;

    public Vikingo() {
        super();
    }

    public Vikingo(String nombre, Integer edad, Integer peso, Integer toleranciaExtra) {
        super(nombre, edad, peso, new OrinarVikingoImp(), new BeberVikingoImp());
        this.toleranciaExtra = toleranciaExtra;
        this.capaciadVejiga = capacidadExtraVejiga();
    }

/*    @Override
    public String toString() {
        return "Vikingo{" + super.toString() +
                "toleranciaExtra=" + toleranciaExtra +
                '}';
    }*/

    public Integer getToleranciaExtra() {
        return this.toleranciaExtra;
    }

    public void setToleranciaExtra(Integer toleranciaExtra) {
        this.toleranciaExtra = toleranciaExtra;
    }

    public void orinar() {
        System.out.println("El vikingo "+getNombre()+" dice "+ orinar.orinar());
    }

    public void beber() {
        System.out.println("El vikingo "+getNombre()+" dice "+ beber.beber());
    }

    @Override
    public int capacidadExtraVejiga() {
        return  getCapaciadVejiga() + getToleranciaExtra();
    }
}
