package praktikum4.Soal2;

public class catInfo extends Pet2 {
    public String furColor;

    public catInfo(String name, String race, String furColor) {
        super(name, race);
        this.furColor = furColor;
    }

    public String getFurColor() {
        return furColor;
    }

    public void display() {
        super.display();
        System.out.println("Memiliki warna bulu: " + getFurColor());
    }
}
