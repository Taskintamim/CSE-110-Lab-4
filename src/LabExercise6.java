class FinalLocal {
    void show() {
        final int n = 10;
        System.out.println("n = " + n);
    }
}
public class LabExercise6 {
    public static void main(String[] args) {
        FinalLocal fl = new FinalLocal();
        fl.show();
    }
}