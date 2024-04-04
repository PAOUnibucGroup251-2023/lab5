package ex5;

public class Novelist implements Writer, Poet {
    @Override
    public void write(){
        System.out.println("""
            Charlotte was a very fine actress. Every time she was on stage, the public was enchanted
            """);
    }

    public static void main(String[] args) {
        Novelist novelist = new Novelist();
        novelist.write(); // the method on the current object has priority and it will be called if no other
        // directions are given, the super methods will be hidden by it
    }
}
