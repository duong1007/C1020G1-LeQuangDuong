package com.example.furama.annotation.customer;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ValidUniqueCustomer.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UniqueCustomer {

    String message() default "Duplicate Data";

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
