import java.util.ArrayList;

public class Store {
    private ArrayList<User> users=new ArrayList<>();
private ArrayList<Media> mediaList=new ArrayList<>();
 public Store() {

 }
    public Store(ArrayList<User> users, ArrayList<Media> mediaList) {
        this.mediaList = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    public ArrayList<User> getUser() {
        return users;
    }

    public void setUser(ArrayList<User> user) {
        this.users = user;
    }
    public ArrayList<Media> getMediaList() {
        return mediaList;
    }
    public void setMediaList(ArrayList<Media> mediaList) {
        this.mediaList = mediaList;
    }

    public void addUser(User user) {
users.add(user);
}
public ArrayList<User> displayUsers() {
    for (User user : users) {
        System.out.println(users);
    }
    return null;
}
public void addMedia(Media media) {
    mediaList.add(media);
}
public Media[] displayMedia() {
    for (Media media : mediaList) {
        System.out.println(media);
    }
return null;
}
public Book searchBook(String title) {
    for (Media media : mediaList) {
        if (media instanceof Book && media.getTitle().equals(title)) {
            return (Book) media;
        }
    }
    return null;
}
}
