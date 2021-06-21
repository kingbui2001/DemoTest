package demo;

public class Calculator {
    // Demo SVN
    public int add(int a, int b){
        return a+b;
    }
    public int mul(int a, int b){
        return a*b;
    }
    public int sub(int a, int b){
        return a-b;
    }
    public int div(int a, int b){
        if(a<0) return 0;
        else if(b<0) System.out.print("unavailable");
        else return a/b;
    }
}
