public class Main {
    public static void main(String[] args) {

         //task #1
        int[] weightg = new int[3];
        weightg[0] = 1;
        weightg[1] = 2;
        weightg[2] = 3;

        double[] growth = {1.57, 7.654, 9.986};

        char[] symbol = {'q', 'w', 'e', 'r', 't', 'y',};

        //task #2
        System.out.println(weightg[0] + ", " + weightg[1] + ", " + weightg[2]);
        System.out.println(growth[0] + ", " + growth[1] + ", " + growth[2]);
        System.out.println(symbol[0] + ", " + symbol[1] + ", " + symbol[2] + ", " + symbol[3] + ", " + symbol[4] + ", " + symbol[5]);
        System.out.println();

        //task #3
        System.out.println(weightg[2] + ", " + weightg[1] + ", " + weightg[0]);
        System.out.println(growth[2] + ", " + growth[1] + ", " + growth[0]);
        System.out.println(symbol[5] + ", " + symbol[4] + ", " + symbol[3] + ", " + symbol[2] + ", " + symbol[1] + ", " + symbol[0]);
        System.out.println();

        //task #4
        for (int i = 0; i < 3; i++) {
            if (weightg[i] % 2 > 0) {
                weightg[i] = weightg[i] + 1;
            }
            System.out.print(weightg[i] + " ");
        }



    }
}