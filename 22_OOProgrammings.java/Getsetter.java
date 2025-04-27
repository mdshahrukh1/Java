public class Getsetter {
    public static void main(String args[]){
        Pen p1 = new Pen();//created a pen object called p1(constructor)
        p1.setColor("Blue");
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.getTip());
        //p1.setColor("yellow");
        
        p1.setColor("yellow");
        System.out.println(p1.getColor());

    }
}

class Pen{// class names starts with capital letter
    //prop + fun
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){//functions starts with small letter
       color = newColor; 
    }

    void setTip(int newTip){
        tip = newTip;
    }
}
