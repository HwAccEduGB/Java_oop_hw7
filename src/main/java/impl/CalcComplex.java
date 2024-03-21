package impl;

import model.ComplexNum;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CalcComplex{
    private Logger logger;

    public CalcComplex() {
        this.logger = Logger.getLogger(CalcComplex.class.getName());
    }


    public static ComplexNum add(ComplexNum num1, ComplexNum num2) {
        double real = num1.getReal() + num2.getReal();
        double image = num1.getImage() + num2.getImage();
        ComplexNum result = new ComplexNum(real, image);
//        logger.log(Level.INFO, "add result: " + result.getReal() + "+" + result.getImage() + "i");
        return result;
    }


    public static ComplexNum mult(ComplexNum num1, ComplexNum num2) {
        double real = num1.getReal() * num2.getReal() - num1.getImage() * num2.getImage();
        double image = num1.getReal() * num2.getImage() + num1.getImage() * num2.getReal();
        ComplexNum result = new ComplexNum(real, image);
//        logger.log(Level.INFO, "mult result: " + result.getReal() + "+" + result.getImage() + "i");
        return result;
    }


    public static ComplexNum div(ComplexNum num1, ComplexNum num2) {
        double divider = num2.getReal() * num2.getReal() + num2.getImage() * num2.getImage();
        double real = (num1.getReal() * num2.getReal() + num1.getImage() * num2.getImage()) / divider;
        double image = (num1.getImage() * num2.getReal() - num1.getReal() * num2.getImage()) / divider;
        ComplexNum result = new ComplexNum(real, image);
//        logger.log(Level.INFO, "div result: " + result.getReal() + "+" + result.getImage() + "i");
        return result;
    }
}
