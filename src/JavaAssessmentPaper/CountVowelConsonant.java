package JavaAssessmentPaper;

public class CountVowelConsonant {
    public static void main(String[] args) {

        String str = "Java Programming";
        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < str.length(); i++) {
            {
                char ch = str.charAt(i);
                if (Character.isLetter(ch)) {
                    ch = Character.toLowerCase(ch);
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vowelCount++;
                    } else {
                        consonantCount++;
                        if (str.startsWith("j")) {
                            System.out.println("Yes");
                            {
                                System.out.println("No");

                            }

                        }
                    }
                }
            }
        }
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
        System.out.println(str.toUpperCase());


    }
}
