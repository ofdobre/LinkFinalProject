package Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @GetMapping("/")
    public ModelAndView firstPage(){

        return new ModelAndView("login.html");
    }

}