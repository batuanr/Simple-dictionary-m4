package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.DictionaryService;
import service.Iservice;

@Controller
public class Dictionary {
    Iservice dictionaryService = new DictionaryService();

    @GetMapping("/home")
    public String getHome(){
        return "home";
    }
    @PostMapping("/home")
    public String translate(@RequestParam String string, Model model){
       String result = dictionaryService.check(string);
       model.addAttribute("result", result);
       return "home";
    }

}
