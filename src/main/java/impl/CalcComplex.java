package impl;

import model.ComplexNum;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class CalcComplex{
    private Logger logger;
    public CalcComplex(){
        this.logger = Logger.getLogger("MyLog");
    }
    void getLog(double real, double image){
        try {
            FileHandler fileHandler = new FileHandler("logs.log", true);
            logger.addHandler(fileHandler);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.info("result: " + real + "+" + image + "i");
        }catch (SecurityException | IOException e){
            logger.log(Level.INFO, "ошибка логирования");
        }
    }

    public ComplexNum add(ComplexNum num1, ComplexNum num2)  {
        double real = num1.getReal() + num2.getReal();
        double image = num1.getImage() + num2.getImage();
        ComplexNum result = new ComplexNum(real, image);
        getLog(result.getReal(), result.getImage());
        return result;
    }

    public ComplexNum mult(ComplexNum num1, ComplexNum num2) {
        double real = num1.getReal() * num2.getReal() - num1.getImage() * num2.getImage();
        double image = num1.getReal() * num2.getImage() + num1.getImage() * num2.getReal();
        ComplexNum result = new ComplexNum(real, image);
        getLog(result.getReal(), result.getImage());
        return result;
    }

    public ComplexNum div(ComplexNum num1, ComplexNum num2) {
        double divider = num2.getReal() * num2.getReal() + num2.getImage() * num2.getImage();
        double real = (num1.getReal() * num2.getReal() + num1.getImage() * num2.getImage()) / divider;
        double image = (num1.getImage() * num2.getReal() - num1.getReal() * num2.getImage()) / divider;
        ComplexNum result = new ComplexNum(real, image);
        getLog(result.getReal(), result.getImage());
        return result;
    }
}
