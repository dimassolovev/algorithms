package search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {
    private BinarySearch binarySearch;

    @BeforeEach
    void init() {
        this.binarySearch = new BinarySearch();
    }

    @Test
    void testElementPresentInMiddle() {
        int[] array = {1, 3, 5, 7, 9, 11};
        Assertions.assertEquals(2, this.binarySearch.search(array, 5));
    }

    @Test
    void testElementPresentAtStart() {
        int[] array = {1, 3, 5, 7, 9, 11};
        Assertions.assertEquals(0, this.binarySearch.search(array, 1));
    }

    @Test
    void testElementPresentAtEnd() {
        int[] array = {1, 3, 5, 7, 9, 11};
        Assertions.assertEquals(5, this.binarySearch.search(array, 11));
    }

    @Test
    void testElementNotPresent() {
        int[] array = {1, 3, 5, 7, 9, 11};
        Assertions.assertEquals(-1, this.binarySearch.search(array, 4));
    }

    @Test
    void testEmptyArray() {
        int[] array = {};
        Assertions.assertEquals(-1, this.binarySearch.search(array, 5));
    }

    @Test
    void testSingleElementArrayFound() {
        int[] array = {5};
        Assertions.assertEquals(0, this.binarySearch.search(array, 5));
    }

    @Test
    void testSingleElementArrayNotFound() {
        int[] array = {5};
        Assertions.assertEquals(-1, this.binarySearch.search(array, 7));
    }

    @Test
    void testNegativeNumbers() {
        int[] array = {-10, -5, 0, 5, 10};
        Assertions.assertEquals(1, this.binarySearch.search(array, -5));
    }

    @Test
    void testLargeArray() {
        int[] array = new int[1000];
        for (int i = 0; i < 1000; i++) array[i] = i; // Массив от 0 до 999
        Assertions.assertEquals(500, this.binarySearch.search(array, 500));
    }
}