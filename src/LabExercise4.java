class ConstantDemo {
    final int MAX_VALUE;
    ConstantDemo() {
        MAX_VALUE = 100; // final variable initialized inside constructor
    }
}
public class LabExercise4 {
    public static void main(String[] args) {
        ConstantDemo obj = new ConstantDemo();
        System.out.println("MAX_VALUE = " + obj.MAX_VALUE);
    }
}