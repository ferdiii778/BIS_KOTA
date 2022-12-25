import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Biskota {

    public static void main(String[] args) {
        ArrayList <int []> StopGo = new ArrayList<int[]>();
        //array pertama untuk orang naik bus, array kedua untuk orang yang mau turun
            StopGo.add(new int[]{10, 0});
            StopGo.add(new int[]{3, 5});
            StopGo.add(new int[]{2, 5});
            System.out.println(getPassenger(StopGo));
        }

        public static int getPassenger(ArrayList <int []> bisKota){
        return bisKota.get(0)[0]- bisKota.get(0)[1] + bisKota.get(1)[0]-bisKota.get(2)[1];
        }

    }
