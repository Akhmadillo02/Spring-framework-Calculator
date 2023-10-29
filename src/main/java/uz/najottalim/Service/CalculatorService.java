package uz.najottalim.Service;

import org.springframework.stereotype.Service;
import uz.najottalim.Enum.Operation;
import uz.najottalim.entity.Result;

@Service
public class CalculatorService {

    private Double natija;

    public Result addition(Result result, String lang) {
        if (result.getOperation().equals(Operation.PLUS)) {
            natija = result.getParam1().doubleValue() + result.getParam2().doubleValue();
            return new Result(result.getParam1(), result.getParam2(), Operation.PLUS, natija, lang);
        } else throw new RuntimeException("Noto'g'ri operatsiya turi");
    }


    public Result subtraction(Result result, String lang) {
        if (result.getOperation().equals(Operation.MINUS)) {
            natija = result.getParam1().doubleValue() - result.getParam2().doubleValue();
            return new Result(result.getParam1(), result.getParam2(), Operation.MINUS, natija, lang);
        } else throw new RuntimeException("Notog'ri operatsiya turi");

    }


    public Result multiplication(Result result, String lang) {
        if (result.getOperation().equals(Operation.MULTIPLY)) {
            natija = result.getParam1().doubleValue() * result.getParam2().doubleValue();
            return new Result(result.getParam1(), result.getParam2(), Operation.MULTIPLY, natija, lang);
        } else throw new RuntimeException("Notog'ri operatsiya turi");
    }


    public Result division(Result result, String lang) {
        if (result.getOperation().equals(Operation.DIVISION)) {
            natija = result.getParam1().doubleValue() / result.getParam2().doubleValue();
            return new Result(result.getParam1(), result.getParam2(), Operation.DIVISION, natija, lang);
        } else throw new RuntimeException("Notog'ri operatsiya turi");
    }


}
