package com.company.BoundedType;

import com.company.model.PremiumUser;
import com.company.model.User;

public class BoundedType <T extends Number>{
    private T object;
    private T name;


    public BoundedType(T object){
        this.object = object;
    }

    public BoundedType(){
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
