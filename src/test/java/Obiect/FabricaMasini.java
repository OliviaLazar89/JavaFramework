package Obiect;

public class FabricaMasini {

    // Constructor = are ca rol sa initializeze atributele unei clase
    // Un constructor este public si are acelasi nume cu clasa
    // Un constructor poate sa fie de 2 feluri: cu parametrii si fara parametrii
    // Un constructor fara parametrii se mai numeste si default
    // Daca nu am definit noi un constructor, avem unul default.!!!!
    // Intr-o clasa putem avea n constructori diferentiati prin numar sau tip de parametrii
    // Obiect = instanta unei clase
    // Un obiect repr o structura pe care o are clasa si din care
    // poate accesa variabilele si metodele respective

    // Dintr o clasa putem initializa n obiecte
    // In momentul in care initializam un obiect ( cu new se initializeaza ), apelam constructorul din clasa.





    public String marca;
    public String model;
    public String combustibil;
    public String transmisie;
    public Integer an;
    public Double motorizare;
    public Integer pret;

    public FabricaMasini(String marca, String model, String combustibil,
                         String transmisie, Integer an, Double motorizare) {
        this.marca = marca;
        this.model = model;
        this.combustibil = combustibil;
        this.transmisie = transmisie;
        this.an = an;
        this.motorizare = motorizare;
    }

    public FabricaMasini(String marca, String model, String combustibil,
                         String transmisie, Integer an, Double motorizare, Integer pret) {
        this.marca = marca;
        this.model = model;
        this.combustibil = combustibil;
        this.transmisie = transmisie;
        this.an = an;
        this.motorizare = motorizare;
        this.pret = pret;
    }

    public void prezentare_produs(){
        System.out.println("Marca masinii este " + marca);
        System.out.println("Modelui masinii este " + model);
        System.out.println("Tipul de combustibil este " + combustibil);
        System.out.println("Transmisia este " + transmisie);
        System.out.println("Anul fabricarii este " + an);
        System.out.println("Motorizarea este " + motorizare);
        if ( pret != null ) {       // != simbolul asta inseamna diferit
            System.out.println("Pretul produsului este " + pret);
        }
    }

    public void calculImpozit(){
        if (an >= 2020 && combustibil.equals("Electric")){
            System.out.println("Clientul trebuie sa plateasca 5 lei");
        }
        else {
            System.out.println("Clientul trebuie sa plateasca in fct de anul masinii");
        }
    }
}
