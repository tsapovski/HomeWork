package com.overone.blok6.lesson8;

public class Task17 {
    public static void main(String[] args) {

        for (int i = 1000; i <=9999;i++){
            int first , second, third, fourth;
            first = i%10;
            second = (i/10)%10;
            third = (i/100)%10;
            fourth = i/1000;
            if(first+second+third+fourth == first*second*third*fourth){
                System.out.println(i);
            }
        }
    }
}
