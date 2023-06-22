package com.basicjava;
import java.util.*;
public class StringEqual {
    public static void main(String[] args){
        String name1,name2;
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
        System.out.print("Enter name1: ");
        name1= sc.nextLine(); //reads string
        System.out.print("Enter name1: ");
        name2=sc.nextLine();
        if(name1.equals(name2)){
            System.out.println("The names are equal");
        }else{
            System.out.println("They are not equal");
        }


    }
}
