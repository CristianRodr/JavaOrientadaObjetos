public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil.setCapacidadEstanqueEstatico(45);
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setCilidrada(2.0);
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);


        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, 3.0);
        mazda.setTipo(TipoAutomovil.PICKUP);
        System.out.println("subaru.leerFabricante() = " + subaru.getFabricante());
        System.out.println("mazda.leerFabricante() = " + mazda.getFabricante());

        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, 3.5, 50 );
        nissan.setTipo(TipoAutomovil.PICKUP);
        Automovil.setColorPatente(Color.VERDE);

        System.out.println(subaru.detalle());
        System.out.println(mazda.detalle());
        System.out.println(nissan.detalle());
        System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente());
        System.out.println("Kilometros por litros = " + Automovil.calcularConsumoEstatico(300, 60) );
        System.out.println("Velocidad maxima carretera: " + Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Velocidad maxima ciudad: " + Automovil.VELOCIDAD_MAX_CIUDAD);

        TipoAutomovil tipoSubaru = subaru.getTipo();
        System.out.println("tipo Subaru = " + tipoSubaru.getNombre());
        System.out.println("tipo descripcion Subaru = " + tipoSubaru.getDescripcion());
    }
}
