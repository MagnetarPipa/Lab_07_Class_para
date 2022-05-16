package com.company;

import Classes.Vector;

public class Main {

    public static void main(String[] args) {


        System.out.println("------------------7------------------");


        Vector vector_a = new Vector(1, 2, 3);
        Vector vector_b = new Vector(1, 2, 3);


        Vector sum = vector_a.add(vector_b);
        int scal_mult = vector_a.scal_mult(vector_b);
        System.out.println("Сумма векторов=" + sum);
        System.out.println("Скалярное произведение векторов=" + scal_mult);
        System.out.println("Коллиниарность векторов="+vector_a.colliniar(vector_b));


    }


}
