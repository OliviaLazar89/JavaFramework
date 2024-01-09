package OOPAbInterfete;

public class AngajatStudent extends Persoana implements StudentInt,AngajatInt{
    public AngajatStudent(String nume, String prenume, Integer varsta) {
        super(nume, prenume, varsta);
    }

    @Override
    public void munceste() {
        System.out.println("Angajatul student munceste");
    }

    @Override
    public void primesteSalariu() {
        System.out.println("Angajatul student primeste salariu");
    }

    @Override
    public void areConcediu() {
        System.out.println("Angajatul student merge in concediu");
    }

    @Override
    public void mergeLaFacultate() {
        System.out.println("Angajatul student merge la facultate");
    }

    @Override
    public void sustineExamene() {
        System.out.println("Angajatul student sustine examene");
    }

    @Override
    public void mergeInVacanta() {
        System.out.println("Angajatul student merge in vacanta");
    }

    @Override
    public void treceRestante() {
        System.out.println("Angajatul student merge in restante");
    }
}
