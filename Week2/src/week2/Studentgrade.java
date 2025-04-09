package week2;

public class Studentgrade {
    public static void main(String[] args) {
        // Print the top border
        System.out.println("///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("==          Student Points          ==");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////");

        // Print table header
        System.out.println();
        System.out.printf("%-12s %-6s %-6s %-6s%n", "Name", "Lab", "Bonus", "Total");
        System.out.printf("%-12s %-6s %-6s %-6s%n", "----", "---", "-----", "-----");

        // Print student data
        System.out.printf("%-12s %-6d %-6d %-6d%n", "Oskar", 21, 8, (21 + 8));
        System.out.printf("%-12s %-6d %-6d %-6d%n", "Serchan", 55, 6, (55 + 6));
        System.out.printf("%-12s %-6d %-6d %-6d%n", "Kale", 21, 20, (21 + 20));
        System.out.printf("%-12s %-6d %-6d %-6d%n", "Gore", 55, 6, (55 + 6));
        System.out.printf("%-12s %-6d %-6d %-6d%n", "Chyante",68 , 9, (68 + 9));
    }
}


