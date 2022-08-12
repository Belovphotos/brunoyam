package com.lesson6.easy;


public class Main {
    public static void main(String[] args) {

        Flower[] bouquet1 = {new Rose("Holland", 6,5), new Chamomile("Sweden", 6,5)
        , new Hydrangea("Italy", 6,5)};

        Flower[] bouquet2 = {new Rose("Holland", 6,5), new Chamomile("Sweden", 6,5)
                , new Hydrangea("Italy", 6,5)};

        Flower[] bouquet3 = {new Rose("Holland", 6,5), new Chamomile("Sweden", 6,5)
                , new Hydrangea("Italy", 6,5)};



        System.out.println(Flower.numberOfFlowers);

    }
}
