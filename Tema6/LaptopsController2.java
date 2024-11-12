package ro.emanuel;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LaptopsController2 {

    @GetMapping("/laptop")
    public ModelAndView displayLaptopInfo() {
        
        Laptop laptop = new Laptop("Dell", 2500, 16);

        
        ModelAndView mav = new ModelAndView("laptop.jsp");
        mav.addObject("lap", laptop);

        return mav;
    }
}
