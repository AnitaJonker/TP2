package com.parent.testMember;

import factories.membersFactory.impl.UseMemberFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by student on 2016/04/03.
 */
public class TestMember {

    @Test
    public void testMemberName() throws Exception {
        UseMemberFactory memberFactory = new UseMemberFactory();
        Assert.assertEquals(memberFactory.getMember().getName(),"Anita");
    }

    
}
