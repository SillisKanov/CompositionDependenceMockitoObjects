public class Main {
    public static void main(String[] args) {

        ManagerPoster managerPoster = new ManagerPoster(9);
        managerPoster.add("блад");
        managerPoster.add("Вперёд");
        managerPoster.add("Отель");
        managerPoster.add("джентльмены");
        managerPoster.add("Неведимка");
        managerPoster.add("Троли");
        managerPoster.add("шот");
        managerPoster.add("Блфдшот");

        managerPoster.findAll();
        System.out.println();

        managerPoster.findLast();

    }
}