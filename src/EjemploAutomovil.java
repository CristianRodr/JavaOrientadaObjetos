public class EjemploAutomovil {
    public static void main(String[] args) {

        Motor motorSubaru = new Motor(2.0, TipoMotor.BENCINA);
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(motorSubaru);
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);

        Motor motorMazda = new Motor(3.0, TipoMotor.DIESEL);
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, motorMazda);
        mazda.setEstanque(new Estanque(45));
        System.out.println("subaru.leerFabricante() = " + subaru.getFabricante());
        System.out.println("mazda.leerFabricante() = " + mazda.getFabricante());

        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(4.0, TipoMotor.DIESEL), new Estanque(50));
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(3.5, TipoMotor.BENCINA), new Estanque(50));

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
