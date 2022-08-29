public class Automovil {

    private String fabricante;
    private String modelo;
    private String color = "gris";
    private double cilidrada;
    private int capacidadEstanque = 40;

    public String leerFabricante() {
        return this.fabricante;
    }

    public void asignarFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String leerModelo() {
        return this.modelo;
    }

    public void asignarModelo(String modelo) {
        this.modelo = modelo;
    }

    public String leerColor() {
        return this.color;
    }

    public void asignarColor(String color) {
        this.color = color;
    }

    public double leerCilindrada() {
        return this.cilidrada;
    }

    public void asignarCilindrada(double cilidrada) {
        this.cilidrada = cilidrada;
    }

    public int leerCapacidadEstanque() {
        return this.capacidadEstanque;
    }

    public void asignarCapacidadEstanque(int capacidadEstanque) {
        this.capacidadEstanque = capacidadEstanque;
    }

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

    public String frenar() {
        return this.fabricante + " " + this.modelo + " frenando!";
    }


    public String aclerarFrenar(int rpm) {
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeBencina) {
        return km / (capacidadEstanque * porcentajeBencina);
    }

    public float calcularConsumo(int km, int porcentajeBencida) {
        return km / (capacidadEstanque * (porcentajeBencida / 100f));
    }

}
