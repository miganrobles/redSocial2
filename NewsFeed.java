import java.util.ArrayList;

/**
 * Write a description of class NewsFeed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NewsFeed
{
    private ArrayList<MessagePost> messages;
    private ArrayList<PhotoPost> photos;
    private ArrayList<JoinGroupPost> grupoPosts;

    /**
     * Constructor for objects of class NewsFeed
     */
    public NewsFeed()
    {
        messages = new ArrayList<>();
        photos = new ArrayList<>();
        grupoPosts = new ArrayList<>();
        
    }

    /**
     * Add a post with a message
     * 
     * @message the message to introduce
     */
    public void addMessagePost(MessagePost message)
    {
        messages.add(message);
    }

    /**
     * Add a post with a image
     * 
     * @message the image to introduce
     */
    public void addPhotoPost(PhotoPost photo)
    {
        photos.add(photo);
    }
    
    /**
     * Add a post with a message
     * 
     * @message the message to introduce
     */
    public void addGrupoPost(JoinGroupPost grupoPost)
    {
        grupoPosts.add(grupoPost);
    }
    
    /**
     * Show the post
     */
    public void show(){
        for(MessagePost message : messages){
            message.display();
        }
        for(PhotoPost photo : photos){
            photo.display();
        }
        for(JoinGroupPost grupoPost : grupoPosts){
            grupoPost.display();
        }
    }
}