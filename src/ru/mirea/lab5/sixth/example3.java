package ru.mirea.lab5.sixth;

public class example3 {
    public static void main(String[] args){
        multiplier(132, 2);
    }
    public static void multiplier(int num, int k) {
        if (k > num / 2) {
            System.out.println(num);
            return;
        }
        if (num % k == 0) {
            System.out.println(k);
            multiplier(num / k, k);
        }
        else {
            multiplier(num, ++k);
        }
    }
}
