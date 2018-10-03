package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String s;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi bạn muốn đếm ký tự : ");
        s = scanner.nextLine();
        countLetters(s);
    }

    public static void countLetters(String s) {
        int count = s.length();
        System.out.println("Số ký tự trong chuỗi là : " + count);
    }
}
