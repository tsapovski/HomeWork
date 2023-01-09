package com.overone.blok8FeaturesOOP.lesson21_25;
import java.util.Scanner;

public class Customer {
    String family;
    String name;
    int dateBirthday;
    String phoneNumber;
    String address;
    public Customer(){

    }

    public Customer(String address) {
        this.address = address;
    }

    public void checkingNumber(Customer customer){
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        scanner.close();
        if (number.equals(customer.phoneNumber)){
            System.out.println("Numbers match");
        }else {
            System.out.println("Numbers not match");
        }
    }

     public void checkinAddress(){
            Scanner scan = new Scanner(System.in);
         System.out.println("Enter address in format: number home-number street");
            String address = scan.nextLine();
            scan.close();
         if (address.equals(this.address)){
             System.out.println("Address match");
         }else {
             System.out.println("Address not match or you enter incorrect address");
         }

        }


}
