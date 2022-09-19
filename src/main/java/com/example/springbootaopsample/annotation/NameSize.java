package com.example.springbootaopsample.annotation;



import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Constraint(validatedBy = {NameSizeValidator.class})
public @interface NameSize {
    int max() default 0;
    int min() default Integer.MAX_VALUE;
    String message() default "age should be between ";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
