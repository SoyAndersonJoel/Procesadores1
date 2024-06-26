package org.example;

import procesadores.*;

public class Main {
    public static void main(String[] args) {
//

        //Integrante 1
        Procesadores_AMD AMD1 = new Procesadores_AMD();
        Procesadores_AMD AMD2 = new Procesadores_AMD(50,20.0,"DU","HIDL","no");

        //Christian Márquez Integrante 1
        Procesadores_AMD AMD3 = new Procesadores_AMD(8, 95.0, "Rysen 9 5900x",  "AM4", "60°C");
        Procesadores_Intel Intel1 = new Procesadores_Intel(6, 65.0, "Core i5-11600K", true);
        Procesadores_Moviles Moviles1 = new Procesadores_Moviles(8, 15.0, "Snnapdragon 888", true);
        Procesadores_Moviles Moviles2 = new Procesadores_Moviles(8, 5.0, "Apple A14 Bionic", true);



        //Aisson Muñoz INTEGRANTE 2
        Procesadores_AMD AMD = new Procesadores_AMD(12,150.0,"Ryzen 9 590HX","AM4","70°C");

        Procesadores_Intel Intel = new Procesadores_Intel(8, 3.5,"Core ii7", true);
        Procesadore_Escritorio esc = new Procesadore_Escritorio(8,95.0,"Inntel Core i7-11700K","LGA 1200");

        Procesadores_Intel Intel2 = new Procesadores_Intel(8, 3.5,"Core i7", true);
        Procesadore_Escritorio esc2 = new Procesadore_Escritorio(8,95.0,"Intel Core i7-11700K","LGA 1200");

        Procesadores_AMD amd1 = (new Procesadores_AMD(8, 65.0, "Ryzen 7 3700X", "AM4", "65°C"));
        Procesadores_AMD amd2 =(new Procesadores_AMD(6, 95.0, "Ryzen 5 3600", "AM4", "70°C"));
        Procesadores_AMD amd3 =(new Procesadores_AMD(12, 105.0, "Ryzen 9 3900X", "AM4", "75°C"));




//      integrante3
        Procesadores_Intel intel1 = new Procesadores_Intel();
        Procesadores_Intel intel2 = new Procesadores_Intel(14,2.5,"core 9",true);



//        integrante4
        Procesadores p1 = new Procesadores();
        Procesadores_Moviles Pm1 = new Procesadores_Moviles();

        //Darwin Cachimil integrante 3
        Procesadores_AMD amd01 = new Procesadores_AMD(14, 130.0, "Ryzen 5", "AM4", "60°C");
        Procesadores_Intel intel01 = new Procesadores_Intel(8, 4.2, "Core 9", true);
        Procesadore_Escritorio esct01 = new Procesadore_Escritorio(10, 100.0, "Intel Core 5", "1200");

        //Crea un metodo Personalizado para Moviles Drawin

        //Crea una variables de instancia para AMD Mateo Cardenas 
        Procesadores_AMD procesadorAMD = new Procesadores_AMD(8, 95.5, "Ryzen 7 5800X", "AM4", "45°C");

        // Acceder a las variables de instancia y métodos
        System.out.println("Nombre: " + procesadorAMD.getNombre());
        System.out.println("Núcleos: " + procesadorAMD.getNucleos());
        System.out.println("Consumo: " + procesadorAMD.getConsumo() + " W");
        procesadorAMD.mostrarTemperatura();






    }
}
