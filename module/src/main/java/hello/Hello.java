package hello;

import com.google.common.base.Joiner;

public class Hello {
    public void say(String string){
        System.out.println(string);
    }

    public static void main(String[] args) {
        new Hello().say(Joiner.on(", ").join(args));
    }
}
