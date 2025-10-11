package praktikum4.Soal2;

public class dogInfo extends Pet2{
    public String furColor;
    public String[] ability;

    public dogInfo(String name, String race, String furColor, String[] ability) {
        super(name, race);
        this.furColor = furColor;
        this.ability = ability;
    }

    public String getFurColor() {
        return furColor;
    }

    public String[] getAbility() {
        return ability;
    }

    public void display() {
        super.display();
        System.out.println("Memiliki warna bulu: " + getFurColor());
        System.out.print("Memiliki Kemampuan: ");
        for (int i = 0; i < ability.length; i++) {
            System.out.print(ability[i]);
        }
    }
}