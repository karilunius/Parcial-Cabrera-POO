public class Duenio {

    //atributos
    private String nombre, apellido;
    private Integer cuil;

    //constructor


    public Duenio() {
    }

    public Duenio(String nombre, String apellido, Integer cuil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuil = cuil;
    }


    //getter y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getCuil() {
        return cuil;
    }

    public void setCuil(Integer cuil) {
        this.cuil = cuil;
    }


    //metodos


}
