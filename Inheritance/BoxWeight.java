package Inheritance;

public class BoxWeight extends Box {
    int weight = 1;

    public BoxWeight(int h, int l, int w, int weight) {
        super(h, l, w);
        this.weight = weight;
    }
}

