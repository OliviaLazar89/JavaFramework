package ValueTypeReferenceType;

import org.testng.annotations.Test;

public class Concediu {

    // Variabilele cand vrem sa le definim sunt de 2 categorii : primitive si non-primitive      (adica valuetype= isi pastreaza valoarea initiala si referencetype)
    // value1.  -- putem sa apelam anumite metode
    // value2. nu putem, deoarece sunt primitive  ( in general sunt folosite doar sa tina valoarea si atat)

    public Integer value1;  // e o clasa cu diverse metode pe care le putem folosi
    public int value2;  //variabile primitive
    public Double value3;
    public double value4;

    @Test
    public void testMethod(){
        value1=10;
        value2=10;
        value3=10.0;
        value4=10.4;
        int rezultat = value1.compareTo(value2);
    }
}
