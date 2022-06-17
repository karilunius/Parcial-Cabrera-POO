public class Casas extends Propiedad implements Comparable{

    //atributos
      private Integer cantidadAmbiente;
      private Double cantidadMetrosCua;

    //constructor


    public Casas(String direccion, Integer fecha, Double precio, Boolean estaHipotecada, Duenio duenio, Integer cantidadAmbiente, Double cantidadMetrosCua) {
        super(direccion, fecha, precio, estaHipotecada, duenio);
        this.cantidadAmbiente = cantidadAmbiente;
        this.cantidadMetrosCua = cantidadMetrosCua;
    }


    //getter and setters

    public Integer getCantidadAmbiente() {
        return cantidadAmbiente;
    }

    public void setCantidadAmbiente(Integer cantidadAmbiente) {
        this.cantidadAmbiente = cantidadAmbiente;
    }

    public Double getCantidadMetrosCua() {
        return cantidadMetrosCua;
    }

    public void setCantidadMetrosCua(Double cantidadMetrosCua) {
        this.cantidadMetrosCua = cantidadMetrosCua;
    }


    //metodos

    @Override
    public boolean sePuedeVender() {
        if (getEstaHipotecada() == true) {
            return true;
        } else {
            return false;
        }
    }

    //compareto

    @Override
    public int compareTo(Object obj) {
        Casas casaCasteada=(Casas)obj;
        if (this.cantidadAmbiente==casaCasteada.cantidadAmbiente) {
            return 0;
        }else if (this.cantidadAmbiente> casaCasteada.cantidadAmbiente){
            return 1;
        }else{
            return -1;
        }

    }

}
