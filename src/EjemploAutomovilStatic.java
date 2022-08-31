public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil.setCapacidadEstanqueEstatico(45);
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setCilidrada(2.0);
        subaru.setColor(Color.BLANCO);


        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, 3.0);
        System.out.println("subaru.leerFabricante() = " + subaru.getFabricante());
        System.out.println("mazda.leerFabricante() = " + mazda.getFabricante());

        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, 3.5, 50 );

        Automovil.setColorPatente(Color.VERDE);

        System.out.println(subaru.detalle());
        System.out.println(mazda.detalle());
        System.out.println(nissan.detalle());
        System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente());
        System.out.println("Kilometros por litros = " + Automovil.calcularConsumoEstatico(300, 60) );
        System.out.println("Velocidad maxima carretera: " + Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Velocidad maxima ciudad: " + Automovil.VELOCIDAD_MAX_CIUDAD);
    }
}
