package com.overone.blok8.lesson29;

public class Customer {

    private String name;
    private String address;

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void check(Order order){

        if(order.getName()!= null||order.getAddress()!=null && (this.address!=null || this.name!=null)) {
            if (order.getName().equals(this.name) && order.getAddress().equals(this.address)) {
                System.out.println("Orders match"+ "\n"+ order +"\n"+ "Customer: " +this.name.toString()+" "+ this.address.toString() );
            } else {
                System.out.println("order not match");
            }
        }else{
            System.out.println("Not order");
        }

    }

}
