import java.util.ArrayList;
import java.util.Arrays;

public class Book extends Media{
    private int stock;
   private ArrayList<Review> reviews=new ArrayList<Review>();


    public Book(String title, String auteur, String ISBN, double price, int stock) {
        super(title, auteur, ISBN, price);
        this.stock = stock;
        this.reviews = new ArrayList<>();
    }

    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }
    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void addReview(Review review) {
        reviews.add(review);

    }
    public double getAverageRating() {
        double averageRating=0;
        for (Review review : reviews) {
            averageRating += review.getRating();
        }
        return averageRating / reviews.size();

    }



    public void purchase(User user) {
        if (stock > 0) {
            user.getPurchasedMediaList();
            stock--;
        }

    }
    public boolean isBestSeller(){
        return getAverageRating() >= 4.5;
    }
    public void restock(int quantity) {
        stock += quantity;
        System.out.println("Restocked " + quantity + " units of " + getTitle());

    }

    public String getMediaType(){
        if(getAverageRating() >= 4.5){
            return " Bestselling Book";
        }
       else
           return "Book";
    }

    @Override
    public String toString() {
        return "Book{" +
                " Quantity in stock:" + stock +
                ", reviews=" + reviews +
                "}"+super.toString();
    }
}
