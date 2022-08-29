public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil subaru = new Automovil();
        subaru.asignarFabricante("Subaru");
        subaru.asignarModelo("Impreza");
        subaru.asignarCilindrada(2.0);
        subaru.asignarColor("Blanco");

        Automovil mazda = new Automovil();
        mazda.asignarFabricante("Mazda");
        mazda.asignarModelo("BT-50");
        mazda.asignarCilindrada(3.0);
        mazda.asignarColor("Rojo");

        System.out.println("subaru.leerFabricante() = " + subaru.leerFabricante());
        System.out.println("mazda.leerFabricante() = " + mazda.leerFabricante());
        

        System.out.println(subaru.detalle());
        System.out.println(mazda.detalle());
        System.out.println(subaru.acelerar(2500));
        System.out.println(subaru.frenar());

        System.out.println(mazda.aclerarFrenar(4000));

        System.out.println("kilometros por litro: " + subaru.calcularConsumo(300, 0.6f));

        System.out.println("kilometros por listro: " + subaru.calcularConsumo(300, 60));
    }
}
