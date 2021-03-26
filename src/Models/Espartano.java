package Models;

import Interfaces.Beber;
import Interfaces.Orinar;
import Strategy.BeberEspartanoImp;
import Strategy.OrinarEspartanoImp;

public class Espartano extends Humano {

    private Integer bebedorProfesional;

    public Espartano() {
        super();
    }

    public Espartano(String nombre, Integer edad, Integer peso,Integer bebedorProfesional) {
        super(nombre, edad, peso, new OrinarEspartanoImp(), new BeberEspartanoImp());
        this.bebedorProfesional = bebedorProfesional;
        this.capaciadVejiga = capacidadExtraVejiga();
    }

    public Integer getBebedorProfesional() {
        return bebedorProfesional;
    }

    public void setBebedorProfesional(Integer bebedorProfesional) {
        this.bebedorProfesional = bebedorProfesional;
    }

    public void orinar() {
        System.out.println("El espartano "+getNombre()+" dice "+ orinar.orinar());
    }

    public void beber() {
        System.out.println("El espartano "+getNombre()+" dice "+ beber.beber());
    }

    @Override
    public int capacidadExtraVejiga() {
        return getCapaciadVejiga() + getBebedorProfesional();
    }

}
