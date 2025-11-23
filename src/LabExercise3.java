class Config {
    static int version;
    static boolean loaded;
    static {
        System.out.println("Static block executed.");
        version = 2;
        loaded = true;
    }
}
public class LabExercise3 {
    public static void main(String[] args) {
        System.out.println("Version: " + Config.version);
        System.out.println("Loaded: " + Config.loaded);
    }
}