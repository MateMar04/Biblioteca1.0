public class Localidad {

    private String nombreLocalidad;
    private Provincia provincia;

    public Localidad(String nombreLocalidad, Provincia provincia) {

        this.nombreLocalidad = nombreLocalidad;
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "Localidad{" +
                "nombreLocalidad='" + nombreLocalidad + '\'' +
                ", provincia=" + provincia +
                '}';
    }
}
