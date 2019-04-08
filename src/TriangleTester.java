public class TriangleTester {
    public static boolean isTriangle(int a, int b, int c){
        return (( (a+b)>c)&&((a+c)>b)&&((b+c)>a));
    }
}

class TestTriangleTester {
    public static void main(String[] args) {
        double startTimeStSort = System.nanoTime();

        System.out.println(TriangleTester.isTriangle(3,4,5));
        double endTimeStSort = System.nanoTime();
        System.out.println((startTimeStSort- endTimeStSort)/1e9);
        System.out.println(TriangleTester.isTriangle(-1,-2,-3));
    }
}

