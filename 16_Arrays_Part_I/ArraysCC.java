import java.util.*;

public class ArraysCC {
    public static void main(String[] args){
        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);
        //int phy;
        //phy = sc.nextInt();

        marks[0] = sc.nextInt();//phy
        marks[1] = sc.nextInt();//chem
        marks[2] = sc.nextInt();//math

        System.out.println("phy : " + marks[0]);
        System.out.println("chem : " + marks[0]);
        System.out.println("math : " + marks[0]);

        marks[2] = 100;

        System.out.println("math : "+ marks[2]);
        sc.close();

        int percentage = (marks[0] + marks[1] + marks[2] / 3);
        System.out.println("Percentage = "+ percentage + "%");

        System.out.println("Length of the Array : " + marks.length);
    }
}
