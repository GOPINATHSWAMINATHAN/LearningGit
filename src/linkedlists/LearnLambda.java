package linkedlists;

public class LearnLambda {

    public static void main(String[] args) {

//        MyFunInterface f = () -> 22;
//        int a = f.methodOne();
//        System.out.println(a);


        //Declarative programming
        MyFunInterface mfun=new MyFunInterface() {
            @Override
            public int methodOne(int a) {
                return a;
            }
        };
        int aq=mfun.methodOne(2);
        System.out.println(aq);

        //Functional Programming
        MyFunInterface f1=a->
        {
            int b=a*a;
            return b;
        };
        int m=f1.methodOne(2);
        System.out.println(m);
        //System.out.println(f1.methodOne(2));

    }
}
