
/**
 * Write a description of class JoinGroupPost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JoinGroupPost extends Post
{
    private String group;

    /**
     * Constructor for objects of class JoinGroupPost
     */
    public JoinGroupPost(String author, String group)
    {
        super(author);
        this.group = group;
    }

    /**
     * Meotdo que devuelve el nombre del grupo
     */
    public String getGroup(){
        return group;
    }
}
