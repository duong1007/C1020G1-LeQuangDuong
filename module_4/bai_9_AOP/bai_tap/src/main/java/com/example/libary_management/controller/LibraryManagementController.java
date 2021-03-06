package com.example.libary_management.controller;


import com.example.libary_management.model.Book;
import com.example.libary_management.model.BorrowBooks;
import com.example.libary_management.service.Imp.BookServiceImp;
import com.example.libary_management.service.Imp.BorrowBookServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LibraryManagementController {

    @Autowired
    BookServiceImp bookServiceImp;

    @Autowired
    BorrowBookServiceImp borrowBookServiceImp;

    @GetMapping("/")
    public String showList(Model model){
        model.addAttribute("books",bookServiceImp.findAll());
        return "/book/home";
    }

    @GetMapping("/{id}/view")
    public String showBook(@PathVariable Integer id, Model model){
        model.addAttribute("book",bookServiceImp.findById(id));
        return "/book/view";
    }

    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("book", new Book());
        return "/book/create";
    }

    @PostMapping("/create")
    public String create(Book book,Model model){
        bookServiceImp.save(book);
        model.addAttribute("mess","thêm sách thành công");
        return "/book/create";
    }

    @GetMapping("/{id}/borrow")
    public String borrow(@PathVariable Integer id, RedirectAttributes redirectAttributes){
        BorrowBooks borrowBook = new BorrowBooks();
        Book book = bookServiceImp.findById(id);

        borrowBook.setBook(book);


        long code = (long) ((Math.random()*99999) + 10000);
        borrowBook.setBookCode(code);


        borrowBookServiceImp.save(borrowBook);

        book.setAmount(book.getAmount() - 1);
        bookServiceImp.save(book);

        redirectAttributes.addFlashAttribute("code",code);
        return "redirect:/";
    }
}
