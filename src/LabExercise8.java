public class LabExercise8 {
    public static void main(String[] args) {
        int[] arr = {3, 6, 9, 12, 15};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum = " + sum);
    }
}