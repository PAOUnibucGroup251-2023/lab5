package ex5;

public class Multitalented implements Writer, Poet{

    public static void main(String[] args) {
        Multitalented writer = new Multitalented();
        writer.write();
    }

    @Override
    public void write() {
        //solving the name clash - we need to tell the compiler which of the methods to call.
        //for multiple inheritance, we have the syntax SuperInterfaceName.super.methodName(argument1, argument2 ...);
        Poet.super.write();
        Writer.super.write();
    }
}

