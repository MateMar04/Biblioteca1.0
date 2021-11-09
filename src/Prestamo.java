import java.util.ArrayList;
import java.util.List;

public class Prestamo {

    private String fechaPrestamo;
    private String fechaTentativaDeDevolucion;
    private Cliente cliente;
    private List<Publicacion> lista;

    public Prestamo(String fechaDePrestamo, String fechaDeDevolucion, Cliente cliente) {
        this.fechaPrestamo = fechaDePrestamo;
        this.fechaTentativaDeDevolucion = fechaDeDevolucion;
        this.cliente = cliente;
        lista = new ArrayList<>();
    }

    public void agregar(Publicacion publicacion) {
        lista.add(publicacion);
        publicacion.incrementarCantPrestamos();
    }

    public List<Publicacion> getPublicaciones() {
        return lista;
    }

    public Cliente getCliente() {
        return cliente;
    }


    @Override
    public String toString() {
        return "Prestamo{" +
                "fechaPrestamo='" + fechaPrestamo + '\'' +
                ", fechaTentativaDeDevolucion='" + fechaTentativaDeDevolucion + '\'' +
                ", cliente=" + cliente +
                ", lista=" + lista +
                '}';
    }
}
