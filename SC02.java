import java.util.Scanner;

public class SC02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String masukan = sc.nextLine();
        String[] arr = masukan.split(" ");

        int indexTerakhir = arr.length - 1;
        String kataAkhir = arr[indexTerakhir];
        

        for (int i = 0; i < arr.length; i++) {
            if ((i + 1) % 2 == 0) {
                arr[i] = balikkanKata(arr[i]);
            }
        }

       for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + kataAkhir + " ");
       }


    }


    public static String balikkanKata(String kata){
        String hasil = ""; // H A D U

        for (int i = kata.length() - 1; i >= 0; i--) { // i = 2, i = 1, i = 0
            hasil += kata.charAt(i);
        }

        return hasil;
    }

}
