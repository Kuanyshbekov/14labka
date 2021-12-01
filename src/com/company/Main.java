package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Mobile mob= null;
        mob=new Model();
        System.out.println("Номер");
        String n= sc.nextLine();

        mob.acceptCall(n);
        mob.breakCall();
        mob.startCall(n);
        mob.breakCall();


    }
}