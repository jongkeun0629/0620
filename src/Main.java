class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++){
            try{
                Thread.sleep(1000);
                System.out.println(i);
            } catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable(), "name");

        thread.start();

        System.out.println(thread.getName());
    }
}