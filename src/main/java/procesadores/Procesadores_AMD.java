package procesadores;

public class Procesadores_AMD extends  Procesadore_Escritorio{
    String temperatura;
    public Procesadores_AMD() {
    }

    public Procesadores_AMD(int nucleos, double consumo, String nombre, String socket,String temperatura) {
        super(nucleos, consumo, nombre, socket);
        this.temperatura = temperatura;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }
    public void mostrarTemperatura() {
        System.out.println("Temperatura: "+temperatura);
    }
}
