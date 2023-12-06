package Models;

import java.time.LocalDate;
import java.util.List;

public class Authors {
    private int authorId;
    private String authorName;
    private Integer authorBirthYear;
    private List<Books> books;

    public Authors(String authorName, LocalDate birthDate) {
        this.authorName = authorName;
        this.authorBirthYear = birthDate != null ? birthDate.getYear() : null;
    }

    public Authors(int authorId, String authorName, LocalDate birthDate) {
        this.authorId = authorId;
        this.authorName = authorName;
        this.authorBirthYear = birthDate != null ? birthDate.getYear() : null;
    }

    @Override
    public String toString() {
        return "AuthorID: " + authorId +
                ", AuthorName: " + authorName +
                ", BirthYear: " + authorBirthYear;
    }


    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Integer getAuthorBirthYear() {
        return authorBirthYear;
    }

    public void setAuthorBirthYear(Integer authorBirthYear) {
        this.authorBirthYear = authorBirthYear;
    }

    public List<Books> getBooks() {
        return books;
    }

    public void setBooks(List<Books> books) {
        this.books = books;
    }
}

