package uz.najottalim.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import uz.najottalim.Enum.Operation;

@Getter
@NoArgsConstructor
public class Result {


    private Integer param1;

    private Integer param2;

    private Operation operation;

    private Double result;

    private String message;

    public Result(Integer param1, Integer param2, Operation operation, Double result, String lang) {
        this.param1 = param1;
        this.param2 = param2;
        this.operation = operation;
        this.result = result;
        setMessage(lang);
    }

    public void setParam1(Integer param1) {
        this.param1 = param1;
    }

    public void setParam2(Integer param2) {
        this.param2 = param2;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public void setResult(Double result) {
        this.result = result;
    }

    public void setMessage(String leng) {
        if(leng.equals("ru")){
            this.message ="результат = "+getResult();
        } else if (leng.equals("uz")) {
            this.message ="natija = "+getResult();
        }else if (leng.equals("en")) {
            this.message ="result = "+getResult();
        }
    }
}
