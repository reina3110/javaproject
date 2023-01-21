package selection_Statement;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HomeWork {

    public static void main(String[] args) throws Exception{

        System.out.println("Enter your  marks");
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int marks=Integer.parseInt(reader.readLine());

        if(marks >=0 & marks<40){

            System.out.println("Your Fail");

        }else if (marks >=40 & marks <60){

            System.out.println("Your pass");
        }else if(marks >=60 & marks <70){

            System.out.println("Your Credit");
        }else if(marks >=70 & marks <=100){

            System.out.println("Your deistination");
        }else{
            System.out.println("Please Enter Your Marks Again !!");
        }
    }




}
