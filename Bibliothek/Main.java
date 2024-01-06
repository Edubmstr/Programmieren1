package Bibliothek;

public class Main {
    public static void main(String[] args){
        Library libray1 = new Library("Bibliothek");
        Member member1 = new Member("Ich");
        Book book1 = new Book("Buch", "Autor", 3, "Lager");
        libray1.addItem(book1);
        member1.register(libray1);
        member1.borrowItem(book1);
        member1.returnItem(book1);
        member1.getHistory();

    }
}
