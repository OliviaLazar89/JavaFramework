package StaticKeyword;

import org.testng.annotations.Test;

public class StaticTest {

    @Test

    public void testMethod(){
        Elev unu = new Elev("Popescu", "Ciprian");
        unu.prezentareElev();

        Elev doi = new Elev("Popescu2", "Ciprian2");
        doi.prezentareElev();

        Elev trei = new Elev("Popescu3", "Ciprian3");
        trei.prezentareElev();
    }
}
