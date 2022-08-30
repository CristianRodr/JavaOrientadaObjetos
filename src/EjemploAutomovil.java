public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setCilidrada(2.0);
        subaru.setColor("Blanco");

        Automovil mazda = new Automovil("Mazda", "BT-50", "Rojo", 3.0);
        System.out.println("subaru.leerFabricante() = " + subaru.getFabricante());
        System.out.println("mazda.leerFabricante() = " + mazda.getFabricante());

        Automovil nissan = new Automovil("Nissan", "Navara", "Gris Oscuro", 3.5, 50 );

        System.out.println(subaru.detalle());
        System.out.println(mazda.detalle());
        System.out.println(nissan.detalle());
        System.out.println(subaru.acelerar(2500));
        System.out.println(subaru.frenar());

        System.out.println(mazda.aclerarFrenar(4000));

        System.out.println("kilometros por litro: " + subaru.calcularConsumo(300, 0.6f));

        System.out.println("kilometros por listro: " + subaru.calcularConsumo(300, 60));

        System.out.println("kilometros por listro: " + nissan.calcularConsumo(300, 60));
    }
}
