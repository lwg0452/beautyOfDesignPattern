package Proxy.StaticProxy.a;

public class RockSingerProxy implements Singer {

    RockSinger rockSinger;

    public RockSingerProxy(RockSinger rockSinger) {
        this.rockSinger = rockSinger;
    }


    @Override
    public void sing(String str) {
        System.out.println("This message is from RockSingerProxy...");
        rockSinger.sing(str);
    }

    public static void main(String[] args) {
        Singer singer = new RockSingerProxy(new RockSinger());
        singer.sing("I am a rock singer!!");
    }
}
