// 4. WAP that calculates sum of odd integers from 1 to 50.

class OddNumSum {

    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i <= 50; i += 2) {
            sum += i;
        }
        System.out.printf("Sum of odd numbers from 1 to 50 is: %d", sum);
    }
}

/* OP:
    Sum of odd numbers from 1 to 50 is: 625
*/