public class TaskThree implements ITaskThree {

    private static int a, b;

    @Override
    public void methodOne() {
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        for (int i = ++min; i < max; i++) {
            System.out.println(i);
        }
    }

    @Override
    public void methodTwo() {
        for (int i = 1; i < Math.sqrt(a); i++) {
            if (a % i == 0) {
                if (a / i == i) {
                    System.out.println(i);
                } else {
                    System.out.println(i);
                    System.out.println(a / i);
                }
            }
        }
    }

    @Override
    public void methodThree() {
        for (int i = 1; i < Math.sqrt(b); i++) {
            if (b % i == 0) {
                if (b / i == i) {
                    printIfPrime(i);
                } else {
                    printIfPrime(i);
                    printIfPrime(b / i);
                }
            }
        }
    }

    @Override
    public Integer methodFour() {
        int[] digitOccurrences = new int[10];
        String bString = Integer.toString(Math.abs(b));

        for (int i = 0; i < bString.length(); i++) {
            int c = bString.charAt(i) - '0';
            digitOccurrences[c]++;
        }

        int maxOccurrences = 0;
        Integer digit = null;
        for (int i = 0; i < digitOccurrences.length; i++) {
            if (digitOccurrences[i] == maxOccurrences) {
                digit = null;
            }
            if (digitOccurrences[i] > maxOccurrences) {
                maxOccurrences = digitOccurrences[i];
                digit = i;
            }
        }
        return digit;
    }

    private void printIfPrime(int a) {
        if (a <= 1) {
            return;
        }

        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                return;
            }
        }

        System.out.println(a);
    }

    public static void main(String[] args) {
        a = 200;
        b = 313;

        TaskThree taskThree = new TaskThree();

        System.out.println("Method 1:");
        taskThree.methodOne();

        System.out.println("Method 2:");
        taskThree.methodTwo();

        System.out.println("Method 3:");
        taskThree.methodThree();

        System.out.println("Method 4:");
        Integer taskFourResult = taskThree.methodFour();
        System.out.println(taskFourResult == null ? "None" : taskFourResult);
    }

}
