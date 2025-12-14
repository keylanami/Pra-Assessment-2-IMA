import java.util.Scanner;

public class SC02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input 1 kalimat
        String masukan = sc.nextLine();
        String[] arr = masukan.split(" "); // KALIMAT -> KATA

        int indexTerakhir = arr.length - 1; // ambil NOMOR index terakhir di array
        String kataAkhir = arr[indexTerakhir]; // akses VALUE dari INDEX TERAKHIR array arr
        

        for (int i = 0; i < arr.length; i++) { // akses genap atau ganjilnya
            if ((i + 1) % 2 == 0) {
                arr[i] = balikkanKata(arr[i]); // "arr index genap, pake 'template' balikkanKata"
            }
        }

       for (int i = 0; i < arr.length - 1; i++) { 
            System.out.print(arr[i] + kataAkhir + " "); // ngeprint + tambahin kataAkhir
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


