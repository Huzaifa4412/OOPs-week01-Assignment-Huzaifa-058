package midpracticeweek05;

class DeepData {
    int value;

    DeepData(int val) {
        this.value = val;
    }

    // Deep copy helper for Data class
    DeepData(DeepData other) {
        this.value = other.value;
    }
}

class DeepExample implements Cloneable {
    DeepData data;

    DeepExample(int val) {
        this.data = new DeepData(val);
    }

    // Custom clone method for DEEP COPY
    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepExample cloned = (DeepExample) super.clone();
        // Manually creating a new Data object so references are separate
        cloned.data = new DeepData(this.data);
        return cloned;
    }

    void display() {
        System.out.println("Value: " + data.value + " | Reference Hash: " + System.identityHashCode(data));
    }
}
