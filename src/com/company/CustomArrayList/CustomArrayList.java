package com.company.CustomArrayList;


public class CustomArrayList <T> {
    private T object;
    private T name;

    public CustomArrayList(T object){
        this.object = object;
    }

    public CustomArrayList(){
    }

    public T getObject(){
        return this.object;
    }

    public void showObject(){
        System.out.println("Showing Object Name: "+object.getClass().getName());
    }

    public void setName(T object){
        this.name = object;
    }

    public T getName(){
        return this.name;
    }
}
