// 3. WAP that calculates sum of first 100 natural numbers.

class SumFirst100Nums {

    public static void main(String[] args) {

        // you can also use `n * (n + 1) / 2` instead of this `for loop` 👀
        // but you can't go against the college rules, they're set on a stone!!! :)
        // so using `for loop` for these kinds of situations is a wise choice ¯\_(ツ)_/¯

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.printf("Sum of first 100 natural numbers is: %d", sum);
    }
}

/* OP:
    Sum of first 100 natural numbers is: 5050
*/