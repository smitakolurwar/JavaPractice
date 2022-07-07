package StringPrograms;

public class ReverseString {

    public static void main(String[] args) {
         String str = "My name is smita";
         String str1 = "  How are you";
        System.out.println(reverseWithStringBuilder(str, str1));
    }

    private static String reverseWithStringBuilder(String str, String str1){
        return new StringBuilder(str +  str1).reverse().toString();
    }
}











// reverse string

