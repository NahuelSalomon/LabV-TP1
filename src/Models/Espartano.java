package Models;

import Interfaces.Beber;
import Interfaces.Orinar;

public class Espartano extends Humano{

    private Integer bebedorProfesional;

    public Espartano() {
        super();
    }

    public Espartano(String nombre, Integer edad, Integer peso, Orinar orinar, Beber beber, Integer bebedorProfesional) {
        super(nombre, edad, peso, orinar, beber);
        this.bebedorProfesional = bebedorProfesional;
    }

    public Integer getBebedorProfesional() {
        return bebedorProfesional;
    }

    public void setBebedorProfesional(Integer bebedorProfesional) {
        this.bebedorProfesional = bebedorProfesional;
    }

}
