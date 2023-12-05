package OOP_concepte;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;


public class MostenireTest {

    @Test
    public void testMethod(){

        List<String> dotariAudiA5 = new ArrayList<>();
        dotariAudiA5.add("jenti");
        dotariAudiA5.add("trapa");
        dotariAudiA5.add("faruri");

        List<String> dotariAudiA7 = new ArrayList<>();
        dotariAudiA7.add("jenti");
        dotariAudiA7.add("trapa");
        dotariAudiA7.add("spoiler");
        dotariAudiA7.add("oglinzi electrice");

        List<String> dotariBMWX5Exterior = new ArrayList<>();
        dotariBMWX5Exterior.add("jenti");
        dotariBMWX5Exterior.add("trapa");
        dotariBMWX5Exterior.add("faruri");

        List<String> dotariBMWX5Interior = new ArrayList<>();
        dotariBMWX5Interior.add("incalzire scaune");
        dotariBMWX5Interior.add("clima bizonica");
        dotariBMWX5Interior.add("GPS");


        FabricaAudi audiA5 = new FabricaAudi("A5", "sedan", "negru",
                20, dotariAudiA5);
        audiA5.prezentareAudi();

        FabricaAudi audiA7 = new FabricaAudi("A7", "SUV", "rosu",
                40, dotariAudiA7);
        audiA7.prezentareAudi();

        audiA7.setModel("A8");

        audiA7.prezentareAudi();

        audiA7.AfisareRezultate();
        audiA7.AfisareRezultate(2022);
        audiA7.AfisareRezultate("A8");

        audiA7.AngajariFirma();



        FabricaBMW BMWX5 = new FabricaBMW("X5", "SUV", "albastru",
                30, dotariBMWX5Exterior, dotariBMWX5Interior);
        BMWX5.prezentareBMW();

        BMWX5.AngajariFirma();


    }
}
