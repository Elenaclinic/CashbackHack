package ru.netology.service;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testRemain900() {

        CashbackHackService CashbackHackService = new CashbackHackService();

        int actual = CashbackHackService.remain(900);
        int expected = 100;

        assertEquals(actual,expected);
    }
    @org.testng.annotations.Test
    public void testRemain1() {

        CashbackHackService CashbackHackService = new CashbackHackService();

        int actual = CashbackHackService.remain(1);
        int expected = 999;

        assertEquals(actual,expected);
    }

    @org.testng.annotations.Test
    public void testRemain1000() {

        CashbackHackService CashbackHackService = new CashbackHackService();

        int actual = CashbackHackService.remain(1000);
        int expected = 0;

        assertEquals(actual,expected);
    }
    @org.testng.annotations.Test
    public void testRemain999_999_999() {

        CashbackHackService CashbackHackService = new CashbackHackService();

        int actual = CashbackHackService.remain(999_999_999);
        int expected = 1;

        assertEquals(actual,expected);
    }
}