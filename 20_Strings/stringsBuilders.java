
public class stringsBuilders {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("");
        for(char ch = 'a'; ch <= 'z'; ch++){
            sb.append(ch);
        }//Time complexity O(26) if we do it on a string than T.C will be O(n^2)
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
