dynamic thread ::: creating thread at runtime at single go 


use dynamic thread ???
>>> how many task there need to be created 
>>> parallel execution of many task at single go 


for(int i=0;i<10;i++){
    //Thread t=new Thread();
    Thread t=new Thread(()->{
        System.out.println(Thread.currentThread().getId());


    });
    //naya thread creTae kia with msg as id of thread 
    t.start();
    // process them by cpu ....ready state 

}



// ExecutorService:::
use:::
concept of threadpool 
large no of task 

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Dynamicpool{
    public static void main(String[] args){
        ExecutorService exe=Executors.newFixedThreadPool(10);
        //pool of 10 worker thread!!!
        for(int i=0;i<10;i++){
            //executorsevice help me now
            executor.submit(()->{
                System.out.println(Thread.currentThread().getId());
            });
        }
        executor.shutdown();
    }
}