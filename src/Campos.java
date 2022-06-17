public class Campos extends Propiedad{
    //atributos
    private Boolean tieneCasco;
    private Double cantidadHect;


    //constructor

    public Campos(String direccion, Integer fecha, Double precio, Boolean estaHipotecada, Duenio duenio, Boolean tieneCasco, Double cantidadHect) {
        super(direccion, fecha, precio, estaHipotecada, duenio);
        this.tieneCasco = tieneCasco;
        this.cantidadHect = cantidadHect;
    }


    //getter and setters


    public Boolean getTieneCasco() {
        return tieneCasco;
    }

    public void setTieneCasco(Boolean tieneCasco) {
        this.tieneCasco = tieneCasco;
    }

    public Double getCantidadHect() {
        return cantidadHect;
    }

    public void setCantidadHect(Double cantidadHect) {
        this.cantidadHect = cantidadHect;
    }

    //metodos
    @Override
    public boolean sePuedeVender() {
        return false;
    }

    public boolean campoAptoCultivo( Double cantidadHect){
        if(this.getCantidadHect() > 10){
            return true;
    }else {
            return false;
        }
    }



}
