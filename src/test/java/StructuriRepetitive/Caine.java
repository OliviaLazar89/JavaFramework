package StructuriRepetitive;

import org.testng.annotations.Test;

public class Caine {
    //Structuri repetitive= For, While, For each

    @Test
    public void metoda_test(){
//        afisare_numere_for();
//        afisare_numere_while();
//        afisare_nume();
        suma_numere();
//        afisare_nr_div();

    }

    //Afisam primele 10 numere, 50 numere, etc
    public void afisare_numere_for(){
        for (Integer index=0;index<50;index++) {
            //index++ incrementeaza cu 1; e tot aia cu index=index+1
            //index-- scade cu 1
            System.out.println(index);
        }

    }

    public void afisare_numere_while(){
        Integer index=0;
        while (index<50){
            System.out.println(index);
            index++;
        }

    }

    //afisam numele  nostru de 5 ori
    public void afisare_nume(){
        for (Integer index=0;index<5;index++){
            System.out.println("Olivia");
        }

    }
    //calculam suma primelor 10 nre

    public void suma_numere(){
        Integer index=0;
        Integer suma_numere=index;
        while (index<=10){
           suma_numere=suma_numere+index;
            index++;
        }
        System.out.println("Suma numerelor este "+suma_numere);
    }

    //afisam primele 3 numere divizibile cu 5

    public void afisare_nr_div(){
        Integer contor=0;
        for (Integer index=0;index<21;index++){
            if (index%5==0 && contor<3){
                contor++;
                System.out.println(index);
            }
//            if (contor==3){
//                break;
//            }
        }
    }
}
