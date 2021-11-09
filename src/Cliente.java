public class Cliente {

    private String nombreCliente;
    private String numeroDeTelefono;
    private String mail;
    private Direccion direccion;

    public Cliente(String nombreCliente, String numeroDeTelefono, String mail, Direccion direccion) {
        this.nombreCliente = nombreCliente;
        this.numeroDeTelefono = numeroDeTelefono;
        this.mail = mail;
        this.direccion = direccion;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombreCliente='" + nombreCliente + '\'' +
                ", numeroDeTelefono='" + numeroDeTelefono + '\'' +
                ", mail='" + mail + '\'' +
                ", direccion=" + direccion +
                '}';
    }
}
