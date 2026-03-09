/**
 * OOPSBannerApp
 *
 * UC5: Render OOPS as Banner using Inline Array Initialization
 *
 * Refactored version using inline array initialization with String.join()
 *
 * @author Ankit
 * @version 5.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Declare and initialize banner array in one statement
        String[] banner = {

            String.join(" ",
                    "  *****  ",
                    "  *****  ",
                    " ******  ",
                    " ******  "),

            String.join(" ",
                    " *     * ",
                    " *     * ",
                    " *      *",
                    " *       "),

            String.join(" ",
                    "*       *",
                    "*       *",
                    " *      *",
                    " *       "),

            String.join(" ",
                    "*       *",
                    "*       *",
                    " ******  ",
                    " *****   "),

            String.join(" ",
                    "*       *",
                    "*       *",
                    " *       ",
                    " *       "),

            String.join(" ",
                    " *     * ",
                    " *     * ",
                    " *       ",
                    " *       "),

            String.join(" ",
                    "  *****  ",
                    "  *****  ",
                    " *       ",
                    " ******  ")
        };

        // Enhanced for-loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}