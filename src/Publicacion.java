public abstract class Publicacion {

    private int cantidadDePrestamos;
    private String titulo;

    public Publicacion(String nombre) {
        this.titulo = nombre;
    }

    public void incrementarCantPrestamos() {
        cantidadDePrestamos++;
    }

    @Override
    public String toString() {
        return "Publicacion{" +
                "cantidadDePrestamos=" + cantidadDePrestamos +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}
