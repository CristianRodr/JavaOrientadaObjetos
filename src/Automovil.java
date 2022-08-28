public class Automovil {

    String fabricante;
    String modelo;
    String color = "gris";
    double cilidrada;

    public String detalle() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nfabricante = " + this.fabricante);
        sb.append("\nmodelo = " + this.modelo);
        sb.append("\ncolor = " + this.color);
        sb.append("\ncilidrada = " + this.cilidrada);
        return sb.toString();
    }
}
