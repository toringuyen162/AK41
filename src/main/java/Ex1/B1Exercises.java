package Ex1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class B1Exercises {
    public static void main(String[] args) {

    }


    public static void isEvenOdd(int n){
        if (n <= 0) {
            throw new IllegalArgumentException(n + " phai lon hon 0");
        }
        if (n % 2 == 0) {
            System.out.println(n + " so chan");
        } else {
            System.out.println(n + " so le");
        }
    }

    public static void isVowel(String i){
        if(i.length() !=1){
            throw new IllegalArgumentException(i+" phai la mot ky tu");
        }

        String vow = "ueoai";
        if(vow.contains((i.toLowerCase()))){
            System.out.println((i+" la nguyen am"));
        } else {
            System.out.println(i+" la phu am");
        }
    }

    //Kiem tra nam nhuan
    public static boolean isLeapYear(int y){
        if(y<=0){
            throw new IllegalArgumentException("Nam phai la so duong");
        }
        if((y%4==0 && y%100!= 0)||(y%400==0)){
            System.out.println(y+" la nam nhuan");
            return true;
        } else {
            System.out.println(y+ " khong la nam nhuan");
            return false;
        }
    }

    public static void isMax(){
        int[] array = {1, 8, 3, 7, -9, 10};
        int max = array[0];
        for (int i =1;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println(max);
    }

    public static int cal(){
        int[] array = {1, 2,3,5};
        StringBuilder sb =new StringBuilder();
        
        for (int i : array) {
            sb.append(i);
        }
        return Integer.getInteger(sb.toString());
    }
}
