package admin.impl;

import admin.RegisterWorker;
import admin.Worker;

/**
 * Created by student on 2016/03/31.
 */
public class RegisterLibrarian extends WorkerDetails implements RegisterWorker {

    public Worker registerWorker()
    {
        Worker librarian = new Worker.Builder()
                .name("Anita")
                .surname("Jonker")
                .address("Almeria str4")
                .build();
        return librarian;
    }

    public Worker handleRequest(String request) {
        if(request.equalsIgnoreCase("Librarian")){
            return registerWorker();
        }else{
            if (request!=null) {
                return nextType.handleRequest(request);
            }
            return null;
        }
    }


}
