class ArrayTools {
    static int max(int[] arr) {
        int m = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > m) m = arr[i];
        return m;
    }
    static int min(int[] arr) {
        int m = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] < m) m = arr[i];
        return m;
    }
}
public class LabExercise10 {
    public static void main(String[] args) {
        int[] data = {15, 3, 27, 8, 19};

        System.out.println("Max = " + ArrayTools.max(data));
        System.out.println("Min = " + ArrayTools.min(data));
    }
}