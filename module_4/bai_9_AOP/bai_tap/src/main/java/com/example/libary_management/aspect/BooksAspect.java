package com.example.libary_management.aspect;

import com.example.libary_management.controller.BorrowBookController;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.LoggerFactory;

@Aspect
public class BooksAspect {

    private static int amountPeople = 0;

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(BorrowBookController.class);
    public static String bookName;

    @After("execution(* com.example.libary_management.controller.BorrowBookController.borrowBook(*,*))")
    public void afterBorrowing(){
        LOGGER.info("Book: " + bookName + " had been borrowed !");
    }

    @After("execution(* com.app.controller.BookController.returnBook(*,*))")
    public void afterReturning(){
        LOGGER.info("Book: " + bookName + " had been return !");
    }

    @Before("execution(* com.example.libary_management.controller.LibraryManagementController.*showList(..))")
    public void beforePeopleView(JoinPoint joinPoint){
        System.out.println("có " + (++amountPeople) + " người đã view");
    }


}