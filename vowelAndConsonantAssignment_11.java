package Assignment;

public class vowelAndConsonantAssignment_11
{
    public static void main(String[] args) {
        String inputName = "I am a SQA Engineer";
        String[] words = inputName.split(" ");
        int numberOfWords = words.length;
        int withoutSpaceWords = inputName.replaceAll(" \\+", " ").length();
        int vowelCount = 0;
        int constantCount = 0;
        String checkVowel =inputName.toLowerCase();
        for (int i = 0; i < checkVowel.length(); i++) {
            char ch = checkVowel.charAt(i);
            if (Character.isLetter(ch)) {
                if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                    vowelCount++;
                }
                else{
                    constantCount++;
                }
            }
        }


        System.out.println("Words: "+numberOfWords);
        System.out.println("Chars: "+withoutSpaceWords);
        System.out.println("Vowel: "+vowelCount);
        System.out.println("Constant: "+constantCount);
    }


}
