package Models;

import Interfaces.Beber;
import Interfaces.Orinar;

public class Vikingo extends  Humano{

    private Integer toleranciaExtra;

    public Vikingo() {
        super();
    }

    public Vikingo(String nombre, Integer edad, Integer peso, Orinar orinar, Beber beber, Integer toleranciaExtra) {
        super(nombre, edad, peso, orinar, beber);
        this.toleranciaExtra = toleranciaExtra;
    }

    @Override
    public String toString() {
        return "Vikingo{" + super.toString() +
                "toleranciaExtra=" + toleranciaExtra +
                '}';
    }

    public Integer getToleranciaExtra() {
        return toleranciaExtra;
    }

    public void setToleranciaExtra(Integer toleranciaExtra) {
        this.toleranciaExtra = toleranciaExtra;
    }
}
