public class StarPatterns {
    public static void main(String[] args) {
        int n = 5;
        printTriangle(n);
        printReversedTriangle(n);
        printDiamond(n);
    }

    public static void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            printStars(i);
        }
    }

    public static void printReversedTriangle(int n) {
        for (int i = n; i >= 1; i--) {
            printStars(i);
        }
    }

    public static void printDiamond(int n) {
        for (int i = 1; i <= n; i++) {
            printLine(n - i, 2 * i - 1);
        }
        for (int i = n - 1; i >= 1; i--) {
            printLine(n - i, 2 * i - 1);
        }
    }

    private static void printStars(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    private static void printLine(int spaces, int stars) {
        System.out.print(" ".repeat(spaces));
        System.out.println("*".repeat(stars));
    }
}
