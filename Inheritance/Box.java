package Inheritance;

public class Box {
    int l =1;
    int w =1;
    int h=1;

    public Box() {
        this.h = h;
        this.l = l;
        this.w = w;

    }

    public Box(int h, int l, int w) {
        this.h = h;
        this.l = l;
        this.w = w;
    }

    public Box(Box Old){
        this.h= Old.h;
        this.w = Old.w;
        this.l= Old.l;

    }
}
