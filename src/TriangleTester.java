public class TriangleTester {
    public static boolean isTriangle(int a, int b, int c){
        return (( (a+b)>c)&&((a+c)>b)&&((b+c)>a));
    }
}

class TestTriangleTester {
    public static void main(String[] args) {


        System.out.println(TriangleTester.isTriangle(3,4,5));

    }
}

