package StringPrograms;

public class ReverseString {

    public static void main(String[] args) {
         String str = "My name is smita";
        System.out.println(reverseWithStringBuilder(str));
    }

    private static String reverseWithStringBuilder(String str){
        return new StringBuilder(str).reverse().toString();
    }
}











// reverse string

