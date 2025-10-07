package praktikum2.soal1;

public class Soal1Main {
    public static void main(String[] args){
       FruitCount apple = new FruitCount();
       apple.setName("apel");
       apple.setWeight(0.4);
       apple.setPrice(7000.0);
       apple.setTotalBuy(40);
       apple.show();

       FruitCount mango = new FruitCount();
       mango.setName("mangga");
       mango.setWeight(0.2);
       mango.setPrice(3500.0);
       mango.setTotalBuy(15);
       mango.show();

       FruitCount avocado = new FruitCount();
       avocado.setName("alpukat");
       avocado.setWeight(0.25);
       avocado.setPrice(10000.0);
       avocado.setTotalBuy(12);
       avocado.show();
    }
}
