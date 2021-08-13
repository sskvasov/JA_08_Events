package my.events;

public class Client {
    public static void main(String[] args) {
        CalcWithEvent calc = new CalcWithEvent();
        calc.addJackpotListener(amount -> System.out.println("Oh my ... I won! "+ amount));
        System.out.println(calc.plus(1,776));
    }
}
