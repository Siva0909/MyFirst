import java.util.UUID;

/**
 * Created by sivan on 27/04/2018.
 */

public class Crime {
    private UUID mID;
    private String mTitle;

    public Crime(){
        mID=UUID.randomUUID();
    }

     public UUID getID(){
         return mID;
     }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String title){
        mTitle=title;
    }
}
