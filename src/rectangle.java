public class rectangle extends shape{
    private int width ;
    private int height ;
    public rectangle(){
         }
    public rectangle (int width1 , int height1){
        this();
        width=width1;
        height=height1; }

    public void area() {
        System.out.println("寬="+width+"\n"+"長="+height);
        System.out.println("area=" + (width * height));
    }
    public void perimeter() {
        System.out.println("perimeter=" + (width+width+height+height));


    }
}
