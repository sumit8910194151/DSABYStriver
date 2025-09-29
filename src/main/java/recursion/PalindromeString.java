package recursion;

public class PalindromeString {
    public static void main(String[] args) {
        String strMadam="MADAM";
        System.out.println("is MADAM is palindrome: "+isPalindrome(strMadam,0,strMadam.length()));

    }
    private static boolean isPalindrome(String str, int i,int n){
      if(i>=n/2)
          return true;
      if(str.charAt(i)!=str.charAt(n-i-1))
          return false;
      return isPalindrome(str,i+1,n);

    }

}
