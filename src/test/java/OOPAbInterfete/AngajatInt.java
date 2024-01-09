package OOPAbInterfete;

public interface AngajatInt {
    // Abstractizare = Conceptul pe baza caruia definim comportamentul unei clase
    // Acest concept se poate face prin INTERFETE sau CLASE ABSTRACTE
    // Putem RECUNOASTE o interfata dupa cuvantul "Interface"
    // O interfata contine DOAR METODE ABSTRACTE (metode care nu au body, adica nu au acolade)
    // O interfata se IMPLEMENTEAZA
    // Clasa care implementeaza interfata trebuie sa implementeze toate metodele abstracte
    // O clasa poate implementa N interfete
    // O clasa abstracta poate implementa una sau mai multe interfete (nu este restrictie fie ea clasa sau clasa abstracta)
    // O interfata nu poate extinde o clasa/clasa abstracta
    // O interfata poate extinde o alta interfata
    // Toate metodele dintr-o interfata sunt publice
    // Interfata nu poate avea un constructor => nu putem face un obiect dintr-o interfata

    void munceste();
    void primesteSalariu();
    void areConcediu();
}
