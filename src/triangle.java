public class triangle extends shape{
    private int a ;
    private int b ;
    private float angle;
    public triangle(){}
    public triangle(int a1,int b1 , float angle1){
        this();
        a=a1;
        b=b1;
        angle=angle1; }
    public void area() {

        System.out.println("area=" + Math.round((a * b) / 2f*100)/100f);
    }
    public void perimeter() {
        System.out.println("perimeter=" + Math.round(Math.sqrt(a * a + b * b) + a + b*100f)/100f);
    }

    public void show(){
        System.out.println("a="+a+"\n"+"b="+b+"\n"+"角度"+angle);
    }

}
