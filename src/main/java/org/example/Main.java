package org.example;

import procesadores.*;

public class Main {
    public static void main(String[] args) {
//
        Procesadores_AMD AMD1 = new Procesadores_AMD();
        Procesadores_AMD AMD2 = new Procesadores_AMD(50,20.0,"DU","HIDL","si");
        //Christian Márquez Integrante 1
        Procesadores_AMD AMD3 = new Procesadores_AMD(8, 95.0, "Rysen 9 5900x",  "AM4", "60°C");
        Procesadores_Intel Intel1 = new Procesadores_Intel(6, 65.0, "Core i5-11600K", true);
        Procesadores_Moviles Moviles1 = new Procesadores_Moviles(8, 15.0, "Snapdragon 888", true);


//      integrante2
        Procesadores_Intel intel1 = new Procesadores_Intel();
        Procesadores_Intel intel2 = new Procesadores_Intel(14,2.5,"core 9",true);
        //Alisson Muñoz integrante2
        Procesadores_AMD AMD = new Procesadores_AMD(12, 150.0, "Ryzen 9 5900HX", "AM4", "70°C");
        Procesadores_Intel Intel = new Procesadores_Intel(8, 3.2, "Core i7", true);
        Procesadore_Escritorio esc = new Procesadore_Escritorio(8, 95.0, "Intel Core i7-11700K", "LGA 1200");

//        integrante3
        Procesadores p1 = new Procesadores();
        Procesadores_Moviles Pm1 = new Procesadores_Moviles();

        //Darwin Cachimil integrante 3
        Procesadores_AMD amd01 = new Procesadores_AMD(14, 130.0, "Ryzen 5", "AM4", "60°C");
        Procesadores_Intel intel01 = new Procesadores_Intel(8, 4.2, "Core 9", true);
        Procesadore_Escritorio esct01 = new Procesadore_Escritorio(10, 100.0, "Intel Core 5", "1200");

        //Crea un metodo Personalizado para Moviles Drawin

        //Crea una variables de instancia para AMD
        Procesadores_AMD procesadorAMD = new Procesadores_AMD(8, 95.5, "Ryzen 7 5800X", "AM4", "45°C");

        // Acceder a las variables de instancia y métodos
        System.out.println("Nombre: " + procesadorAMD.getNombre());
        System.out.println("Núcleos: " + procesadorAMD.getNucleos());
        System.out.println("Consumo: " + procesadorAMD.getConsumo() + " W");
        procesadorAMD.mostrarTemperatura();






    }
}
