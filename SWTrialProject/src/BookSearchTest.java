import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

class BookSearchTest {
    private BookSearch bookSearch;

    @BeforeEach
    void setUp() throws Exception {
        bookSearch = new BookSearch(Arrays.asList(
            new Book(1, "Book One"),
            new Book(2, "Book Two"),
            new Book(3, "Book Three")
        ));
        System.out.println("ID가 1,2,3인 책 생성");
    }

    @Test
    void testSearchBsFound() {
        System.out.println("책 찾기 테스트 시작 (ID 존재)");
        assertNotNull(bookSearch.search_bs(1), "ID가 1인 책이 존재해야 합니다");
        System.out.println("책 찾기 테스트 통과 (ID 존재): ID 1인 책을 찾았습니다");
    }

    @Test
    void testSearchBsNotFound() {
        System.out.println("책 찾기 테스트 시작 (ID 미존재)");
        assertNull(bookSearch.search_bs(4), "ID가 4인 책은 존재하지 않아야 합니다");
        System.out.println("책 찾기 테스트 통과 (ID 미존재): ID 4인 책을 찾지 못했습니다");
    }
}

