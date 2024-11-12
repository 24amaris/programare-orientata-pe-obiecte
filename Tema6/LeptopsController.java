package ro.emanuel;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LeptopsController {

	@GetMapping("/laptops")
    public ModelAndView displayBrandInfo(@RequestParam String brand) {
        int count = brand.length();
        String parity = (count % 2 == 0) ? "par" : "impar";

        ModelAndView mav = new ModelAndView("laptops.jsp");
        mav.addObject("brand", brand);
        mav.addObject("length", count);
        mav.addObject("parity", parity);

        return mav;
	}
}
