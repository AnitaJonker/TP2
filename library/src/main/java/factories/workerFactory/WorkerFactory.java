package factories.workerFactory;

import admin.Worker;

/**
 * Created by student on 2016/04/02.
 */
public interface WorkerFactory {
    Worker getWorker(String name);
}
