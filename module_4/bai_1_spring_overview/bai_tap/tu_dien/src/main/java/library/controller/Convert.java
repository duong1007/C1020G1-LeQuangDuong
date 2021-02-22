package library.controller;


import library.service.ConvertService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Convert {

    ConvertService change = new ConvertService();

    @GetMapping("/")
    public String change() {
        return "/library";
    }

    @GetMapping("/convert")
    public String EWord(@RequestParam String word, Model model) {
        String result = change.chance(word);
        model.addAttribute("result",result);
        return "/library";
    }
}
