class MyThread extends Thread{
    @Override
    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println("My Thread : " + i);

            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread thread = new MyThread();

        // 스레드 생성 및 실행
        thread.start();

        // run 메서드 호출
        thread.run();
        System.out.println("나를 막지마");
    }
}