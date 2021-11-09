public class Provincia {

    private String nombreProvincia;

    public Provincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }

    @Override
    public String toString() {
        return "Provincia" + nombreProvincia;
    }
}
