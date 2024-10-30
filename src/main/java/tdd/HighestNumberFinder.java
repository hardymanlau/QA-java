package tdd;

public class HighestNumberFinder {
    public int findHighestNumber(int[] input) {
        if (input[0] > input [1]) {
            return input[0];
        } else {
            return input[1];
        }

    }
}
