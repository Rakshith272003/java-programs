package Inheritance;

public class BoxPrice extends BoxWeight{
    int price = -1;

    public BoxPrice(int h, int l, int w,int price,int weight ){
        super(h,l,w,weight);
        this.price=price;
    }
}
