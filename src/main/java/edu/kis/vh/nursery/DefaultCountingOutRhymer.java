package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    public IntArrayStack arrayStack = new IntArrayStack();

    public DefaultCountingOutRhymer(IntArrayStack arrayStack) {
        this.arrayStack = arrayStack;
    }

    public DefaultCountingOutRhymer() {
    }

    public void countIn(int in) {
        arrayStack.countIn(in);
    }

    public boolean callCheck() {
        return arrayStack.callCheck();
    }

    public boolean isFull() {
        return arrayStack.isFull();
    }

    public int peekaboo() {
        return arrayStack.peekaboo();
    }

    public int countOut() {
        return arrayStack.countOut();
    }
}
