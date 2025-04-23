public class charOfstring {
    public static void printLetters(String str){
        for(int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i));
        }
        System.out.println();
    }

    public static void main(String args[]){
        String firstName = "Shradha";
        String lastName = "Khapra";
        String fullName = firstName + " " +lastName;
        System.out.println(fullName.charAt(1));

        printLetters(fullName);
    }
}