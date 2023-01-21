package selection_Statement;

public class Ex_3 {

    public static void main(String[] args) {

        int age = 20;

        if (age == 10) {// 20==10 go else if
            System.out.println("Your age is 10");
        } else if(age==20){// 20==20 go output
            System.out.println("Your age is 20");
        }else {
            System.err.println("Unknown Age");
        }
    }
}