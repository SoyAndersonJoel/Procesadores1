package procesadores;

public class Procesadore_Escritorio extends Procesadores{
    String Socket;

    public Procesadore_Escritorio() {
    }

    public Procesadore_Escritorio(int nucleos, double consumo, String nombre, String socket) {
        super(nucleos, consumo, nombre);
        Socket = socket;
    }

    //metodos personalizados
    public void immprmir_datos_escritorio(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Consumo: " + getConsumo());
        System.out.println("Socket: " + Socket);

    }
}
