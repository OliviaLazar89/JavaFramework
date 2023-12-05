package VariabilaMetoda;

import org.testng.annotations.Test;

public class Cursant  {

    //Primul curs
    //Clasa=un sablon specific unui obiect care contine variabile si metode
    //Identificam o clasa dupa cuvantul class
    //O clasa trebuie sa aiba un nume
    //Continutul unei clase se regaseste intre acolade
    //Intr-un fisir java putem avea mai multe clase
    //Variabila = proprietate a unei clase
    //Variabilele sunt de 2 feluri : global si local
    //Variabila globala= este vizibila peste tot in clasa
    //Variabila locala= este vizibila doar in locul declarat
    //Variabila globala= public tip de data nume variabila
    //Variabila poate sau nu sa primeasca o valoare
    //Metoda= actiunea unei clase
    //Metodele sunt de 2 feluri: void si return
    //Void= Metoda care executa si arata actiunea
    //Return= Metoda care returneaza actiunea
    //Float merge pe 32 biti, double merge pe 64 biti
    public String nume;
    public String prenume;
    public Integer varsta;
    public String adresa;
    public Double inaltime;
    public Float greutate;
    public Character sex;
    public Boolean areStudii;

    @Test
    public void metodatest(){

        afisareDate();
        CalculMedie("Semestrul 1",9.25, 6.50);
        CalculMedie("Semestrul 2",8.00, 7.50);
        CalculPret(10);
        CalculPret(20);
    }

    public void afisareDate(){
        nume="Lazar";
        prenume="Olivia";
        varsta=34;
        adresa="Timisoara, nr 54";
        inaltime=1.63;
        greutate=50.0f;
        sex='F';
        areStudii=true;

        System.out.println("Numele cursantului este " + nume + " " + prenume);
        System.out.println("Varsta cursantului este " +varsta);
        System.out.println("Adresa cursantului este " +adresa);
        System.out.println("Inaltimea cursantului este " +inaltime );
        System.out.println("Greutatea cursantului este " + greutate);
        System.out.println("Sexul cursantului este "+sex);
        System.out.println("Are cursantul studii? "+ areStudii);
        //de preferat ghilimele in loc de apostrof ca sa ruleze bine codul,
        // la apostrof nu a returnat ce trebuia
        //APOSTROFUL SE FOLOSESTE DOAR CAND AI UN CARACTER - CHAR
        //System.out.println(varsta + " " + adresa);
        //System.out.println(inaltime + " " + greutate + " " + sex);
        //System.out.println(areStudii);
   }
    public void CalculMedie(String tipnote, Double nota1, Double nota2){
             Double rezultat=(nota1+nota2)/2;
       System.out.println("Media cursantului la "+tipnote+" este " +rezultat);
    }
    public void CalculPret(Integer reducere){    //Integer reducere e un parametru; prametrii stau intre paranteze rotunde
        Integer pret=1000;
        System.out.println("Pretul initial al cursului este "+pret);
        Integer diferentapret=(pret*reducere)/100;
        Integer pretfinal=pret-diferentapret;
        System.out.println("Pretul final dupa reducere este "+pretfinal);
    }
}