package ru.mirea.lab5.fifth;

public class example {
    public static void main(String[] args){
        System.out.println(digit(55));
    }
    public static int digit(int num) {
        if (num > 10) {
            return num % 10 + digit(num / 10);
        }
        else {
            return num;
        }
    }
}
