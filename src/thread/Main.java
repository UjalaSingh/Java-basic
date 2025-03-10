package thread;

public class Main {
    public static void main(String[] args) {
//        System.out.println("hllo world");
//        System.out.println(Thread.currentThread().getName());

        World world=new World();
        world.start();

        for(int i=0;i<5;i++){
            System.out.println("hello");
            System.out.println(Thread.currentThread().getName());
        }

    }
}
