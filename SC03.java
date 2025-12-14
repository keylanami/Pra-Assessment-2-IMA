import java.util.Scanner;

public class SC03 {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);

        int jumlahPlayer = hi.nextInt(); 
        int amsyongNum = hi.nextInt(); 

        int[] angkaTiapPlayer = new int[jumlahPlayer]; // nampung angka angka yg bakal dimasukkin player

        for (int i = 0; i < jumlahPlayer; i++) { 
            angkaTiapPlayer[i] = hi.nextInt(); // "submit" angka tiap player, ditaroh ke array
        }

        // nambahin semua angka satu sama lain
        for (int i = 0; i < jumlahPlayer; i++) { 
            for(int j = i + 1; j < jumlahPlayer; j++){
                if (angkaTiapPlayer[i] + angkaTiapPlayer[j] == amsyongNum) { // kalo jumlah angka 2 pemain = target angka amsyong, maka 2 pemain itu kalah
                    System.out.println( "PLAYER KE: " + (i + 1) + " DAN PLAYER KE: " +  (j + 1) + " KALAH");
                }
            }
        }

    }
}

