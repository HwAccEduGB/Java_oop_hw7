package impl;

import model.ComplexNum;

public interface Calculator {
    ComplexNum mult(ComplexNum num1, ComplexNum num2);
    ComplexNum add(ComplexNum num1, ComplexNum num2);
    ComplexNum div(ComplexNum num1, ComplexNum num2);
}
