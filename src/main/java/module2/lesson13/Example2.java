package module2.lesson13;

public class Example2 {
    public static void main(String[] args) {

        ThreadGroup threadGroup = new ThreadGroup("my group");
        threadGroup.setMaxPriority(4);
        Thread thread = new Thread(threadGroup, "my thread"){
            @Override
            public void run(){
                while (true){

                }
            }
        };
        System.out.println(thread.getState());


        thread.setPriority(10);

        System.out.println(thread.getPriority());
        thread.start();
        System.out.println(thread.getState());

        //threadGroup.interrupt();

//        int priority = thread.getPriority();
//        System.out.println(thread.isDaemon());

//        System.out.println(priority);
//        int maxPriority = threadGroup.getMaxPriority();
//        System.out.println(maxPriority);
//        System.out.println(threadGroup.isDaemon());
//        System.out.println(threadGroup);
//        System.out.println(threadGroup.activeCount());
    }
}
