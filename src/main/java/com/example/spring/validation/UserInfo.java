package com.example.spring.validation;

import com.example.spring.validation.impl.UserInfoValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = UserInfoValidator.class)
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface UserInfo {

    String message() default "Firstname and Lastname should be filled in";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
