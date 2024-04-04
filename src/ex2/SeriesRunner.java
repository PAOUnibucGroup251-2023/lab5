package ex2;

public class SeriesRunner {
    public static void main(String[] args) {
        System.out.println("Simple sum (3): " + new SeriesCalculus().sum(new SimpleSum(), 3));
        System.out.println("Square sum (3): " + new SeriesCalculus().sum(new SquareSum(), 3));
    }
}
