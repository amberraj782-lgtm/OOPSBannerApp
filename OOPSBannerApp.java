import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    public static void main(String[] args) {

        String word = "OOPS";

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        patternMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        renderBanner(word, patternMap);
    }

    public static void renderBanner(String word, Map<Character, String[]> patternMap) {

        int height = 5;

        for (int row = 0; row < height; row++) {

            for (int i = 0; i < word.length(); i++) {

                char ch = word.charAt(i);

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    System.out.print(pattern[row] + " ");
                }

            }

            System.out.println();
        }
    }
}