package procesadores;

public class Procesadores_Moviles extends Procesadores{
    boolean optimizado = false;
    public Procesadores_Moviles() {}

    public Procesadores_Moviles(int nucleos, double consumo, String nombre, boolean optimizado) {
        super(nucleos, consumo, nombre);
        this.optimizado = optimizado;
    }

    public boolean isOptimizado() {
        return optimizado;
    }

    public void setOptimizado(boolean optimizado) {
        this.optimizado = optimizado;
    }
//    Metodos Personalizados
    public void mostrar() {
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
