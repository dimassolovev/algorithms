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
        Assertions.assertEquals(2, this.linearSearch.search(array, 5)); // Элемент найден в середине
    }

    @Test
    void searchElementPresentAtStartReturnsCorrectIndex() {
        int[] array = {4, 2, 5, 7, 1, 3};
        Assertions.assertEquals(0, this.linearSearch.search(array, 4)); // Элемент найден в начале
    }

    @Test
    void searchElementPresentAtEndReturnsCorrectIndex() {
        int[] array = {4, 2, 5, 7, 1, 3};
        Assertions.assertEquals(5, this.linearSearch.search(array, 3)); // Элемент найден в конце
    }

    @Test
    void searchElementNotPresentReturnsMinusOne() {
        int[] array = {4, 2, 5, 7, 1, 3};
        Assertions.assertEquals(-1, this.linearSearch.search(array, 9)); // Элемент отсутствует
    }

    @Test
    void searchEmptyArrayReturnsMinusOne() {
        int[] array = {};
        Assertions.assertEquals(-1, this.linearSearch.search(array, 5)); // Пустой массив
    }

    @Test
    void searchSingleElementArrayElementFoundReturnsIndex() {
        int[] array = {7};
        Assertions.assertEquals(0, this.linearSearch.search(array, 7)); // Один элемент найден
    }

    @Test
    void searchSingleElementArrayElementNotFoundReturnsMinusOne() {
        int[] array = {7};
        Assertions.assertEquals(-1, this.linearSearch.search(array, 3)); // Один элемент отсутствует
    }

    @Test
    void searchDuplicatesReturnsFirstOccurrenceIndex() {
        int[] array = {4, 2, 5, 7, 5, 3};
        Assertions.assertEquals(2, this.linearSearch.search(array, 5)); // Найден первый 5
    }

    @Test
    void searchNegativeNumbersReturnsCorrectIndex() {
        int[] array = {-10, -5, 0, 5, 10};
        Assertions.assertEquals(1, this.linearSearch.search(array, -5)); // Отрицательное число найдено
    }
}
