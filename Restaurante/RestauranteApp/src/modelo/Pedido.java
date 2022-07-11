
package modelo;

public class Pedido {
    public String numeroPedido;
    public String nombrePedido;// nombre del plato
    public int cantidad;

    public Pedido(String numeroPedido, String nombrePedido, int cantidad) {
        this.numeroPedido = numeroPedido;
        this.nombrePedido = nombrePedido;
        this.cantidad = cantidad;
    }

        public Pedido() {
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public String getNombrePedido() {
        return nombrePedido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setNombrePedido(String nombrePedido) {
        this.nombrePedido = nombrePedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Pedido{" + "numeroPedido=" + numeroPedido + ", nombrePedido=" + nombrePedido + ", cantidad=" + cantidad + '}';
    }

   
}
