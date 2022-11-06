public class ContainersWithCycle {
    static int truck = 0;
    static int boxes = 0;
    static int containers = 556;
    static int boxesInContainers = 27;
    static int containersInTruck = 12;

    public static void cycleContainers() {
        for (int i = 0; i < boxes; ) {
            if (boxes == 0) {
                break;
            }
            truck++;
            System.out.println("Грузовик " + truck);
            while (true) {
                containers++;
                System.out.println("\tКонтейнер: " + containers);
                while (true) {
                    i++;
                    if (i == boxes + 1) {
                        break;
                    }
                    System.out.println("\t\tЯщик " + i);
                    if (i % boxesInContainers == 0) {
                        break;
                    }
                }
                if (containers % containersInTruck == 0) {
                    break;
                }
                if (i >= boxes) {
                    break;
                }
            }
        }
    }
}
