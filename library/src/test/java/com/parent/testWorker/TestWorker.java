package com.parent.testWorker;

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
}
