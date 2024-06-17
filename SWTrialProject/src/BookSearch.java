import java.util.List;

public class BookSearch {
    private List<Book> books;

    // 생성자
    public BookSearch(List<Book> books) {
        this.books = books;
    }

    // 이진 탐색 함수
    public Book search_bs(int bookId) {
        int left = 0;
        int right = books.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (books.get(mid).getId() == bookId) {
                return books.get(mid);
            }
            if (books.get(mid).getId() < bookId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null; // 책을 찾지 못한 경우
    }
}
