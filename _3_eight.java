package week1.week1Homework.extra;

import java.util.Scanner;
/**
 * Created by Andriy on 09.09.2016.
 *
 * Посчитать сколько раз встречается символ 8 в заданном числе, которое вводит юзер
 5678  -   1
 5889  -   2
 8888  -   4
 989990 - 1
 */
public class _3_eight {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int userNum = sc.nextInt();

        System.out.println("Enter digit to count:");
        int userDigit = sc.nextInt();

        int count = 0;

        while(userNum != 0){
            if(userNum % 10 == userDigit || userNum % 10 == -1 * userDigit){
                count++;
            }
            userNum = userNum / 10;
        }

        System.out.println(userDigit + " count = " + count);

    }
}
