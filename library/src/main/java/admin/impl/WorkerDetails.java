package admin.impl;

import admin.Worker;

/**
 * Created by student on 2016/04/03.
 */
public abstract class WorkerDetails {

    WorkerDetails nextType;

    public void setNextWorkerType(WorkerDetails nextType) {
        this.nextType = nextType;
    }
    public abstract Worker handleRequest(String request);
}
