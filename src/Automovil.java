public class Automovil {

    private String fabricante;
    private String modelo;
    private String color = "gris";
    private double cilidrada;
    private int capacidadEstanque = 40;
    private static String colorPatente = "Naranja";
    private  static int capacidadEstanqueEstatico = 30;

    //constructor
    public  Automovil() {

    }

    public Automovil(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, String color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, String color, double cilidrada) {
        this(fabricante, modelo, color);
        this.cilidrada = cilidrada;
    }

    public Automovil(String fabricante, String modelo, String color, double cilidrada, int capacidadEstanque) {
        this(fabricante, modelo, color, cilidrada);
        this.capacidadEstanque = capacidadEstanque;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCilidrada() {
        return cilidrada;
    }

    public void setCilidrada(double cilidrada) {
        this.cilidrada = cilidrada;
    }

    public int getCapacidadEstanque() {
        return capacidadEstanque;
    }

    public void setCapacidadEstanque(int capacidadEstanque) {
        this.capacidadEstanque = capacidadEstanque;
    }

    public static String getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(String colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    public String detalle() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nfabricante = " + this.fabricante);
        sb.append("\nmodelo = " + this.modelo);
        sb.append("\ncolor = " + this.color);
        sb.append("\npatenteColor = " + colorPatente);
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

    public static float calcularConsumoEstatico(int km, int porcentajeBencida) {
        return km / (Automovil.capacidadEstanqueEstatico * (porcentajeBencida / 100f));
    }
}
