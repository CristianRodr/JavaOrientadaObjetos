public class Automovil {

    private int id = 0;
    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS;
    private double cilidrada;
    private int capacidadEstanque = 40;
    private static Color colorPatente = Color.NARANJO;
    private static int capacidadEstanqueEstatico = 30;
    private static int ultimoId;


    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
    public static final int VELOCIDAD_MAX_CIUDAD = 60;

    public static final String COLOR_ROJO = "Rojo";
    public static  final String COLOR_AMARILLO = "Amariilo";
    public static  final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS = "Gris Oscuro";

    //constructor
    public Automovil() {
        this.id = ++ultimoId;
    }

    public Automovil(String fabricante, String modelo) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, double cilidrada) {
        this(fabricante, modelo, color);
        this.cilidrada = cilidrada;
    }

    public Automovil(String fabricante, String modelo, Color color, double cilidrada, int capacidadEstanque) {
        this(fabricante, modelo, color, cilidrada);
        this.capacidadEstanque = capacidadEstanque;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
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

    public static Color getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(Color colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    public static int getCapacidadEstanqueEstatico() {
        return capacidadEstanqueEstatico;
    }

    public static void setCapacidadEstanqueEstatico(int capacidadEstanqueEstatico) {
        Automovil.capacidadEstanqueEstatico = capacidadEstanqueEstatico;
    }

    public String detalle() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nauto.id = " + this.id);
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
