package uz.najottalim.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import uz.najottalim.Service.CalculatorService;
import uz.najottalim.entity.Result;
@ComponentScan("uz.najottalim")
@RequestMapping("/first")
@Controller
public class FirstController {

    private CalculatorService calculatorService;

    @Autowired
    public FirstController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }


    @PostMapping(value = "/Plus", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Result arithmetic1(@RequestBody Result param,
                                            @RequestHeader("lang") String lang) {
        return calculatorService.addition(param, lang);
    }


    @PostMapping(value = "/Minus", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Result arithmetic2(@RequestBody Result param,
                                            @RequestHeader("lang") String lang) {
        return calculatorService.subtraction(param, lang);
    }

    @PostMapping(value = "/Multiply", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Result arithmetic3(@RequestBody Result param,
                                            @RequestHeader("lang") String lang) {
        return calculatorService.multiplication(param, lang);
    }


    @PostMapping(value = "/Division", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Result arithmetic4(@RequestBody Result param,
                                            @RequestHeader("lang") String lang) {
        return calculatorService.division(param, lang);
    }


}
