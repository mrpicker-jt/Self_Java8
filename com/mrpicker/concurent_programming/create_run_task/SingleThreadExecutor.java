package com.mrpicker.concurent_programming.create_run_task;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class SingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService exec =
            Executors.newSingleThreadExecutor();
        IntStream.range(0, 10)
            .mapToObj(NapTask::new)
            .forEach(exec::execute);
        System.out.println("All tasks submitted");
        exec.shutdown();
//public class CachedThreadPool {
//    public static void main(String[] args) {
//        ExecutorService exec
//        =Executors.newCachedThreadPool();
//        IntStream.range(0, 10)
//        .mapToObj(NapTask::new)
//        .forEach(exec::execute);
//        exec.shutdown();
//    }
//}
    }
}