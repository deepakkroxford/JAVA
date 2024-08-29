package Java_8_feature.T6_TypesOFFunctionalInterface;

import java.util.function.Supplier;

public class T4_Supplier {
    public static void main(String[] args) {
        Supplier<String> s=()->{
            String otp="";
            for(int i=0;i<8;i++)
            {
                otp=otp+ (int)(Math.random()*10);
            }
            return otp;
        };

        System.out.println(s.get());
        System.err.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());


    }
}
