package com.company;

public class Main {

    public static void main(String[] args) {

        String name = "Vu Van Binh";
//        System.out.println(name);
//        System.out.println(name.toCharArray());//chuyen sang mang ky tu char
//        System.out.println(name.toUpperCase());//chuiyensang ky tu chu hoa
//        System.out.println(name.toLowerCase());//chuyen sang ky tu viet thuong
        String arr[]=name.split(" ");
        for (String s : arr
             ) {
            System.out.println(s);
        }

        System.out.println(name.startsWith("Vu"));
        System.out.println(name.startsWith("vu"));

        System.out.println(name.endsWith("h"));
        System.out.println(name.endsWith("H"));


    }
}
