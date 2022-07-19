
package modelo;

public class Pedido {
    public String numeroPedido;
    public String nombrePedido;// nombre del plato
    public int cantidad;
    public String precio1;
    public String total;

    public Pedido(String numeroPedido, String nombrePedido, int cantidad,String precio1, String total) {
        this.numeroPedido = numeroPedido;
        this.nombrePedido = nombrePedido;
        this.cantidad = cantidad;
        this.precio1=precio1;
        this.total=total;
    }

        public Pedido() {
    }

    public void setPrecio1(String precio1) {
        this.precio1 = precio1;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getPrecio1() {
        return precio1;
    }

    public String getTotal() {
        return total;
    }

    public String getPrecio() {
        return precio1;
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
    public void setPrecio(String precio) {
        this.precio1 = precio;
    }

    @Override
    public String toString() {
        return "Pedido{" + "numeroPedido=" + numeroPedido + ", nombrePedido=" + nombrePedido + ", cantidad=" + cantidad + ", precio1=" + precio1 + ", total=" + total + '}';
    }

   
}
