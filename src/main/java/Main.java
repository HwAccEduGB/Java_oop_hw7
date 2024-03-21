import impl.CalcComplex;
import impl.Calculator;
import model.ComplexNum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("введи действительную часть 1го числа");
        double real1 = sc.nextDouble();

        System.out.println("введи мнимую часть 1го числа");
        double image1 = sc.nextDouble();

        ComplexNum num1 = new ComplexNum(real1, image1);

        System.out.println("введи действительную часть 2го числа");
        double real2 = sc.nextDouble();

        System.out.println("введи мнимую часть 2го числа");
        double image2 = sc.nextDouble();

        ComplexNum num2 = new ComplexNum(real2, image2);

        System.out.println("укажи тип операции");
        System.out.println("add -> нажми 1");
        System.out.println("mult -> нажми 2");
        System.out.println("div -> нажми 3");
        int type = sc.nextInt();

        ComplexNum result = null;
        switch (type){
            case 1:
                result = CalcComplex.add(num1, num2);
                break;
            case 2:
                result = CalcComplex.mult(num1, num2);
                break;
            case 3:
                result = CalcComplex.div(num1, num2);
                break;
            default:
                System.out.println("какая то дичь, выбери 1, 2 или 3");
                break;
        }
    }
}