package java_core1;

public class Task_11 {
    public static void main(String[] args) {
        methodA();
        methodB();
    }

    public static void methodA() {
        int size = 10_000_000;
        float[] arr = new float[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("One thread time: " + (System.currentTimeMillis() - start) + " ms");
    }

    public static void methodB(){
        int size = 10_000_000;
        int half = size / 2;
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }

        long startTime = System.currentTimeMillis();
        float[] arr1 = new float[half];
        float[] arr2 = new float[half];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = 1.0f;
            arr2[i] = 1.0f;
        }

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = (float) (arr2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < arr2.length; i++) {
                arr2[i] = (float) (arr2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });

        System.out.println("Two threads time: " + (System.currentTimeMillis() - startTime) + " ms");
    }
}

