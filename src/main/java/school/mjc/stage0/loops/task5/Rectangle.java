package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){

        for (int i = 0; i <= height - 1; i++) {
            for (int j = 0; j < length; j++) {
                if (j > 0 && j < length - 1 && i > 0 && i < height - 1) {
                    System.out.print(" ");
                    continue;
                }
                System.out.print("8");
            }
            System.out.println();

        }


    }
}
