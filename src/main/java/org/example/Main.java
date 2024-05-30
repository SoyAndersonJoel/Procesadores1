package org.example;
import procesadores.Procesadores;
import procesadores.Procesadores_AMD;
import procesadores.Procesadores_Intel;
import procesadores.Procesadores_Moviles;

public class Main {
    public static void main(String[] args) {
//
        Procesadores_AMD AMD1 = new Procesadores_AMD();
        Procesadores_AMD AMD2 = new Procesadores_AMD(50,20.0,"DU","HIDL","si");
        //Christian Márquez Integrante 1
        Procesadores_AMD AMD3 = new Procesadores_AMD(8, 95.0, "Rysen 9 5900x",  "AM4", "60°C");
        Procesadores_Intel Intel1 = new Procesadores_Intel(6, 65.0, "Core i5-11600K", true);
        Procesadores_Moviles Moviles1 = new Procesadores_Moviles(8, 15.0, "Snapdragon 888", true);


//        integrante2
        Procesadores_Intel intel1 = new Procesadores_Intel();
        Procesadores_Intel intel2 = new Procesadores_Intel(14,2.5,"core 9",true);

        //Darwin Cachimil integrante4
        Procesadores_AMD amd1 = new Procesadores_AMD(9, 95.0, "Rysen 5",  "AM4", "60°C");
        Procesadores_Intel intel01 = new Procesadores_Intel(10, 65.0, "Core 9", false);
        Procesadores_Moviles moviles01 = new Procesadores_Moviles(4, 15.0, "Snapdragon", false);

    }
}