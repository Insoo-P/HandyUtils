package com.example.handyutils.utils;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilsTest {

    @BeforeAll
    static void setupBeforeAll() {
        // 모든 테스트가 실행되기 전에 한 번만 호출됩니다.
        System.out.println("#### Before All Tests");
    }

    @BeforeEach
    void setupBeforeEach() {
        // 각 테스트 메서드가 실행되기 전에 호출됩니다.
        System.out.println("#### Before Each Test");
    }

    @Test
    @DisplayName("StringUtils Reverse Method")
    void testStringUtils(){
        assertEquals("요세하녕안2", StringUtils.reverse("2안녕하세요"));
    }


    @AfterEach
    void teardownAfterEach() {
        // 각 테스트 메서드가 실행된 후에 호출됩니다.
        System.out.println("#### After Each Test");
    }

    @AfterAll
    static void teardownAfterAll() {
        // 모든 테스트가 실행된 후에 한 번만 호출됩니다.
        System.out.println("#### After All Tests");
    }



}
