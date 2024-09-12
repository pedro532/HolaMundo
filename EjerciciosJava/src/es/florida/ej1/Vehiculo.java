package es.florida.ej1;

public class Vehiculo {
    // Atributos
    private String tipo;
    private String marca;
    private String modelo;

    // Constructor
    public Vehiculo(String tipo, String marca, String modelo) {
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
    }

    // Métodos para obtener la información del vehículo
    public String getTipo() {
        return tipo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    // Método para mostrar la información del vehículo
    public void mostrarInformacion() {
        System.out.println("Tipo: " + tipo + ", Marca: " + marca + ", Modelo: " + modelo);
    }
}
