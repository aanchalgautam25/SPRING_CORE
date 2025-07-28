package com.springcore.annotationByName;

public class Car {

        private Specification specification1;
        private Specification specification2;


        public void setSpecification1(Specification specification) {
            this.specification1 = specification;
        }

    public void setSpecification2(Specification specification2) {
        this.specification2 = specification2;
    }

    public void displayDetails(){
            System.out.println("Car1 Details: " + specification1.toString());
            System.out.println("Car2 Details: " + specification2.toString());

        }
    }


