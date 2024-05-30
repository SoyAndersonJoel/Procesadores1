package procesadores;

public class Procesadores {
    int nucleos;
    double consumo;
    String nombre;


    // constructor
    public Procesadores() {
    }

    public Procesadores(int nucleos, double consumo, String nombre) {
        this.nucleos = nucleos;
        this.consumo = consumo;
        this.nombre = nombre;
    }

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    //    Metodos Presonalizados


    public void mostrar() {
        System.out.println("Nucleos: " + nucleos);
        System.out.println("Consumo: " + consumo);
        System.out.println("Nombre: " + nombre);
        System.out.println("");
    }

}
