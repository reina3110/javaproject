package selection_Statement;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex_4 {


    public static void main(String[] args) throws Exception{

        System.out.println("Enter Your age");
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
       //  String name=      reader.readLine();// buffer can read only string
        int age =Integer.parseInt(reader.readLine());// change to int from buffer
     //   System.out.println("Your age is "+age);
     //input age
        switch (age){ // check age
            case 10:// case 10 ==age go case next one
                System.out.println("Your age is 10");
                break;
            case 20:// case 20==age => do case next one
                System.out.println("Your age is 20");
                break;
            case 30:// case==age go output
                System.out.println("Your age is 30");
                break;
            default:
                System.out.println("Unknown age");
        }


    }
}
