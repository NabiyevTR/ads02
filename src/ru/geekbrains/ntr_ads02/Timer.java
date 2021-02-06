package ru.geekbrains.ntr_ads02;

public class Timer {
    private static long startTime;
    private static long durationNs;

    public static void start() {
        startTime = System.nanoTime();
    }

    public static void stop() {
        durationNs = System.nanoTime() - startTime;
    }

    public static long getTimeInNs() {
        return durationNs;
    }

    public static long getTimeInMs() {
        return getTimeInNs() / 1_000_000;
    }

    public static float getTimeInS() {
        return 1.0f * durationNs / 1_000_000_000;
    }

}
