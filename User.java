import java.util.ArrayList;

public class User {
    private String username;
    private String email;
    private ArrayList<Media> purchasedMediaList=new ArrayList<>();
    private ArrayList<Media> shoppingCart=new ArrayList<>();

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }
    public User(String username, String email, ArrayList<Media> purchasedMediaList, ArrayList<Media> shoppingCart) {
        this.username = username;
        this.email = email;
        this.purchasedMediaList = new ArrayList<>(purchasedMediaList);
        this.shoppingCart = new ArrayList<>(shoppingCart);
    }

    public String getUsername() {
    return username;
}
public String getEmail() {
    return email;
}

    public void setUsername(String username) {
        this.username = username;
    }
    public void setEmail(String email) {
    this.email = email;
    }
    public ArrayList<Media> getPurchasedMediaList() {
        return purchasedMediaList;
    }
    public void setPurchasedMediaList(ArrayList<Media> purchasedMediaList) {
        this.purchasedMediaList = purchasedMediaList;
    }
    public ArrayList<Media> getShoppingCart() {
        return shoppingCart;
    }
    public void setShoppingCart(ArrayList<Media> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }




    public void addToCart(Media media) {
        shoppingCart.add(media);

    }
    public void removeFromCart(Media media) {
        shoppingCart.remove(media);
    }
    public void checkout(){

        for (Media media : shoppingCart) {
            purchasedMediaList(media);

        }
        shoppingCart.clear();
    }

    private void purchasedMediaList(Media media) {
        purchasedMediaList.add(media);
    }

    @Override
    public String toString() {
        return
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", purchasedMediaList=" + purchasedMediaList +
                ", shoppingCart=" + shoppingCart
                ;
    }
}
