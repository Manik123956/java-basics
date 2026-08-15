class box{
    public double width, height, depth;
    box(){
        width=10;
        height=10;
        depth=10;
    }
    box(double w, double h, double d){
        width=w;
        height=h;
        depth=d;
    }
    box(box x){
        width = x.width;
        height = x.height;
        depth = x.depth;
    }
    public double volume(){
        return width*height*depth;
    }
    public void display(){
        System.out.println("Width: "+width);
        System.out.println("Height: "+height);
        System.out.println("Depth: "+depth);
        System.out.println("Volume: "+volume());
    }
}
public class boxModel {
    public static void main(String[] args){
        box b1 = new box();
        box b2 = new box(5, 6, 7);
        box b3 = new box(b2);
        System.out.println("volume of box 1: "+b1.volume());
        System.out.println("volume of box 2: "+b2.volume());
        System.out.println("volume of box 3: "+b3.volume());
    }
}
