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
public class StarPatterns {
    public static void main(String[] args) {
        int n = 5;

        printPatternLabel("Triangle Pattern");
        printTriangle(n);

        printPatternLabel("Reversed Triangle Pattern");
        printReversedTriangle(n);

        printPatternLabel("Diamond Pattern");
        printDiamond(n);
    }

    // Method to print a label for each pattern
    private static void printPatternLabel(String label) {
        System.out.println("\n" + label);
        System.out.println("=".repeat(label.length()));
    }

    // Method to print a right-angled triangle
    public static void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            printStars(i);
        }
    }

    // Method to print a reversed right-angled triangle
    public static void printReversedTriangle(int n) {
        for (int i = n; i >= 1; i--) {
            printStars(i);
        }
    }

    // Method to print a diamond shape
    public static void printDiamond(int n) {
        for (int i = 1; i <= n; i++) {
            printLine(n - i, 2 * i - 1);
        }
        for (int i = n - 1; i >= 1; i--) {
            printLine(n - i, 2 * i - 1);
        }
    }

    // Method to print a line of stars
    private static void printStars(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    // Method to print a line with spaces and stars for diamond shape
    private static void printLine(int spaces, int stars) {
        System.out.print(" ".repeat(spaces));
        System.out.println("*".repeat(stars));
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
