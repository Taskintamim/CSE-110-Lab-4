class FinalParam {
    void display(final int x) {
        System.out.println("Value: " + x);
    }
}
public class LabExercise5 {
    public static void main(String[] args) {
        FinalParam fp = new FinalParam();
        fp.display(50);
    }
}