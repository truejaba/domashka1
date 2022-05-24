public class Main {
    // Ввод количества ящиков
    // Метод который делит количество ящиков на количество контейнеров т.е на 27 и выдает необходимое их количество
    // Метод который принимает количество контейнеров и исходя из их количества выдает необходимое количество грузовиков
    // Метод который выдает информацию исходя из данных
    static int truck = 0;
    static int boxes = 7;
    static int containers = 0;

    public static void main(String[] args) {
        for (int i = 0; i <= boxes + 1;) {
            truck++;
            if(i == boxes + 1){break;}
            System.out.println("Грузовик " + truck);
            while (true) {
                containers++;
                if(i == boxes + 1){break;}
                System.out.println("Контейнер: " + containers);
                while (true){
                    i++;
                    if(i == boxes + 1){break;}
                    System.out.println("Ящик " + i);
                    if (i % 3 == 0 ) {break;}
                }
                if(containers % 2 == 0){break;}
            }
        }
    }




}
