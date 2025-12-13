import java.util.Scanner;

public class SC01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt(); // adik dira melakukan permainan sebanyak N kali

        int[] permainan = new int[N];

        for (int i = 0; i < N; i++) {
            permainan[i] = input.nextInt();
            // [6, 1, 4]
        }

        for(int i = 0; i < N; i++){ // int i = 1, int i = 2, int i = 3, int i = 4 
            int mod = permainan[i] % 4;
            // [6, 1, 4]
            // ["HIDUP HIDUP", "HIDUP MATI", "MATI MATI"]


            switch (mod) {
                case 1:
                    System.out.println("HIDUP MATI");
                    
                    break;
                
                case 2:
                    System.out.println("HIDUP HIDUP");

                    break;
                
                case 3:
                    System.out.println("MATI HIDUP");

                    break;
                
                case 0:
                    
                    System.out.println("MATI MATI");
                    break;
                
                default:
                    break;
            }

            // if (mod == 0) {
            //     System.out.println("MATI MATI");
    
            // } else if (mod == 1) {
            //     System.out.println("HIDUP MATI");
    
            // } else if (mod == 2) {
            //     System.out.println("HIDUP HIDUP");
    
            // } else if (mod == 3) {
            //     System.out.println("MATI HIDUP");
            // }
        } 


    }
}
