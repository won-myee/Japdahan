package kr.kro.wonmyee.debug;

public class DebugMode {
    public static boolean isDebugMode = false;
    public static void debug() {
        isDebugMode = !isDebugMode;
    }
}
