public class PalindromeCheckerApp {
    public static void main(){
       String word = "Radar";
       boolean ispalindrome = true;
       char[]chars = word.toCharArray();
       char start = 0;
      int end = chars.length-1;
     while( start < end ) {
         if (word.charAt(end) != word.charAt(start)) {
             ispalindrome = false;
             break;
         }
         start++;
         end--;
     }

         if (ispalindrome) {
             System.out.println(word + " is a Palindrome");

         } else {
             System.out.println(word + " in not a Palindrome");
         }


         }
    }