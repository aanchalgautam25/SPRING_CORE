package com.springcore.beanlifecycleAnnotations;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class AnnotatedBean {

        private String message;

        public AnnotatedBean() {
            System.out.println("Constructor: Bean created.");
        }

        public void setMessage(String message) {
            this.message = message ;
            System.out.println("Setter: Setting message = " + message);
        }

        @PostConstruct
        public void init() {
            System.out.println("@PostConstruct: Initialization logic.");
        }

        @PreDestroy
        public void cleanup() {
            System.out.println("@PreDestroy: Cleanup logic.");
        }

        @Override
        public String toString() {
            return "AnnotatedBean{message='" + message + "'}";
        }
    }


