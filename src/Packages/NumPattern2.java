package Packages;

public class NumPattern2 {
    public static void main(String[] args) {
        int n = 20;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i * j < 10) {
                    System.out.print("00");
                } else if (i * j < 100) {
                    System.out.print("0");
                }
                System.out.print(i * j + "  ");

            }
            System.out.println();
        }
    }
}

// 01 02 03 04 0n
// 02 04 06 08 10
// 03 06 09 12 1n
// 04 08 12 16 20
// 0n 10 1n 20 2n