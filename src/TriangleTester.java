public class TriangleTester {
    public static boolean isTriangle(int a, int b, int c){
        return ((Integer.signum(a)>0)&&(Integer.signum(b)>0)&&(Integer.signum(c)>0))&&(( (a+b)>c)&&((a+c)>b)&&((b+c)>a));
    }
}

