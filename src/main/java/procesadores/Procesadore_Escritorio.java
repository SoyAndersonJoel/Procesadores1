package procesadores;

public class Procesadore_Escritorio extends Procesadores{
    private String socket;

    // Constructor vacío
    public Procesadore_Escritorio() {
    }

    // Constructor con parámetros
    public Procesadore_Escritorio(int nucleos, double consumo, String nombre, String socket) {
        super(nucleos, consumo, nombre);
        this.socket = socket;
    }

    // Métodos personalizados
    public void imprimir_datos_escritorio() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Consumo: " + getConsumo());
        System.out.println("Socket: " + socket);
    }

    // Método para cambiar el socket
    public void cambiar_socket(String nuevoSocket) {
        this.socket = nuevoSocket;
    }

    // Método para verificar la compatibilidad con una placa madre específica
    public boolean esCompatible(String socketPlacaMadre) {
        return this.socket.equals(socketPlacaMadre);
    }

    // Método para calcular la eficiencia del procesador
    public double calcular_eficiencia() {
        return getNucleos() / getConsumo();
    }

    // Método para imprimir todos los datos del procesador (incluidos los de la clase base)
    public void imprimir_todos_datos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Núcleos: " + getNucleos());
        System.out.println("Consumo: " + getConsumo());
        System.out.println("Socket: " + socket);
    }

    // Getters y Setters adicionales si son necesarios
    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }
}
