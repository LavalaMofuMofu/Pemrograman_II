import java.util.Scanner;

public class PRAK104_2410817210005_MuhammadIrgiFahrezha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tangan Abu: ");
        String[] moves_Abu = sc.nextLine().split(" ");

        System.out.print("Tangan Bagas: ");
        String[] moves_Bagas = sc.nextLine().split(" ");

        int scoreAbu = 0;
        int scoreBagas = 0;

        for (int i = 0; i < 3; i++) {
            String abu = moves_Abu[i];
            String bagas = moves_Bagas[i];

            if (abu.equals(bagas)) {
                // Seri, tidak ada yang mendapat skor pada ronde ini
            } else if (abu.equals("B") && bagas.equals("G")) {
                scoreAbu++;
            } else if (abu.equals("G") && bagas.equals("K")) {
                scoreAbu++;
            } else if (abu.equals("K") && bagas.equals("B")) {
                scoreAbu++;
            } else {
                scoreBagas++;
            }
        }
        if (scoreAbu > scoreBagas) {
            System.out.println("Abu");
        } else if (scoreBagas > scoreAbu) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }
        sc.close();
    }
}
