public class SelectionSort {
    static double[] list = {0, 1, 1.5, 2.6, 9, 10.1, 3.8, 4.5, 3.6, 10.0, 15.5, 26.8};

    public static void main(String[] args) {
        printList(list);

        System.out.println();
        System.out.print("\nList after sorted: ");
        sort(list);

    }

    private static void printList(double[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
    }

    private static void sort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;

                }
            }
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
        System.out.println();
        printList(list);
    }
}
