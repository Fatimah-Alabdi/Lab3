

public class Main {
    public static void main(String[] args) {
        Store store = new Store();


        Book book1 = new Book("Thinking, Fast and Slow", " Daniel Kahneman", "978-0374533557", 11.99, 19);
        Book book2  = new Book("Dune ", " Frank Herbert", "978-0441013593 ", 15.0, 10);

        Novel novel1 = new Novel("The Lord of the Rings", "J.R.R. Tolkien", "978-0544003415", 27.99, 8, 8, "Fantasy");
        Novel novel2=new Novel("1984","George Orwell","978-0961013593",9.0,19,6,"Fiction");

        AcademicBook academicBook1=new AcademicBook("Artificial Intelligence","Stuart Russell","978-0136042594",20.0,8,7,"computer");
        AcademicBook academicBook2=new AcademicBook("The Wealth of Nations","Adam Smith","978-0549903415",25.0,8,7,"Economics and Business");

        Movie movie1 = new Movie("Forrest Gump", "Robert Zemeckis", "1112131415", 11.99, 130);
        Movie movie2 = new Movie("Home Alone", "John Hughes", "1132131885", 10.09, 140);
        Movie movie3=new Movie("King kong","Peter Jackson","1213641516",10.7,160);

        Music music1 = new Music("Nevermind", "Rumours", "1213141516", 8.0, "Nirvana");
        Music music2 = new Music("moonlight", "Eric Taylor", "1203141516", 7.0, "Allen");
        Music music3=new Music("Dreamer","Carl Schachter","1203141599",10.0,"Jony");

        Review review1 = new Review("Fatimah", 7, "very good!");
        Review review2 = new Review("manal", 8, " good!");
        Review review3 = new Review("nora", 6, " good!");


        book1.addReview(review1);
        book2.addReview(review2);

        academicBook1.addReview(review1);
        academicBook2.addReview(review2);

        novel1.addReview(review3);
        novel2.addReview(review1);

        store.addMedia(book1);
        store.addMedia(book2);

        store.addMedia(novel1);
        store.addMedia(novel2);

        store.addMedia(academicBook1);
        store.addMedia(academicBook2);

        store.addMedia(movie1);
        store.addMedia(movie2);
        store.addMedia(movie3);

        store.addMedia(music1);
        store.addMedia(music2);
        store.addMedia(music3);

        System.out.println("~~~ Available media:~~~");
        store.displayMedia();
            System.out.println("--------------------");
            User user1 = new User("Fatimah", "Fatimah@gmail.com");
            User user2 = new User("Norah", "Norah@gmail.com");
            User user3 = new User("John", "John@gmail.com");

            store.addUser(user1);
            store.addUser(user2);
            store.addUser(user3);




        System.out.println("User actions:");
        user1.addToCart(book1);
       // user1.addToCart(novel1);
        //user1.addToCart(music2);
        user1.addToCart(movie2);
        //user1.addToCart(academicBook1);

        user2.addToCart(movie1);
       // user2.addToCart(music1);
       // user2.addToCart(novel2);
        user2.addToCart(book2);
       // user2.addToCart(academicBook2);

        user1.checkout();

        user2.checkout();
        System.out.println("--------------------");
        System.out.println("User 1 purchased medias:");
        System.out.println(user1.getPurchasedMediaList());
        System.out.println("User 2 purchased medias:");
        System.out.println(user2.getPurchasedMediaList());
        System.out.println("~~~ Available users:~~~");
        System.out.println(store.displayUsers());

        System.out.println("--------------------");
        System.out.println("Average Rating for " + book1.getTitle() + ": " + book1.getAverageRating());


        System.out.println("Searching for a book:");
        Book foundBook = store.searchBook("non");
        if (foundBook != null) {
            System.out.println("Book found: " + foundBook);
        } else {
            System.out.println("Book not found");
        }

        System.out.println("-----------------------");
        System.out.println("Restocking a book:");
        book1.restock(5);

        System.out.println("-----------------------");
        System.out.println("Available media after restocking:");
        store.displayMedia();
        System.out.println("-------------------------");
        System.out.println("User 1 purchase book1:");
        book1.purchase(user1);
        System.out.println(user1.getPurchasedMediaList());
        System.out.println("---------------------------");
        System.out.println("Media type for book1 :");
        System.out.println(  book1.getMediaType());
        System.out.println("Media type for movie1 ");
        System.out.println(movie1.getMediaType());
        System.out.println("Media type for music1");
        System.out.println(music1.getMediaType());
        System.out.println("Media type for novel1");
        System.out.println(novel1.getMediaType());
        System.out.println("Media type for academicbook1");
        System.out.println(academicBook1.getMediaType());




    }
}