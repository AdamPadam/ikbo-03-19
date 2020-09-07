package ru.mirea.LESSON_2.PRACTIK.Author;

public class TestAuthor {

    public static void main(String[] args) {
        Author author1 = new Author("Tolstoy", "tolstoy@war.piece", 'M');
        Author author2 = new Author("Cvetaeva", "cvetaeva@gulag.ussr", 'F');
        System.out.println(author1);
        System.out.println(author2);
    }
}
