package praktikum2.soal2;

public class Coffe {
    private String customer;
    public String coffeName, size;
    public int price;
    final double tax = 0.11;

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getCustomer() {
        return customer;
    }

    public String getcoffename() {
        return coffeName;
    }

    public String getsize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public double getTax() {
        return this.price * tax;
    }

    public void info() {
        System.out.println("Nama Kopi: " + getcoffename());
        System.out.println("Ukuran: " + getsize());
        System.out.println("Harga: Rp. " + getPrice());
    }
}
