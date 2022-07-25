

package modelo;

/**
 *
 * @author Jeimy
 */
public class Cliente {
    private String nPedido;
    private String nombreCliente;
    private String precioTotal;

    public Cliente(String nPedido, String nombreCliente, String precioTotal) {
        this.nPedido = nPedido;
        this.nombreCliente = nombreCliente;
        this.precioTotal = precioTotal;
    }

    

    public Cliente() {
    }

    public String getnPedido() {
        return nPedido;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getPrecioTotal() {
        return precioTotal;
    }

    public void setnPedido(String nPedido) {
        this.nPedido = nPedido;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setPrecioTotal(String precioTotal) {
        this.precioTotal = precioTotal;
    }

    

    @Override
    public String toString() {
        return "Cliente{" + "nPedido=" + nPedido + ", nombreCliente=" + nombreCliente + ", precioTotal=" + precioTotal + '}';
    }
    
    
    
}
