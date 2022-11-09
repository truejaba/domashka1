import java.nio.charset.Charset;
public class Main {

    static int truck = 0;
    static int boxes = 622;
    static int containers = 0;
    static int boxesInContainers = 27;
    static int containersInTruck = 12;

    public static void main(String[] args) {
        if (boxes > 0){truck = 1; containers = 1;}
        else {System.out.println("Ничего перевозить не нужно");}
        for (int i = 1; i <= boxes; i++){
            if (i == 1) {System.out.println("Грузовик " + truck + "\r\n" +
                    "\s" + "Контейнер " + containers);}
            System.out.println("\s\s" + "Ящик " + i);
            if (boxes == i) {break;}
            if(i % boxesInContainers == 0) {
                    if (containers  % containersInTruck == 0) {
                        truck++;
                        System.out.println("Грузовик " + truck);}
                    containers++;
                    System.out.println("Контейнер " + containers);
            }
        }
    }
}