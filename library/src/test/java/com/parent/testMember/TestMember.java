package com.parent.testMember;

import bookSystem.Books;
import factories.membersFactory.impl.UseMemberFactory;
import members.impl.Member;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.print.Book;

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
