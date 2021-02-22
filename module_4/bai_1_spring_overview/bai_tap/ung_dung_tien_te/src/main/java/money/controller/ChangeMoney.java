package money.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ChangeMoney {
    @GetMapping("/")
    public String change() {
        return "/change";
    }

    @GetMapping("/change")
    public String data(@RequestParam String number, Model model) {
        double vnd = Double.parseDouble(number)*21;
        model.addAttribute("vnd",vnd);
        return "/change";
    }
}
