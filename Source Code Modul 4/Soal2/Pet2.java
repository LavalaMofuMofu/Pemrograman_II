package praktikum4.Soal2;

public class Pet2 {
    private String name;
    private String race;

    public Pet2(String name, String race) {
        this.name = name;
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }

    public void display() {
        System.out.println();
        System.out.println("Detail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah: " + getName());
        System.out.println("Dengan ras: " + getRace());
    }
}
