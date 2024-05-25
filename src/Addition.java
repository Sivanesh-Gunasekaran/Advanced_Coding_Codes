import java.lang.invoke.StringConcatFactory;

class Addition{
    public static int add(int a, int b){
        int c = a+b;
        return c;
    }
    public static void add(){
        System.out.println("addition done");
    }
    public static int add(int a, int b, int c){
        int d = a+b+c;
        return d;
    }
    public static void add(String a, String b){
        String c = a+b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        String x = "blessy";
        String y = "Shiva";
        int two = add(a,b);
        System.out.println("two number: "+two);
        int c = two;
        int three = add(a,b,c);
        System.out.println("three number: "+three);
        add(x,y);
        add();
    }
}