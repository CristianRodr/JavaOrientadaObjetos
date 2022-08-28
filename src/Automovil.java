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

    public String acelerar(int rpm) {
        return "el auto " + this.fabricante + " acelerando a " + rpm + " rpm";
    }

    public  String frenar() {
        return this.fabricante + " " + this.modelo + " frenando!";
    }

    public String aclerarFrenar(int rpm) {
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }
}
