package ex5;

public interface Writer {
    default void write(){
        String line1 = "To write or not to write...";
        String line2 = "That is the question";

        System.out.printf("%s%n%s%n", line1, line2);
    }
}
