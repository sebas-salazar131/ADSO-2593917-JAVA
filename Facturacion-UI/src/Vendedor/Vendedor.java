
package Vendedor;


public class Vendedor {
    private String cedula;
    private String nombres;
    private String apellidos;
    private String telefonos;
    private String direccion;
    private String email;

    public Vendedor(String cedula, String nombres, String apellidos, String telefonos, String direccion, String email) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefonos = telefonos;
        this.direccion = direccion;
        this.email = email;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getTelefonos() {
        return telefonos;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setTelefonos(String telefonos) {
        this.telefonos = telefonos;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
