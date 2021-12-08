package OOPS1.inheritance;

public class BoxPrice extends BoxWithWeigth {
    double cost;
    BoxPrice (){
        super();
        this.cost  = -1;
    }
    BoxPrice(BoxPrice other){
        super(other);
        this.cost = other.cost;
    }

    public BoxPrice(double l, double h, double w, double weight, double cost) {
        super(l, h, w, weight);
        this.cost = cost;
    }
}
