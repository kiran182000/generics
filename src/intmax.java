public class intmax {
        public static Integer findMax(Integer a, Integer b, Integer c) {
            if (a.compareTo(b) > 0 && a.compareTo(c) > 0) {
                return a;
            } else if (b.compareTo(a) > 0 && b.compareTo(c) > 0) {
                return b;
            } else {
                return c;
            }
        }
        public static void main(String[] args) {
            // Test cases
            Integer test1 = findMax(5, 3, 2);
            Integer test2 = findMax(3, 7, 4);
            Integer test3 = findMax(1, 2, 9);

            System.out.println("Test 1 Max: " + test1);
            System.out.println("Test 2 Max: " + test2);
            System.out.println("Test 3 Max: " + test3);
        }
    }
