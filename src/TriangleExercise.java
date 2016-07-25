public class TriangleExercise {
    public static void main(String[] args) {
        for(int i = 1; i <= 3; i++) {
            printNstarHorizontal(i);
        }
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

}


