package org.example._2024_02_03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * first
 *
 * fast - isolated - repeatable - selfValidation - timely
 */
class HolderTest {

    private static final Holder HOLDER = new Holder();
    private static final String EL_1 = "1";
    private static final String EL_2 = "2";
    private static final String EL_3 = "3";

    @BeforeEach
    public void setUp () {
        HOLDER.getList().clear();
    }

    @Test
    void addToListTest() {
        HOLDER.addToList(EL_1);
        Assertions.assertEquals(1, HOLDER.getList().size());
    }

    @Test
    void modifyListTest() {
        HOLDER.addToList(EL_1);
        HOLDER.addToList(EL_2);
        HOLDER.addToList(EL_3);

        HOLDER.modifyList();
        Assertions.assertEquals(Arrays.asList("1!", "2!", "3!"), HOLDER.getList());
    }
}