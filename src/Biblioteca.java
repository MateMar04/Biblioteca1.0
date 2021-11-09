import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private ArrayList<Publicacion> listaDePublicaciones;
    private ArrayList<Prestamo> listaDePrestamos;
    private String nombreBiblioteca;

    public Biblioteca(String nombreBiblioteca) {

        this.nombreBiblioteca = nombreBiblioteca;
        listaDePublicaciones = new ArrayList<>();
        listaDePrestamos = new ArrayList<>();
    }

    public void agregarPublicacion(Publicacion publicacion) {
        listaDePublicaciones.add(publicacion);
    }

    public void prestarPublicacion(Prestamo prestamo) {
        listaDePrestamos.add(prestamo);
    }

    public int cantidadDePrestamos() {
        return listaDePrestamos.size();
    }

    public int cantidadDePublicaciones() {
        return listaDePublicaciones.size();
    }

    public int cantLibros() {
        int c = 0;

        for (Publicacion publicacion : listaDePublicaciones) {
            if (publicacion instanceof Libro) {
                c++;
            }
        }
        return c;
    }

    public int cantRevistas() {
        int c = 0;

        for (Publicacion publicacion : listaDePublicaciones) {
            if (publicacion instanceof Revista) {
                c++;
            }
        }
        return c;
    }

    public List<Publicacion> listarPublicaciones() {
        return listaDePublicaciones;
    }

    public List<Prestamo> listarPrestamos() {
        return listaDePrestamos;
    }

    public List<Cliente> clientesConPrestamoDeLibro() {
        List<Cliente> clientes = new ArrayList<>();
        for (Prestamo prestamo : listaDePrestamos) {
            for (Publicacion publicacion : prestamo.getPublicaciones()) {
                if (publicacion instanceof Libro) {
                    clientes.add(prestamo.getCliente());
                    break;
                }
            }
        }
        return clientes;
    }

    public List<Barrio> listarBarriosConPrestamos() {
        List<Barrio> barrios = new ArrayList<>();
        for (Prestamo prestamo : listaDePrestamos) {
            barrios.add(prestamo.getCliente().getDireccion().getBarrio());
        }
        return barrios;

    }


}
