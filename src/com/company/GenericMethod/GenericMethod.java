package com.company.GenericMethod;

public class GenericMethod {
    //Generic Method
    public  <T> void printElements(T []elements){
        for(T e: elements){
            System.out.println("Elements: "+e);
        }
    }
}
