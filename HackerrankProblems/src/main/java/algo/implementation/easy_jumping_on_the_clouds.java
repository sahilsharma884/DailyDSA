package algo.implementation;

public class easy_jumping_on_the_clouds {

    public static int jumpingOnClouds(int[] c, int k) {
        int energyUsed = 0;
        int index = -1;
        int j = 0;

        while(index != 0){
            index = (j+k) % c.length;
            if(index == 0) break;
            if(c[index] == 1) energyUsed += 2;
            energyUsed += 1;
//            System.out.println(j + " -> " + (j+k)%c.length + ": " + energyUsed);
            j+=k;
        }

        energyUsed += c[0] == 0 ? c[0]+1 : c[0]+2;

        return 100 - energyUsed;
    }
}
