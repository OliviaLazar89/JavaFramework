package Tema;

import org.testng.annotations.Test;

public class Tema_1 {

    //1.verifica daca un nr este cuprins intr un interval: ex [8,15]
    //2. fisier a-cerinte

    @Test
    public void test_metod() {
        //1
        verific_nr_in_interval(7);
        verific_nr_in_interval(8);
        verific_nr_in_interval(9);
        verific_nr_in_interval(14);
        verific_nr_in_interval(15);
        verific_nr_in_interval(16);
        //2 hello world
       afisare_text();
        //3 varsta mea
       varsta();
        //4 nume prenume
        nume_prenume();
        //5 data curenta-nu stiu
        //6 calcul matematic

        calcul();
        //7 suma double
        suma(3.65,5.99,4.85);
        //8 produs integer
        produs(5,7);
        //9
        text();
        //10
        afisare_salut();
        //11
        afisare_Hello();
        //12
        propozitie();
        //mesaj final tema
        mesaj();

    }

    //1.verifica daca un nr este cuprins intr un interval: ex [8,15]
    public void verific_nr_in_interval(Integer nr) {
        if (nr >= 8 && nr <= 15) {
            System.out.println("Numarul " + nr + " apartine intervalului [8,15]");
        } else {
            System.out.println("Numarul " + nr + " nu apartine intervalului [8,15]");
        }
    }

    //2 hello world
    public void afisare_text() {
        String text = "Hello World";
        System.out.println("Afiseaza: " + text);
    }

    //3 varsta mea
    public void varsta() {
        Integer varsta_mea = 34;
        System.out.println("Varsta mea este: " + varsta_mea + " ani.");
    }

    //4 Nume si prenume
    public void nume_prenume() {
        String nume = "Lazar";
        String prenume = "Olivia";
        System.out.println("Numele meu este: " + nume);
        System.out.println("Prenumele meu este: " + prenume);
    }
    //5 data curenta
        //nu stiu

    //6 calcul matematic
    public void calcul(){
        Double inmultire = (3.0 * 4.0);
        Double p_dreapta = 2 + inmultire - 3;
        Double rez_final = p_dreapta / 3;
        System.out.println("Rezultatul corect este: "+rez_final);
    }

    //7 suma a 3 nre de tip double
    public void suma(Double a, Double b, Double c) {
        Double suma_lor = a + b + c;
        System.out.println("Suma este " + suma_lor);
    }

    //8 produs
    public void produs(Integer a, Integer b) {
        Integer produsul_lor = a * b;
        System.out.println("Produsul este " + produsul_lor);
    }

    //9 text
    public void text() {
        String mesaj="Stiu ca am calculat bine produsul ";
        System.out.print(mesaj );
        produs(5,7);
        System.out.println(mesaj);
        suma(3.7,6.5,9.7);
    }

    //10
    public void afisare_salut() {
        String text = "Salut";
        System.out.println("Afiseaza: " + text+"M");
    }
    //11
    public void afisare_Hello() {
        String text = "Hello";
        System.out.println("H"+text);
    }
    //12
    public void propozitie(){
        String text1="Ana are mere";
        String text2=",pere";
        String text3=",prune";
        System.out.println(text1+"Z"+text2+"Z"+text3+"Z");
    }
    //mesaj final tema
    public void mesaj(){
        System.out.println(" Poti pleca acasa dupa ce iti verific munca!");
    }

}
