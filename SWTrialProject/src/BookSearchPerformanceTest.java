import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class BookSearchPerformanceTest {

    @Test
    void testPerformanceComparison() {
        System.out.println("이진 탐색과 순차 탐색 성능 비교 시작");

        // 큰 데이터셋 생성
        List<Book> largeBookList = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            largeBookList.add(new Book(i, "Book " + i));
        }

        BookSearch largeBookSearch = new BookSearch(largeBookList);
        BookSearchLinear largeBookSearchLinear = new BookSearchLinear(largeBookList);

        // 이진 탐색 성능 테스트
        long startTime = System.currentTimeMillis();
        largeBookSearch.search_bs(99999);
        long endTime = System.currentTimeMillis();
        long binarySearchTime = endTime - startTime;

        // 순차 탐색 성능 테스트
        startTime = System.currentTimeMillis();
        largeBookSearchLinear.search_linear(99999);
        endTime = System.currentTimeMillis();
        long linearSearchTime = endTime - startTime;

        System.out.println("이진 탐색 시간: " + binarySearchTime + "ms");
        System.out.println("순차 탐색 시간: " + linearSearchTime + "ms");

        // 이진 탐색이 순차 탐색보다 빨라야 한다
        assertTrue(binarySearchTime < linearSearchTime, "이진 탐색이 순차 탐색보다 빨라야 합니다");
    }
}
