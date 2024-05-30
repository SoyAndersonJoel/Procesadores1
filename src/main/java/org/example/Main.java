package org.example;

import procesadores.Procesadores;
import procesadores.Procesadores_AMD;
import procesadores.Procesadores_Intel;
import procesadores.Procesadores_Moviles;

public class Main {
    public static void main(String[] args) {
//        integrante1
        Procesadores_AMD AMD1 = new Procesadores_AMD();
        Procesadores_AMD AMD2 = new Procesadores_AMD(50,20.0,"DU","HIDL","si");


//        integrante2
        Procesadores_Intel intel1 = new Procesadores_Intel();
        Procesadores_Intel intel2 = new Procesadores_Intel(14,2.5,"core 9",true);
//        integrante3
        Procesadores p1 = new Procesadores();
        Procesadores_Moviles Pm1 = new Procesadores_Moviles();

        //Crea un metodo Personalizado para Moviles Drawin




    }
}