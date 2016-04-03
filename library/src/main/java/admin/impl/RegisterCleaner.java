package admin.impl;

import admin.RegisterWorker;
import admin.Worker;


/**
 * Created by student on 2016/03/31.
 */
public class RegisterCleaner extends WorkerDetails implements RegisterWorker {

    public Worker registerWorker()
    {
        Worker cleaner = new Worker.Builder()
                .name("Lana")
                .surname("De Waal")
                .address("Barbarossa str 4")
                .build();
        return cleaner;
    }

    public Worker handleRequest(String request) {
        if(request.equalsIgnoreCase("Cleaner")){
            return registerWorker();
        }else{
            if (request!=null) {
                return nextType.handleRequest(request);
            }
            return null;
        }
    }


}


