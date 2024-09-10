public class App {
    public static void main(String[] args) throws Exception {
        Worker generalWorker = new Worker("Lance", "02/02/2005");
        System.out.println(generalWorker.getAge());
    }
}
