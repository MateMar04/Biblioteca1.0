public class Direccion {

    private String calle;
    private Barrio barrio;
    private String numero;

    public Direccion(String calle, String numero, Barrio barrio) {
        this.calle = calle;
        this.numero = numero;
        this.barrio = barrio;
    }

    public Barrio getBarrio() {
        return barrio;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "calle='" + calle + '\'' +
                ", barrio=" + barrio +
                ", numero='" + numero + '\'' +
                '}';
    }
}
