package oop.Labs__17.LabWork_3_and_4;

public class MySumCount extends Thread {
    private int startIndex;
    private int stopIndex;
    private int[] values;
    private long resultSum;

    public int getStartIndex() {
        return startIndex;
    }
    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getStopIndex() {
        return stopIndex;
    }
    public void setStopIndex(int stopIndex) {
        this.stopIndex = stopIndex;
    }

    public void setValues(int[] values) {
        this.values = values;
    }

    public long getResultSum() {
        return resultSum;
    }

    @Override
    public void run() {
        for (int i = startIndex; i < stopIndex; i++) {
            resultSum += values[i];
        }
    }
}
