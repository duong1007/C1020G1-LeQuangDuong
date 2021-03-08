package com.example.libary_management.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class BooksAspect {

    private static int amountPeople = 0;

    @After("execution(* com.example.libary_management.controller.LibraryManagementController.*Book(..))")
    public void AfterChangeBookStatus(JoinPoint joinPoint){
        System.out.println("sách đã thay đổi trạng thái" + joinPoint.getSignature().getName());
    }

    @Before("execution(* com.example.libary_management.controller.LibraryManagementController.*showList(..))")
    public void beforePeopleView(JoinPoint joinPoint){
        System.out.println("có " + (++amountPeople) + " người đã view");
    }

}