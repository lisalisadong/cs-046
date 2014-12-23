package twitter;

// Bluej project: twitter
//  TODO: Write code for the shorten(String longPost) method.
public class Twitterizer
{
    /**
     * Shortens and returns long posts by removing vowels
     * @param longPost the post whos vowels need to be removed
     * @return a version of the post without vowels
     */
    public String shorten(String longPost)
    {
        // YOUR CODE HERE
    	String shortPost = longPost;
    	for (int i = 0; i < shortPost.length(); i++)
    	{
    		if ("aeiouAEIOU".contains(shortPost.substring(i, i + 1)))
    		{
    			shortPost = shortPost.substring(0, i) + shortPost.substring(i + 1, shortPost.length());
    			i = i - 1;
    		}
    	}
    	return shortPost;
    }
}