public class lec1pro1 {
    public static void main(String[] args) {
        int x = 5, y = 3, z;

        if (x > y) {
            if (y > 0) {
                z = x / y; // Integer division: 5 / 3 = 1
            } else {
                z = x * y;
            }
        } else {
            z = 0;
        }

        System.out.println(z); // Output: 1
    }
}
