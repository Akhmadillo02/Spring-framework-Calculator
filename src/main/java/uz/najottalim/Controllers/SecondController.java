package uz.najottalim.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import uz.najottalim.Service.CalculatorService;
import uz.najottalim.entity.Result;
@RequestMapping("/second")
@RestController
public class SecondController {


    private CalculatorService calculatorService;

    @Autowired
    public SecondController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }


    @PostMapping(value = "/Plus", produces = MediaType.APPLICATION_JSON_VALUE)
    public Result arifmetic1(@RequestBody Result param,
                             @RequestHeader("leng") String leng) {
        return calculatorService.addition(param, leng);
    }


    @PostMapping(value = "/Minus", produces = MediaType.APPLICATION_JSON_VALUE)
    public Result arifmetic2(@RequestBody Result param,
                             @RequestHeader("leng") String leng) {
        return calculatorService.subtraction(param, leng);
    }


    @PostMapping(value = "/Multiply", produces = MediaType.APPLICATION_JSON_VALUE)
    public Result arifmetic3(@RequestBody Result param,
                             @RequestHeader("leng") String leng) {
        return calculatorService.multiplication(param, leng);
    }


    @PostMapping(value = "/division", produces = MediaType.APPLICATION_JSON_VALUE)
    public Result arifmetic4(@RequestBody Result param,
                             @RequestHeader("leng") String leng) {
        return calculatorService.division(param, leng);
    }
}
