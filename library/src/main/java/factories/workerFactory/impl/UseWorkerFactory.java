package factories.workerFactory.impl;

import admin.Worker;
import admin.impl.RegisterCleaner;
import admin.impl.RegisterLibrarian;
import admin.impl.RegisterSecurity;
import admin.impl.WorkerDetails;
import factories.workerFactory.WorkerFactory;

/**
 * Created by student on 2016/04/02.
 */
public class UseWorkerFactory implements WorkerFactory {
    Worker worker;

    public Worker getWorker(String workerType) {
        WorkerDetails chain = setUpChain();
        return chain.handleRequest(workerType);
    }

    public static WorkerDetails setUpChain(){
        WorkerDetails cleaner = new RegisterCleaner();
        WorkerDetails librarian = new RegisterLibrarian();
        WorkerDetails security = new RegisterSecurity();
        cleaner.setNextWorkerType(librarian);
        librarian.setNextWorkerType(security);
        return cleaner;
    }



}
