public class circle extends shape{

    private int r ;


    public circle (int r1 ){
      r=r1;
    }






    public void area(){
        System.out.println("半徑r="+r);
        System.out.println("area="+r*r*pi);
    }

    public void perimeter(){
        System.out.println("perimeter="+Math.round(r*2*pi*100)/100f);
    }






}
