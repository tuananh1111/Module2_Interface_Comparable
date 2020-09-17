import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        ComparableCircle[] circles= new ComparableCircle[3];
        circles[0]= new ComparableCircle();
        circles[1]=new ComparableCircle(10.0);
        circles[2]=new ComparableCircle(5.0,"Red",true);

        System.out.println("Pre-sorted:");
        for (ComparableCircle circle: circles){
            System.out.println(circle);
        }
        Arrays.sort(circles);
        System.out.println("After-sorted:");
        for (ComparableCircle circle: circles){
            System.out.println(circle);
        }
    }
}
