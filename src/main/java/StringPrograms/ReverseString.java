package StringPrograms;

public class ReverseString {

    public static void main(String[] args) {
         String str = "smita ";
        System.out.println(reverseWtihStringBuilder(str));

    }


    private static String reverseWtihStringBuilder(String str){
        return new StringBuilder(str).reverse().toString();

    }
}











// reverse string

