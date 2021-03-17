package Models;
import Interfaces.Beber;
import Interfaces.Orinar;

public class Humano {

    private String nombre;
    private Integer edad;
    private Integer peso;
    protected Orinar orinar;
    protected Beber beber;

    public Humano() {

    }

    public Humano(String nombre, Integer edad, Integer peso, Orinar orinar, Beber beber) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.orinar = orinar;
        this.beber = beber;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() { return this.edad; }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getPeso() { return this.peso; }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                '}';
    }

    public void orinar() {
        orinar.orinar();
    }

    public void beber() {
        beber.beber();
    }


}
