package photographyShop;

// Optional
// Does your design use FinishedPhoto objects?
// If so, fill in this class with your code. 

public class FinishedPhoto
{
	private String photoName;
	private String authorName;
	
	public FinishedPhoto(String photoName, String authorName)
	{
		this.photoName = photoName;
		this.authorName = authorName;
	}
	
	public String getPhoto()
	{
		return photoName;
	}
	
	public String getAuthor()
	{
		return authorName;
	}
}