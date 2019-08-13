import Newidea.Help;

public class Library {
    public Library(){
        System.out.println("Library is the best place to study");

    }
public Library(String book){
        System.out.println(book);

}

    public static void main(String[] args) {
            Library myLibrary = new Library();
            Library book = new Library("you can find any kind of book in the library");
         myLibrary.yes();
         book.no();
        Help add =new Help();
        add.ass(1222222,4567);
    }
public void yes(){
        System.out.println("Sometimes if you need anykind of book you can borrow from them");
}
public void no(){
        System.out.println("But borrowing book has some certain time");
}









}
