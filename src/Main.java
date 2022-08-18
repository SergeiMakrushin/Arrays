public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //task 01 & 02//
        System.out.println("task 1 & task 2");
        int[] cherry = new int[]{1, 2, 3};
        System.out.println(cherry[0] + ", " + cherry[1] + ", " + cherry[2]);

        float[] apple = {1.57f, 7.654f, 9.986f};
        apple[1] = 7.654f;
        System.out.println(apple[0] + ", " + apple[1] + ", " + apple[2]);

        byte[] orange = new byte[5];
        orange[0] = 12;
        orange[1] = 13;
        orange[2] = 11;
        orange[3] = 4;
        orange[4] = 64;
        System.out.println(orange[0] + ", " + orange[1] + ", " + orange[2] + ", " + orange[3] + ", " + orange[4]);
        //task03//
        System.out.println("task 3");
        System.out.println(cherry[2] + ", " + cherry[1] + ", " + cherry[0]);
        System.out.println(apple[2] + ", " + apple[1] + ", " + apple[0]);
        System.out.println(orange[4] + ", " + orange[3] + ", " + orange[2] + ", " + orange[1] + ", " + orange[0]);
        //task04//
        System.out.println("task 4");
        for (int b=0; b<cherry.length; b++){
            if (b % 2!=0){
                b=b+1;}
            System.out.println(cherry[b]=cherry[b]+1);}






    }




        }

