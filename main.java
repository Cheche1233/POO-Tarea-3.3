public abstract class Vehiculo {
    protected String placa;
    protected String marca;
    protected String modelo;
    protected int capacidad;
    protected int velocidadMaxima;
    
    public Vehiculo(String placa, String marca, String modelo, int capacidad, int velocidadMaxima) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.velocidadMaxima = velocidadMaxima;
    }
    
    public abstract void encender();
    public abstract void apagar();
    public abstract void acelerar(int incremento);
}

public interface Localizable {
    void actualizarUbicacion(double latitud, double longitud);
    double[] obtenerUbicacionActual();
}

public interface Mantenible {
    void realizarMantenimiento();
    boolean esNecesarioMantenimiento();
}

public class Autobus extends Vehiculo implements Localizable, Mantenible {
    private boolean enServicio;
    private double[] ubicacionActual;
    private int kilometraje;

    public Autobus(String placa, String marca, String modelo, int capacidad, int velocidadMaxima) {
        super(placa, marca, modelo, capacidad, velocidadMaxima);
        this.enServicio = false;
        this.ubicacionActual = new double[]{0.0, 0.0};
        this.kilometraje = 0;
    }

    
    public void encender() {
        // Implementación del método
    }

    public void apagar() {
        // Implementación del método
    }


    public void acelerar(int incremento) {
        // Implementación del método
    }

   
    public void actualizarUbicacion(double latitud, double longitud) {
        this.ubicacionActual[0] = latitud;
        this.ubicacionActual[1] = longitud;
    }

    
    public double[] obtenerUbicacionActual() {
        return this.ubicacionActual;
    }

    
    public void realizarMantenimiento() {
        // Implementación del método
    }

    
    public boolean esNecesarioMantenimiento() {
        // Implementación del método
        return false;
    }
}
