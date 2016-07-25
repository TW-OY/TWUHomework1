public class TriangleExercise {
    public static void main(String[] args) {
        printTriangle(3);
    }

    public static void printNstarHorizontal(int n) {
        for(int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
    }

    public static void printNstarVertical(int n) {
        for(int i = 0; i < n; i++) {
            System.out.println("*");
        }
    }

    public static void printTriangle(int n) {
        for(int i = 1; i <= n; i++) {
            printNstarHorizontal(i);
        }
    }

}


