/// **
// * Day 06-Jun-2025 of DSA Journey in Java Author: Jaswanth Date: 06-Jun-2025
// */
package oop;
//// creating class song
// class Song {
// String name;
// String movie;
//// displaying the song in displaySong method
// void displaySong() {
// System.out.println("Name of the song: " + name);
// System.out.println("Movie name :" + movie);
// }
// }
//
//// creating the playLsitto add the songs
// class PlayList {
// //creating the reference mySong fro class Song
// in there we are creating reference of another class with has-a relation ship
// Song mySong;
// // in ther we add the song in reference variable mySong
// void addSong(Song added) {
// mySong = added;
// }
// // display the my favorite song
// void myFavoritSong() {
// // display the cong with ref variable
// mySong.displaySong();
// }
// }
//
//
// public class Aggregation {
// public static void main(String[] args) {
// //creating the object for Song with s1
// Song s1 = new Song();
// // adding the name of the song
// s1.name = "Kali";
// // adding the movie
// s1.movie = "Kalki-2898 AD";
// //now we are adding the the song to playlist
// PlayList p1 = new PlayList();
//
// p1.addSong(s1);
// p1.myFavoritSong();
//
// }
// }

// creating the books with aggregation

class Book {
    String name;
    String author;

    void displayBook() {
        System.out.println("Book Name: " + name);
        System.out.println("Author of Book: " + author);
    }
}


class Publisher {
    Book myBook;

    void addBook(Book book) {
        myBook = book;
    }

    void displayBook() {
        myBook.displayBook();
    }
}


public class Aggregation {
    public static void main(String[] args) {

        Book bk = new Book();
        bk.name = "Game of Throns";
        bk.author = "Thomus";
        Publisher pb = new Publisher();
        pb.addBook(bk);
        pb.displayBook();

        bk.name = "PK";
        bk.author = "Ravi";
        bk.displayBook();
    }

}
