package ru.mirea.lab5.seventh;

public class example2 {
    public static void main(String[] args){
        System.out.println(simple(18, 2));
    }
    public static boolean simple(int num, int i) {
        if (num < 2) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % i == 0) {
            return false;
        }
        if (i < num / 2) {
            return simple(num, i + 1);
        }
        else {
            return true;
        }
    }
}
