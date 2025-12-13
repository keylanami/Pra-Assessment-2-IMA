import java.util.Scanner;

public class SC03 {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);

        int jumlahPlayer = hi.nextInt();
        int amsyongNum = hi.nextInt();

        int[] angkaTiapPlayer = new int[jumlahPlayer];

        for (int i = 0; i < jumlahPlayer; i++) {
            angkaTiapPlayer[i] = hi.nextInt();
        }

        for (int i = 0; i < jumlahPlayer; i++) {
            for(int j = i + 1; j < jumlahPlayer; j++){
                if (angkaTiapPlayer[i] + angkaTiapPlayer[j] == amsyongNum) {
                    System.out.println( "PLAYER KE: " + (i + 1) + " DAN PLAYER KE: " +  (j + 1) + " KALAH");
                }
            }
        }

    }
}