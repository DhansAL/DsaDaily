package OOPS1.inheritance;

public class BoxWithWeigth extends Box{
     double weight;

    public BoxWithWeigth() {
        this.weight = -1;
    }

    public BoxWithWeigth(BoxWithWeigth other) {
        super(other);
        weight = other.weight;
    }

    public BoxWithWeigth(double l, double h, double w, double weight) {
        super(l, h, w); //
        this.weight = weight;
    }
}
