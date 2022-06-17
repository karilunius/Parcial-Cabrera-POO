import org.w3c.dom.ls.LSOutput;

public abstract class Propiedad {

    //atributos
    private String direccion;
    private Integer fecha;
    private Double precio;
    private Boolean estaHipotecada;
    private Duenio duenio;


    //constructor


    public Propiedad() {
    }

    public Propiedad(String direccion, Integer fecha, Double precio, Boolean estaHipotecada, Duenio duenio) {
        this.direccion = direccion;
        this.fecha = fecha;
        this.precio = precio;
        this.estaHipotecada = estaHipotecada;
        this.duenio = duenio;
    }


    //getter and setters

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getFecha() {
        return fecha;
    }

    public void setFecha(Integer fecha) {
        this.fecha = fecha;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Boolean getEstaHipotecada() {
        return estaHipotecada;
    }

    public void setEstaHipotecada(Boolean estaHipotecada) {
        this.estaHipotecada = estaHipotecada;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }


    //metodos

    public boolean sePuedeVender() {
        return false;
    }
}
