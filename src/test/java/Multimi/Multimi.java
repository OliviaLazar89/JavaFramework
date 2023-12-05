package Multimi;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class Multimi {

    @Test

    public void metoda_test(){
 //       nume_cursanti_array();
 //       nume_cursanti_lista();
 //       obiecte_hashmap();
  //      tari_orase();
  //      retete_gatit();
        retete_gatit("Tiramisu");



    }

    //afisam numele cursantilor
    public void nume_cursanti_array(){  //se numeste si vector
        String[] nume_cursanti=new String[4];
        nume_cursanti[0]="Adi";
        nume_cursanti[1]="Anca";
        nume_cursanti[2]="Andreea";
        nume_cursanti[3]="Claudia";

        for (Integer index=0;index<nume_cursanti.length;index++){
            System.out.println(nume_cursanti[index]);
        }
    }



    public void nume_cursanti_lista(){
        List<String> nume_cursanti=new ArrayList<>();
        nume_cursanti.add("Cosmin");
        nume_cursanti.add("Diana");
        nume_cursanti.add("Letitia");
        nume_cursanti.add("Oana");

        for (Integer index=0;index<nume_cursanti.size();index++){
            System.out.println(nume_cursanti.get(index));
        }
    }

    //Hashmap=key-value
    public void obiecte_hashmap(){ //se numeste si colectie cheie-valoare
        HashMap<String,String> obiecte=new HashMap<>();
        obiecte.put("electronic","telefon");
        obiecte.put("aliment","supa");
        obiecte.put("masina","Ford");
       for (String key: obiecte.keySet()){   //returneaza multimea de chei
           System.out.println("Cheia este "+key);
           System.out.println("Valoarea este "+obiecte.get(key));
       }
    }

    //reprezentam niste tari cu orase

    public void tari_orase(){
        HashMap<String,List<String>> testData= new HashMap<>();

        List<String>orase_romania=new ArrayList<>();
        orase_romania.add("Timisoara");
        orase_romania.add("Arad");
        orase_romania.add("Oradea");

        List<String>orase_italia=new ArrayList<>();
        orase_italia.add("Roma");
        orase_italia.add("Florenta");
        orase_italia.add("Venetia");

        List<String>orase_spania= new ArrayList<>();
        orase_spania.add("Barcelona");
        orase_spania.add("Madrid");
        orase_spania.add("Sevilla");

        testData.put("Romania",orase_romania);
        testData.put("Italia",orase_italia);
        testData.put("Spania",orase_spania);

        for (String key: testData.keySet()){
            System.out.println("Tara este "+key);
            System.out.println("Orasele sunt "+ testData.get(key));
        }
    }

    //definim retete de gatit
    public void retete_gatit(String reteta){
        HashMap<String, List<String>> carteBucate= new LinkedHashMap<>(); // Linked hashmap pune elementele din hashmap in ordinea in care sunt scrise

        List<String> ciorbaRadauteana = new ArrayList<>();
        ciorbaRadauteana.add("Morcovi - 2 buc");
        ciorbaRadauteana.add("Ceapa - 3 buc");
        ciorbaRadauteana.add("Telina - 1/2 buc");
        ciorbaRadauteana.add("Smantana");
        ciorbaRadauteana.add("Galbenus ou");
        ciorbaRadauteana.add("Apa 4 L");
        ciorbaRadauteana.add("Carne de pui 500 g");
        ciorbaRadauteana.add("Sare si piper dupa gust");

        List<String> tiramisu= new ArrayList<>();
        tiramisu.add("Piscoturi 400 g");
        tiramisu.add("Mascarpone 500 g");
        tiramisu.add("Cafea 50 ml");
        tiramisu.add("Amaretto 20ml");
        tiramisu.add("Oua 3 buc");
        tiramisu.add("Zahar 3 linguri");

        carteBucate.put("Ciorba radauteana ",ciorbaRadauteana);
        carteBucate.put("Tiramisu", tiramisu);

        for (String key : carteBucate.keySet()) {
            if (key.equals(reteta)) {

                System.out.println("Reteta  este pentru " + key);
                System.out.println("Ingredientele pentru reteta sunt " + carteBucate.get(key));
            }
        }

    }
}
