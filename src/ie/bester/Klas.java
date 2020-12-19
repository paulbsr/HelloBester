package ie.bester;

//1. createCLASS
public class Klas {

    //2. createFIELD (variables)
    private int veld = 24;

    //3. createMETHOD
    public int metode() {
        return 0;
    }

    public static void main(String[] args) {

        //4. createOBJECT
        Klas objek = new Klas();

        //5. ACCESS FIELDS & METHODS OF THE CLASS
        int resultaat0 = objek.veld;
        int resultaat1 = objek.metode();

    }
}