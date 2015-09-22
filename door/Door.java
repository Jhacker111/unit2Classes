public class Door
{
    private boolean isLocked;
    private boolean isOpened;
    
    public Door()
    {
        this.isLocked = false;
        this.isOpened = false;
    }
    
    public Door(boolean locked, boolean opened)
    {
        this.isLocked = locked;
        this.isOpened = opened;
    }
    public void lock()
    {