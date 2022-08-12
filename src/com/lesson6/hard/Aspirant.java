package com.lesson6.hard;

public class Aspirant extends Student {


    private String scientificWork;


    public Aspirant(String firstName, String group, double averageMark) {
        super(firstName, group, averageMark);
    }



    public void getScholarship() {
        if (getAverageMark() == 5.0) {
            System.out.println("Стипендия аспиранта: 1950.");
        } else if (getAverageMark() >= 4 && getAverageMark() < 5){
            System.out.println("Стипендия анспиранта: 1910.");
        } else {
            System.out.println("Аспирант без стипендии.");
        }
    }

}
