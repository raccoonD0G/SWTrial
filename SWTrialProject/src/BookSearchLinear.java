import java.util.List;

public class BookSearchLinear {
    private List<Book> books;

    // 생성자
    public BookSearchLinear(List<Book> books) {
        this.books = books;
    }

    // 순차 탐색 함수
    public Book search_linear(int bookId) {
        for (Book book : books) {
            if (book.getId() == bookId) {
                return book;
            }
        }
        return null; // 책을 찾지 못한 경우
    }
}

