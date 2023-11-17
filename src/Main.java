public class Main {
    public static void main(String[] args) {
        UnaryOperator<Integer> square = x -> x*x;
        System.out.println(square.apply(5));
    }
}