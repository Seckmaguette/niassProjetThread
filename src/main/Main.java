package main;

public class Main {

    static void myMethod(String mesage) {
        System.out.println(mesage + " ");

    }
    public static void main(String[] args) {





        String s1 =  "Bonjour le monde ! je suis somme et je ne calcule rien" ;

    String s3 = s1.substring(0,  20);
        myMethod(s3);


        String exampleString = "This is just a sample string";


        int totalCharacters = 0;
        int ok = exampleString.length();
        for (int i = 0; i <ok ; i++) {


            if (ok>i)
                System.out.println();
                totalCharacters++;
        }

    }

}