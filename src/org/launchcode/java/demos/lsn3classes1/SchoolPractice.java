package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.HashMap;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!

        Student ammaarah = new Student("Ammaarah",1,1, 4.0);


    }



    private class Course{

        private String courseName;
        private Double courseNumber;
        private ArrayList<Student> room = new ArrayList<>();

    }



    private class Teacher{

//getter and setters are there for private fields

        private String firstName;
        private String lastName;
        private String subject;
        private Double yearsTeaching;


        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getSubject() {
            return subject;
        }

        public Double getYearsTeaching() {
            return yearsTeaching;
        }


    }
}

