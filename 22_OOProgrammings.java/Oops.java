// import java.util.*;

public class Oops { 

    public static void main(String args[]){ 
        Pen p1 = new Pen();//created a pen object called p1(constructor)
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        //p1.setColor("yellow");
        p1.color = "yellow";
        System.out.println(p1.color);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "shradhakhapra";
        // myAcc.setPassword("asdfgbv");
    }
}

class BankAccount{
    public String username;
    // private String password;
    // public void setPassword(String pwd){
    //     password = pwd;
    // }
}

class Pen{// class names starts with capital letter
    //prop + fun
    String color;
    int tip;

    void setColor(String newColor){//functions starts with small letter
       color = newColor; 
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

// class Student{
//     String name:
//     int age:
//     float percentage;//cgpa

//     void calcPercentage(int phy, int chem, int math){
//         percentage = (phy + chem + math)/ 3;
//     }
// }
