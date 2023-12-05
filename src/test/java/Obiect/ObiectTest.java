package Obiect;

import org.testng.annotations.Test;

public class ObiectTest {
    @Test
    public void testMethod(){
        FabricaMasini MercedesG63AMG = new FabricaMasini("Mercedes","G 63 AMG",
        "Electric","Manuala",2023, 4.89);

        MercedesG63AMG.prezentare_produs();
        MercedesG63AMG.calculImpozit();
        System.out.println("=============================");
        FabricaMasini Daewoo = new FabricaMasini("Daewoo","Matiz","GPL",
                "Automata",2003,0.8);

        Daewoo.prezentare_produs();
        Daewoo.calculImpozit();
        System.out.println("=============================");

        FabricaMasini AudiR8 = new FabricaMasini("Audi","R8","Electric",
                "Manuala", 2022, 3.2,99000);
        AudiR8.prezentare_produs();
        System.out.println("=============================");
        AudiR8.calculImpozit();
    }


}
