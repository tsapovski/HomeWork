package com.overone.blok16.lesson102_103;

public class Generic <T extends  Animal>{

    public void print(T animal){
        if(animal.getClass().getSimpleName().equals("Cow")){
            System.out.println(animal.getClass().getSimpleName()+ " color " + "white-brown");
        }else if (animal.getClass().getSimpleName().equals("Cat")){
            System.out.println(animal.getClass().getSimpleName()+ " color " + "black");
        }else if (animal.getClass().getSimpleName().equals("Tiger")){
            System.out.println(animal.getClass().getSimpleName()+ " color " + "orange-black");
        }

    }

}
