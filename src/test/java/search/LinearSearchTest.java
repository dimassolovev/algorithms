package search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LinearSearchTest {
    private LinearSearch linearSearch;
    
    @BeforeEach
    public void init() {
        this.linearSearch = new LinearSearch();
    }
    
    @Test
    void searchElementPresentInMiddleReturnsCorrectIndex() {
        int[] array = {4, 2, 5, 7, 1, 3};
        Assertions.assertEquals(2, this.linearSearch.search(array, 5));
    }

    @Test
    void searchElementPresentAtStartReturnsCorrectIndex() {
        int[] array = {4, 2, 5, 7, 1, 3};
        Assertions.assertEquals(0, this.linearSearch.search(array, 4));
    }

    @Test
    void searchElementPresentAtEndReturnsCorrectIndex() {
        int[] array = {4, 2, 5, 7, 1, 3};
        Assertions.assertEquals(5, this.linearSearch.search(array, 3));
    }

    @Test
    void searchElementNotPresentReturnsMinusOne() {
        int[] array = {4, 2, 5, 7, 1, 3};
        Assertions.assertEquals(-1, this.linearSearch.search(array, 9));
    }

    @Test
    void searchEmptyArrayReturnsMinusOne() {
        int[] array = {};
        Assertions.assertEquals(-1, this.linearSearch.search(array, 5));
    }

    @Test
    void searchSingleElementArrayElementFoundReturnsIndex() {
        int[] array = {7};
        Assertions.assertEquals(0, this.linearSearch.search(array, 7));
    }

    @Test
    void searchSingleElementArrayElementNotFoundReturnsMinusOne() {
        int[] array = {7};
        Assertions.assertEquals(-1, this.linearSearch.search(array, 3));
    }

    @Test
    void searchDuplicatesReturnsFirstOccurrenceIndex() {
        int[] array = {4, 2, 5, 7, 5, 3};
        Assertions.assertEquals(2, this.linearSearch.search(array, 5));
    }

    @Test
    void searchNegativeNumbersReturnsCorrectIndex() {
        int[] array = {-10, -5, 0, 5, 10};
        Assertions.assertEquals(1, this.linearSearch.search(array, -5));
    }
}
