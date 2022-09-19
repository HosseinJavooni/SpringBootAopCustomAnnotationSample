package com.example.springbootaopsample.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NameSizeValidator implements ConstraintValidator<NameSize, String> {
    int min;
    int max;
    @Override
    public void initialize(NameSize nameSize) {
        min = nameSize.min();
        max = nameSize.max();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext){

        return min <= s.length() && s.length() <= max;
    }
}
