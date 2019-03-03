package com.company;

import com.company.BoundedType.BoundedType;
import com.company.CustomArrayList.CustomArrayList;
import com.company.GenericMethod.GenericMethod;
import com.company.model.PremiumUser;
import com.company.model.TrialUser;
import com.company.model.User;

import java.util.ArrayList;

public class Main {



    public static void main(String[] args) {
	    // write your code here
        //The problem
        ArrayList arrayList = new ArrayList();
        arrayList.add("Ahmad Shahwaiz");
        arrayList.add(123);
        arrayList.add(123.6f);
        arrayList.add(123.6d);

        //Runtime Error will occur while type-casting it, due to ClassCastException.

//        String name;
//        for(int i=0; i < arrayList.size(); i ++){
//            name = (String) arrayList.get(i);
//            System.out.println("Print Elements: "+name);
//        }

        //--------------------------------------------------//

        //So,what should we use inorder to avoid this situation on Runtime?
        //We use Generics
        //We are now sure that similar kind of objects are in the list.
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Ahmad Shahwaiz");
        //arrayList1.add(123); //Compile Time Error Occurred.Won;t let you compile.

        //What if we want to add different types of objects in ArrayList

        ArrayList<User> arrayList2 = new ArrayList<>();

        User user = new User();
        user.setName("Ahmad Shahwaiz");
        user.setAge(123);
        user.setHeight(123.4);

        arrayList2.add(user);

        String fname;
        Double height;
        int age;

        for(int i=0; i < arrayList2.size(); i++){
            fname       =   arrayList2.get(i).getName();
            height      =   arrayList2.get(i).getHeight();
            age         =   arrayList2.get(i).getAge();

            System.out.println("First Name: "+fname+ " | height: "+height+" | Age: "+age);
        }
//        arrayList2.add("Ahmad SHahwaiz");

        //CustomArrayList
        CustomArrayList<String> customArrayList = new CustomArrayList<>();
        customArrayList.setName("Hello There!");
        System.out.println("Showing Name: "+customArrayList.getName());


        CustomArrayList<Integer> customArrayList2 = new CustomArrayList<>();
        customArrayList2.setName(123);
        System.out.println("Showing Name: "+customArrayList2.getName());


        //What if we want restrictions to our Generics? That only limited set of Objects should be accommodated.

        BoundedType<Integer> boundedType = new BoundedType<>();
        boundedType.setName(123);
        System.out.println("Showing Name: "+boundedType.getName());

        BoundedType<Float> boundedType2 = new BoundedType<>();
        boundedType2.setName(123.3f);
        System.out.println("Showing Name: "+boundedType2.getName());


        //If T extends Premium User,then can only add PremiumUser object in it.
        //But we can't give String Generic Because its out of bound.
//        BoundedType<TrialUser> boundedType3 = new BoundedType<>();
//        TrialUser trialUser = new TrialUser();
//        trialUser.setName("Ahmad Shahwaiz");
//        trialUser.setAge(123);
//        trialUser.setHeight(123.5);
//        boundedType3.setName(trialUser);
//        System.out.println("Showing Name: "+boundedType3.getName());


        //Arrays of different types
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        //how we can print an array of different type using a single Generic method

        GenericMethod main = new GenericMethod();
        main.printElements(intArray);
        main.printElements(doubleArray);
        main.printElements(charArray);

    }
}
