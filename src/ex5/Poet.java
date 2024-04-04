package ex5;

public interface Poet {
    default void write(){
        System.out.println("Poetry is the essence of music");
    }
}
