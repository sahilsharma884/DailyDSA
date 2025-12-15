package algo.implementation;

public class the_great_xor {

    public static long theGreatXor(long x) {
        long result = 0;
        byte lsb = 0;
        long pow_2 = 1;

        while(true) {
            lsb = (byte) (x % 2); // 0 or 1
            if(lsb == 0) result += pow_2;
            x = x / 2;
            if(x > 0) pow_2 = pow_2 * 2;
            else break;
        }

        return result;
    }

}
