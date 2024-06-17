import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

class BookSearchLinearTest {
    private BookSearchLinear bookSearchLinear;

    @BeforeEach
    void setUp() throws Exception {
        bookSearchLinear = new BookSearchLinear(Arrays.asList(
            new Book(1, "Book One"),
            new Book(2, "Book Two"),
            new Book(3, "Book Three")
        ));
        System.out.println("ID가 1,2,3인 책 생성");
    }

    @Test
    void testSearchLinearFound() {
        System.out.println("책 찾기 테스트 시작 (ID 존재)");
        assertNotNull(bookSearchLinear.search_linear(1), "ID가 1인 책이 존재해야 합니다");
        System.out.println("책 찾기 테스트 통과 (ID 존재): ID 1인 책을 찾았습니다");
    }

    @Test
    void testSearchLinearNotFound() {
        System.out.println("책 찾기 테스트 시작 (ID 미존재)");
        assertNull(bookSearchLinear.search_linear(4), "ID가 4인 책은 존재하지 않아야 합니다");
        System.out.println("책 찾기 테스트 통과 (ID 미존재): ID 4인 책을 찾지 못했습니다");
    }
}