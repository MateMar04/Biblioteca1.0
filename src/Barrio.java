public class Barrio {

    private String nombreBarrio;
    private Localidad localidad;

    public Barrio(String nombreBarrio, Localidad localidad) {

        this.nombreBarrio = nombreBarrio;
        this.localidad = localidad;
    }


    @Override
    public String toString() {
        return "Barrio{" +
                "nombreBarrio='" + nombreBarrio + '\'' +
                ", localidad=" + localidad +
                '}';
    }
}
