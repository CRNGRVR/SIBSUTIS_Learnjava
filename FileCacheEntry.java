public class FileCacheEntry
{
    String content;
    long lastReadTime;
    long lastModifiedTimeAtRead;

    public FileCacheEntry(String content, long lastReadTime,
                          long lastModifiedTimeAtRead)
    {
        this.content = content;
        this.lastReadTime = lastReadTime;
        this.lastModifiedTimeAtRead = lastModifiedTimeAtRead;
    }
}
