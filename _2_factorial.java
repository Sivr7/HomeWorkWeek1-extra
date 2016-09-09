package week1.week1Homework.extra;


import java.util.Scanner;
/**
 * Created by Andriy on 09.09.2016.
 *
 * 2. Вычислить факториал числа.
 */
public class _2_factorial {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to calculate its factorial:");

        int userNum = sc.nextInt();

        int fact = 1;

        if(userNum >= 0){
            for(int i = 1; i <= userNum; i++){
                fact = fact * i;

            }
            System.out.println(userNum + "! = " + fact);
        } else {
            System.out.println("Invalid number!");
        }




    }
}
