package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int MAX_LENGHT = 12;
    public static final int EMPTY_VALUE = -1;
    public static final int MAX_INDEX = 11;

    private int[] numbers = new int[MAX_LENGHT];

    public int total = EMPTY_VALUE;

    /**
     * Insert in value in class array
     * @param in random value which will be stored in number array
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_VALUE;
    }

    public boolean isFull() {
        return total == MAX_INDEX;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY_VALUE;

        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY_VALUE;

        return numbers[total--];
    }

}
