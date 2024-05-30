package procesadores;

public class Procesadores_Intel extends Procesadores{
    boolean tarjeta_video;

    public Procesadores_Intel() {
    }

    public Procesadores_Intel(int nucleos, double consumo, String nombre, boolean tarjeta_video) {
        super(nucleos, consumo, nombre);
        this.tarjeta_video = tarjeta_video;
    }

    public boolean isTarjeta_video() {
        return tarjeta_video;
    }

    public void setTarjeta_video(boolean tarjeta_video) {
        this.tarjeta_video = tarjeta_video;
    }

    public void imprimir_datos_intel(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Consumo: " + getConsumo());
        System.out.println("Nucleos: " + getNucleos());
        System.out.println("Tarjeta_video: " + isTarjeta_video());
    }
}
