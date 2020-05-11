package ficha9;

import enums.Habilitacoes;
import enums.Tipo_programador;
import enums.tipoContrato;
import java.util.Calendar;
import java.util.Date;

public class Ficha9 {

    public static void main(String[] args) {

        Administrativo pessoa1 = new Administrativo(tipoContrato.INTEGRAL, Habilitacoes.MESTRADO, "João", "20/08/1998", 15633906, 1500);
        Programador_Java pessoa2 = new Programador_Java(1, 2, "verao", Tipo_programador.JUNIOR, "José", "16/07/1998", 1587412, 1700);
        Gestor_projeto pessoa3 = new Gestor_projeto(3, new String[]{"Java Develop", "Scrum"},  new Date(2019, Calendar.APRIL,6), "Tiago", "15/03/1987", 1257894, 1300);
        Programador_Java pessoa4 = new Programador_Java(5, 4, "calculadora", Tipo_programador.JUNIOR, "Joaquim", "22/02/1978", 125478, 1600);
        
        ProgrammingManagement lista = new ProgrammingManagement();
        
        lista.addPessoa(pessoa1);
        lista.addPessoa(pessoa2);
        lista.addPessoa(pessoa3);
        lista.addPessoa(pessoa4);
        
        lista.removerPessoa(1);
        System.out.println(lista.imprimir());
        //System.out.println(lista.toString());
    }
    
}
