package com.example.furama.annotation.employee;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ValidUniqueEmployee.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UniqueEmployee {

    String message() default "Duplicate Data";

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
