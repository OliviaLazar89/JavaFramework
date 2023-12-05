package Structuri_alternative;

import org.testng.annotations.Test;

public class Angajat {

    @Test
    public void metoda_test(){
       zilele_sapt(3);
    }

    //Reprezentam zilele saptamanii
    public void zilele_sapt(Integer zi){
        switch (zi){
            case 1:
                System.out.println("Astazi e duminica");
                break;
            case 2:
                System.out.println("Astazi e luni");
                break;
            case 3:
                System.out.println("Astazi e marti");
                break;
            case 4:
                System.out.println("Astazi e miercuri");
                break;
        }
    }

}
