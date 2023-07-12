package Ex1;

import java.util.Arrays;

public class B1Exercises {
    public static void main(String[] args) {
    cal();
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


    //Baitap6
    public static void cal() {
        int[] array = {1, 2, 3, 5};
//        StringBuilder sb = new StringBuilder();
//        for (int i : array) {
//            sb.append(i);//convert int to string then append to Object sb
//        }
//        int calculatedInt = Integer.parseInt(sb.toString()) + 1; //sb to int variable then +1

        String str = "";
        for (int i:array){
            str += String.valueOf(i);
        }

        String convertedString = Integer.toString(Integer.parseInt(str)+1); //convert int variable to String

        //Cach 1: convert to int array
        int[] array2=new int[convertedString.length()];
        for (int j=0;j<convertedString.length();j++){
            array2[j]=Character.getNumericValue(convertedString.charAt(j));
        }
        System.out.println(Arrays.toString(array2));

        //Cach 2: convert to char array
        char[]array3 = convertedString.toCharArray();
        System.out.println(Arrays.toString(array3));

        //Cach 3: convert to String array
        String[] array4 = new String[convertedString.length()];
        for(int k =0;k<convertedString.length();k++){
            array4[k]= String.valueOf(convertedString.charAt(k));
        }
        System.out.println(Arrays.toString(array4));


    }



}

