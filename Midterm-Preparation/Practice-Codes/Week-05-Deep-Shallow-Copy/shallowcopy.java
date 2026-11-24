package midpracticeweek05;

class ShallowData {
    int value;

    ShallowData(int val) {
        this.value = val;
    }
}

class ShallowExample implements Cloneable {
    ShallowData data;

    ShallowExample(int val) {
        this.data = new ShallowData(val);
    }

    // Default Object.clone() performs a Shallow Copy
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    void display() {
        System.out.println("Value: " + data.value + " | Reference Hash: " + System.identityHashCode(data));
    }
}