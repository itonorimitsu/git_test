public class test{
    void run(String[] args){
        System.out.println("test実行");
    }
    public static void main(String[] args){
        test t = new test();
        t.run(args[0]);
    }
}
