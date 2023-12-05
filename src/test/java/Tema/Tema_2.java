package Tema;

import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Tema_2 {

    @Test
    public void metoda_test() {
        //   afisare_DA();
        //numere(2,35,17);
        //afisare_nr_div();
        //nr_poz_par();

    }

    //Afiseaza de 5 ori cuvantul "DA" pe acelasi rand cu un spatiu intre
    public void afisare_DA() {
        for (Integer index = 0; index < 5; index++) {
            System.out.print("DA ");
        }
    }


    //3 numere cu valori diferite.Daca suma primelor 2 numere este mai mare decat al 3 lea numar afisam un mesaj corespunzator +valoarea sumei, altfel afisam contrariul
    public void numere( Integer a,Integer b,Integer c  ) {
        Integer suma=a+b;

       if (suma>c) {
           System.out.println("Al treilea nr este mai mic decat " + suma);
       }
       else {
           System.out.println("Al treilea nr este mai mare decat "+ suma);
           }

    }

    //Primele 5 numere divizibile cu 3
    public void afisare_nr_div() {
        Integer contor = 0;
        for (Integer index = 0; index < 100; index++) {
            if (index % 3 == 0 && contor < 5) {
                contor++;
                System.out.println(index);
            }
        }
    }

    //Primele 4 numere pozitive si pare
    public void nr_poz_par() {
        Integer contor = 0;
        for (Integer index = 0; index < 100; index++) {
            if (index >0 && index % 2==0 && contor < 4) {
                contor++;
                System.out.println(index);
            }
        }
    }


}
