public class circle {
    public double x,y;
    public double r;
    public double circum(){
        return 2*Math.PI*r;
    }
    public double area(){
        return Math.PI*r*r;
    }
    public void display(){
        System.out.println("Center of circle: "+x+","+y);
        System.out.println("Circumference: " + circum());
        System.out.println("Area: " + area());
    }
    public static void main(String[] args){
        circle c1 = new circle();
        c1.x=5.0;
        c1.y=7.0;
        c1.r=10.0;
        c1.display();
    }
}
