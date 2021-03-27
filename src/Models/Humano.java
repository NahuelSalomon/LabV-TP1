package Models;
import Interfaces.Beber;
import Interfaces.Orinar;

public abstract class Humano {

    private String nombre;
    private Integer edad;
    private Integer peso;
    protected Integer capaciadVejiga;
    protected Orinar orinar;
    protected Beber beber;

    public Humano() {

    }

    public Humano(String name, Integer edad, Integer peso, Orinar orinar, Beber beber) {
        this.nombre = name;
        this.edad = edad;
        this.peso = peso;
        this.capaciadVejiga = (getPeso()/7) * (getEdad()/100);
        this.orinar = orinar;
        this.beber = beber;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String name) {
        this.nombre = name;
    }

    public Integer getEdad() { return this.edad; }

    public void setEdad(Integer age) {
        this.edad = age;
    }

    public Integer getPeso() { return this.peso; }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getCapaciadVejiga() {
        return this.capaciadVejiga;
    }

    public void setCapaciadVejiga(Integer capaciadVejiga) {
        this.capaciadVejiga = capaciadVejiga;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre +
                " - Edad: " + this.edad +
                " - Peso: " + this.peso +
                " - Capacidad vejiga: "+ this.getCapaciadVejiga();
    }

    public String presentar() {
        return this.getClass().getSimpleName()+" "+this.getNombre()+" de "+this.getEdad()+" anios, un peso de "+this.getPeso()+" kg " +
                "y una capacidad de vegiga para beber de "+getCapaciadVejiga()+" litros";
    }

    public abstract int capacidadExtraVejiga();

}
