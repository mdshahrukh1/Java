// import java.util.*;
public class StringComparison {
    public static void main(String args[]){
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");
        if( s1 == s2) {
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are Not Equal");
        }

        if(s1 == s3){
            System.out.println("String are equal");
        }
        else{
            System.out.println("Strings are Not equal");
        }

        if (s1.equals(s3)) { //its check values of this strings and returns a boolean type value
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are Not equal");
        }
    }
}
