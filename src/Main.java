import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b);
        /*
         * В методе apply(a, b) мы а/b,
         * в случае когда  b = 0, выбрасывается исключение  ArithmeticException
         * чтобы этого избежать в классе Calculator мы перехватываем исключение и
         * выводим сообщение "Делить на 0 нельзя"
         */
        calc.println.accept(c);
    }
}