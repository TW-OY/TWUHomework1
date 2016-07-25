public class TriangleExercise {
    public static void main(String[] args) {
        printDiamondName(4, "bill");
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
        StringBuilder centeredTriangle = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n * 2 - 1; j++) {
                if(j >= ((n * 2) - 1) / 2 - i && j <= ((n * 2) - 1) / 2 + i ){
                    centeredTriangle.append("*");
                } else{
                    centeredTriangle.append(" ");
                }
            }
            centeredTriangle.append("\n");
        }
        System.out.print(centeredTriangle.toString());
    }

    public static void printReversedCenteredTriangle(int n) {
        StringBuilder centeredTriangle = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n * 2 - 1; j++) {
                if(j >= ((n * 2) - 1) / 2 - i && j <= ((n * 2) - 1) / 2 + i ){
                    centeredTriangle.append("*");
                } else{
                    centeredTriangle.append(" ");
                }
            }
            centeredTriangle.append("\n");
        }
        centeredTriangle.reverse();
        centeredTriangle.replace(0, n * 2 + 1, "");
        System.out.print(centeredTriangle.toString());
    }

    public static void printReversedCenteredTriangleNameDiamond(int n) {
        StringBuilder centeredTriangle = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n * 2 - 1; j++) {
                if(j >= ((n * 2) - 1) / 2 - i && j <= ((n * 2) - 1) / 2 + i ){
                    centeredTriangle.append("*");
                } else{
                    centeredTriangle.append(" ");
                }
            }
            centeredTriangle.append("\n");
        }
        centeredTriangle.reverse();
        centeredTriangle.replace(0, 1, "");
        System.out.print(centeredTriangle.toString());
    }

    public static void printDiamond(int n){
        printCenteredTriangle(n);
        printReversedCenteredTriangle(n);
    }

    public static void printDiamondName(int n, String name) {
        printCenteredTriangle(n - 1);
        System.out.println(name);
        printReversedCenteredTriangleNameDiamond(n - 1);
    }

}

