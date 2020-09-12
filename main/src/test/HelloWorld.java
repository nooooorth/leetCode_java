package test;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("hello,world!");
        String version = System.getProperty("java.version");
        System.out.println("java version:"+version);
    }
}
