public class Main {
    public static void main(String[] args) {

        System.out.println("PARCIAL DE PROGRAMACIÓN - Carolina Cabrera Montoya");


        Duenio duenio1 = new Duenio("Luisa", "Martinez", 3459);
        Duenio duenio2 = new Duenio("Lu", "Monte", 3458);
        Casas casa1 = new Casas("Calle siempreviva1", 2020, 35000.00, true, duenio1, 3, 75.0);
        Casas casa2 = new Casas("Calle siempreviva2", 2020, 34000.00, false, duenio2, 7, 350.0);

        Campos campo1 = new Campos("Campo verde", 2022, 50000.00, true, duenio1, true, 34000.00);
        Campos campo2 = new Campos("Campo verde", 2022, 40000.00, false, duenio2, false, 24000.00);

        //se puede vender


        System.out.println(casa1.sePuedeVender());
        System.out.println(casa2.sePuedeVender());


        // campo apto

        System.out.println(campo1.campoAptoCultivo());
        System.out.println(campo2.campoAptoCultivo());

        if (casa1.compareTo(casa2)>0){
            System.out.println("la casa 1 tiene mas ambientes");
        }else if {
            System.out.println("la casa 2 tiene mas ambientes");
        }else{
            System.out.println("las dos casa son iguales en ambientes");
        }





    }
}