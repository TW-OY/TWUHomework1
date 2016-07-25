public class TriangleExercise {
    public static void main(String[] args) {
        printCenteredTriangle(4);
    }

    public static void printNCharHorizontal(int n, String s) {
        for (int i = 0; i < n; i++) {
            System.out.print(s);
        }
        System.out.print('\n');
    }

    public static void printNstarVertical(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println('*');
        }
    }

    public static void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            printNCharHorizontal(i, "*");
        }
    }

    public static void printCenteredTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n * 2 - 1; j++) {
                if(j >= ((n * 2) - 1) / 2 - i && j <= ((n * 2) - 1) / 2 + i ){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}

