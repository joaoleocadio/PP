package com.Vehicle;

import enums.Condicao;
import jdk.swing.interop.SwingInterOpUtils;

import static enums.Origem.IMPORTADO;
import static enums.Origem.NACIONAL;

public class Main {

    public static void main(String[] args) {
	    Automovel a1 = new Automovel(1, "BMW", IMPORTADO, 150000, Condicao.USADO, 12000, 5, 3);

        Veiculo v1 = new Veiculo(4, "MAZDA", NACIONAL, 200000, Condicao.USADO, 1500);

        Pesado p1 = new Pesado(2,"Ferrari", IMPORTADO, 100000, Condicao.NOVO, 15000, true);

        Motociclo m1 = new Motociclo(3,"Mercedes", NACIONAL, 3000, Condicao.USADO, 3600, 2000);


        Stand list = new Stand();
        list.addAuto(a1);
        list.addAuto(p1);
        list.addAuto(m1);
        list.addAuto(v1);
        System.out.println(list.toString());
        /*System.out.println("----------");
        list.removeAuto(2);
        System.out.println(list.toString());*/
    }
}
