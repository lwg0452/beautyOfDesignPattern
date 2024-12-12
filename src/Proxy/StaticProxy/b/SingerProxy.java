package Proxy.StaticProxy.b;

public class SingerProxy extends Singer {

    public SingerProxy() {}


    @Override
    public void sing(String str) {
        System.out.println("This message is from SingerProxy...");
        super.sing(str);
    }

    public static void main(String[] args) {
        Singer singer = new SingerProxy();
        singer.sing("I am a rock singer!!");
    }
}
