package test;

import main.Dog;
import main.PettyDog;

import java.lang.annotation.Annotation;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Class<Dog> dogClass = Dog.class;
        Annotation[] dogClassAnnotations = dogClass.getAnnotations();
        System.out.println(dogClass.isAnnotation());
        for (Annotation annotation:dogClassAnnotations) {
            System.out.println(annotation.annotationType().getName());
        }


        System.out.println("----------------------------------------------");
        Class<PettyDog> pettyDogClass = PettyDog.class;
        Annotation[] pettyDogClassAnnotations = pettyDogClass.getAnnotations();
        System.out.println(pettyDogClass.isAnnotation());
        for (Annotation annotation : dogClassAnnotations) {
            System.out.println(annotation.annotationType().getName());
        }



    }
}
