package VariabilaMetoda;

import org.testng.annotations.Test;

public class Student {

    @Test
    public void metodatest(){

        System.out.println(get_marire(30));
        calcul_medie(6.5,8.5,"Semestrul 1");
    }
    //metoda care calculeaza salariul unei persoane dupa o marire
    public Integer get_marire(Integer procent){
        Integer salar=15000;
        Integer marire=(salar*procent)/100;
        return salar+marire;
    }

        public Double get_medie (Double n1,Double n2) {
            return (n1+n2)/2;
            }
        public void calcul_medie (Double n1, Double n2, String text){
            System.out.println("Media pe "+text+" este " + get_medie(n1,n2));
        }
}
