package com.parent.testWorker;

import admin.Worker;
import factories.workerFactory.impl.UseWorkerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by student on 2016/04/03.
 */
public class TestWorker {
    @Test
    public void testWorkerName() throws Exception {
        UseWorkerFactory workerFactory = new UseWorkerFactory();
        Assert.assertEquals(workerFactory.getWorker("Cleaner").getName(),"Lana");
    }

    @Test
    public void testWorkerSetName() throws Exception {
        UseWorkerFactory workerFactory = new UseWorkerFactory();
        Assert.assertEquals(workerFactory.getWorker("Cleaner").getName(),"Lana");

        Worker worker = new Worker.Builder()
                .name("Lezandi")
                .build();

        Assert.assertEquals(worker.getName(),"Lezandi");
    }
}
