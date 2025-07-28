package com.springcore.annotationByType;

public  class Car {

    private Specification specification1;



    public void setSpecification1(Specification specification) {
        this.specification1 = specification;
    }



    public void displayDetails(){
        System.out.println("Car1 Details: " + specification1.toString());


    }
}


