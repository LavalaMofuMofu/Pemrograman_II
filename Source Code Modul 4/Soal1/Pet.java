package praktikum4.Soal1;

public class Pet {
    private String name;
    private String race;

    public Pet(String name, String race) {
        this.name = name;
        this.race = race;
    }

    private String getName() {
        return name;
    }

    private String getRace() {
        return race;
    }

    public void display () {
        System.out.println();
        System.out.println("Detail Hewan Peliharaan: ");
        System.out.println("Nama Hewan Peliharaanku adalah : " + getName());
        System.out.println("Dengan ras : " + getRace());
    }
}
