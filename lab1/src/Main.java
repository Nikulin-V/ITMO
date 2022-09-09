import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        // Creating array t
        int[] t = new int[9];
        int elementId = 0;
        for (int i = 1; i <= 17; i += 2) {
            t[elementId] = i;
            elementId += 1;
        }
        System.out.println("Array t: " + Arrays.toString(t) + '\n');

        // Creating array x
        float[] x_arr = new float[14];
        elementId = 0;
        for (int i = 1; i <= 17; i += 2) {
            x_arr[elementId] = random(-9, 5);
            elementId += 1;
        }
        System.out.println("Array x: " + Arrays.toString(x_arr) + '\n');

        // Creating two-dimensional array t
        double[][] arr = new double[9][14];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                float x = x_arr[j];
                int[] searchArr = new int[]{1, 5, 9, 11};
                if (t[i] == 3) {
                    arr[i][j] = Math.sin(x) / Math.pow(Math.pow(2 * x, 2) - 1, Math.log(Math.exp(x)));
                } else if (containInt(t[i], searchArr)) {
                    arr[i][j] = Math.pow(
                            2 * (x / (Math.pow(2 * (1 - x), 2) + 1)),
                            (Math.pow(x - 1, 2 / 3 * (Math.pow(((3 + x) / 2) / 3, 2) + 1)) + 1 / 3) / 4
                    );
                } else {
                    arr[i][j] = 2 * Math.tan(Math.log(Math.pow(Math.tan(x), 2)));
                }
            }
        }

        // Printing two-dimensional array t
        System.out.println("Two-dimensional array t:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[");
            for (int j = 0; j < arr[0].length; j++) {
                System.out.printf("%.4f; ", arr[i][j]);
            }
            System.out.println("]");
        }
    }

    public static int random(int min, int end) {
        return (int) (Math.random() * ++end - min);
    }

    public static boolean containInt(int element, int[] searchArr) {
        for (int arrElement : searchArr) {
            if (arrElement == element) {
                return true;
            }
        }
        return false;
    }
}
