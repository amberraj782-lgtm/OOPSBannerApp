/**
 * OOPSBannerApp
 *
 * UC6: Refactor Banner Logic into Functions
 *
 * Banner patterns are generated using helper methods
 * for better modularity and reusability.
 *
 * @author Ankit
 * @version 6.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Get individual letter patterns
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Create banner array (7 lines)
        String[] banner = new String[7];

        // Combine patterns line by line
        for (int i = 0; i < 7; i++) {
            banner[i] = String.join(" ",
                    oPattern[i],
                    oPattern[i],
                    pPattern[i],
                    sPattern[i]);
        }

        // Print banner using enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Helper method for letter O
    public static String[] getOPattern() {
        return new String[] {
                "  *****  ",
                " *     * ",
                "*       *",
                "*       *",
                "*       *",
                " *     * ",
                "  *****  "
        };
    }

    // Helper method for letter P
    public static String[] getPPattern() {
        return new String[] {
                " ******  ",
                " *     * ",
                " *     * ",
                " ******  ",
                " *       ",
                " *       ",
                " *       "
        };
    }

    // Helper method for letter S
    public static String[] getSPattern() {
        return new String[] {
                " ******  ",
                "*       ",
                "*       ",
                " *****   ",
                "       * ",
                "       * ",
                " ******  "
        };
    }
}