
package Producto;


public class Producto {
    private String id;
    private String nombres;
    private int precio;
    private int cantidad;
   

    public Producto(String id, String nombres, int precio, int cantidad) {
        this.id = id;
        this.nombres = nombres;
        this.precio = precio;
        this.cantidad = cantidad;
        
    }

    public String getId() {
        return id;
    }

    public String getNombres() {
        return nombres;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }


    public void setId(String id) {
        this.id = id;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }



}
