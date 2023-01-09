package com.overone.blok20Threads.FinalThreadPtoject;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
              Tunnel tunnel = new Tunnel();

        Creator creator = new Creator(tunnel, 10);

        PortLoader Loader1 = new PortLoader(tunnel, Type.Одежда);
        PortLoader Loader2 = new PortLoader(tunnel, Type.Бананы);
        PortLoader Loader3 = new PortLoader(tunnel, Type.Хлеб);

        ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        service.execute(creator);
        service.execute(Loader1);
        service.execute(Loader2);
        service.execute(Loader3);

        service.shutdown();
    }
}
