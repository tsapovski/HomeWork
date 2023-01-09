package com.overone.blok16Generics.lesson100;

public class Generic <T>{
  public T checkTheClass(T ob){

      return (T) ob.getClass().getSimpleName();

   }
}

