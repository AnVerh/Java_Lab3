package Lab3;

public class Main {
    public static String findLongestPalindrome(StringBuilder input) {
        int n = input.length();
        int startCharacter = 0;
        int maxLength = 1;
        for(int i=0; i<n; i++){
            for(int k = i+2; k<n; k++){
                StringBuilder inputSubstring = new StringBuilder(input.substring(i, k));
                StringBuilder substringReversed = new StringBuilder(inputSubstring).reverse();
                if(inputSubstring.toString().equals(substringReversed.toString())){
                    if(inputSubstring.toString().length()>maxLength){
                        maxLength = inputSubstring.toString().length();
                        startCharacter = i;
                        System.out.println(inputSubstring.toString());
                    }
                }
            }
        }
        return input.substring(startCharacter, startCharacter + maxLength) ;
    }

    public static void main(String[] args) {
        StringBuilder text = new StringBuilder("bana nas are healthy, but apples are better!");
        String longestPalindrome = findLongestPalindrome(text);
        System.out.println("Найдовший паліндромний підрядок: " + longestPalindrome);
    }
}
