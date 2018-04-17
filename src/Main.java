public class Main {

    public static void main(String[] args) {
        circle c = new circle(5);
        circle c2 = new circle(6);
        circle c3 = new circle(7);

        System.out.println("--圓形--");
        System.out.println("--第一組資料--");
        c.show();
        c.area();
        c.perimeter();
        System.out.println("--第二組資料--");
        c2.show();
        c2.area();
        c2.perimeter();
        System.out.println("--第三組資料--");
        c3.show();
        c3.area();
        c3.perimeter();


        System.out.println();

        System.out.println("-三角形-");
        triangle tri = new triangle(5,12,90);
        triangle tri2 = new triangle(1,1,90);
        triangle tri3 = new triangle(3,4,90);
        System.out.println("--第一組資料--");
        tri.show();
        tri.area();
        tri.perimeter();
        System.out.println("--第二組資料--");
        tri3.show();
        tri2.area();
        tri2.perimeter();
        System.out.println("--第三組資料--");
        tri3.show();
        tri3.area();
        tri3.perimeter();

        System.out.println();

        System.out.println("-長方形-");
        rectangle rect = new rectangle( 6,8);
        rectangle rect2 = new rectangle( 6,10);
        rectangle rect3 = new rectangle( 8,10);
        System.out.println("--第一組資料--");
        rect.show();
        rect.area();
        rect.perimeter();
        System.out.println("--第二組資料--");
        rect2.show();
        rect2.area();
        rect2.perimeter();
        System.out.println("--第三組資料--");
        rect2.show();
        rect3.area();
        rect3.perimeter();



            }
        }


