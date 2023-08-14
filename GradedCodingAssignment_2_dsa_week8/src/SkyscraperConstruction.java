import java.util.*;

public class SkyscraperConstruction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the total number of floors in the building:");
        int N = scanner.nextInt();
        
        PriorityQueue<Integer> floorSizes = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            System.out.println("Enter the floor size given on day " + (i + 1) + ":");
            int size = scanner.nextInt();
            floorSizes.offer(size);

            PriorityQueue<Integer> tempQueue = new PriorityQueue<>(Collections.reverseOrder());
            for (Integer floorSize : floorSizes) {
                tempQueue.offer(floorSize);
            }
            while (!tempQueue.isEmpty()) {
                System.out.print(tempQueue.poll() + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
