public class PalindromeCheckerApp {
    public static void main(){
       String word = "madam";
       boolean ispalindrome = true;
       int n = word.length() - 1;
       for(int i=0; i<word.length();i++){
           if(word.charAt(i)!=word.charAt(n-i)){
               ispalindrome = false;
               break;
           }
       }
     if (ispalindrome){
         System.out.println(word+" is a Palindrome");

     }else{
         System.out.println(word+" in not a Palindrome");
     }
    }
}
