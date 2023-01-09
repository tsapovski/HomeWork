package com.overone.blok8FeaturesOOP.lesson27;
import java.util.Scanner;

public class SquareEquation {
    double a;
    double b;
    double c;
    double x;
    double x1;
    double x2;

    public double discriminant(){
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        scanner.close();
        double res = Math.pow(b,2) - 4*a*c;
        return res;
    }

    public int defineMoreOrLess (double db){
        int res;
        if (db > 0){
            res = 1;
            return  res;
        }else if (db == 0) {
            res = 0;
            return res;
        }else
            res = -1;
        return res;
    }

    public String counterSqr(int a, double db){
        String ret = "";
        if(a > 0){
           this.x1 = (-b - Math.sqrt(db)) / (2 * a);
           this.x2 = (-b + Math.sqrt(db)) / (2 * a);
        }else if(a == 0){
            this.x = -b / (2 * a);
        }else if (a<0){
            ret = "Equation not roots";
        }
        return ret;
    }
}
