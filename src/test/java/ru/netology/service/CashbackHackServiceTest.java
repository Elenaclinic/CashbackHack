package ru.netology.service;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void buy999() {
        CashbackHackService CashbackHackService = new CashbackHackService();

        int actual = CashbackHackService.remain(999);
        int expected = 1;

        assertEquals(actual, expected);
    }
    @org.junit.Test
    public void buy1000() {
        CashbackHackService CashbackHackService = new CashbackHackService();

        int actual = CashbackHackService.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }
    @org.junit.Test
    public void buy1() {
        CashbackHackService CashbackHackService = new CashbackHackService();

        int actual = CashbackHackService.remain(1);
        int expected = 999;

        assertEquals(actual, expected);
    }
    @org.junit.Test
    public void buy500() {
        CashbackHackService CashbackHackService = new CashbackHackService();

        int actual = CashbackHackService.remain(500);
        int expected = 500;

        assertEquals(actual, expected);
    }
}