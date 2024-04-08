/*
/usr/local/Cellar/openjdk/21.0.2/bin/javac JavaCode5.java
/usr/local/Cellar/openjdk/21.0.2/bin/java JavaCode5
*/

// import

public class JavaCode5 {

    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------");

        System.out.println("Java Code 5");
        System.out.println("Java - Multidimensional Arrays");
        System.out.println("");

        System.out.println("Two dimensional array");
        // 7 rows ang 5 columns
        int[][] weekly_sales_report = new int[7][5];
        System.out.println("Total items in array = 35 (7x5)");

        // Print items in 2D array
        for (int i = 0; i < weekly_sales_report.length; i++) {
            for (int j = 0; j < weekly_sales_report[i].length; j++) {
                System.out.print(weekly_sales_report[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("------------------------------------------------------------");
        
    }
}