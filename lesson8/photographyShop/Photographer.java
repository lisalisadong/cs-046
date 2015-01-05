package photographyShop;

// TO-DO
// What methods do you want a photographer object to be 
// able to carry out? 
// This class currently has some logic for finding file names for
// photos given a description. You should use the takePicture method. 
// You don't need to understand how readPhotos works. 
// You do need to know that the two lines in the constructor must stay in 
// the constructor or the takePicture method won't work. 

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.File;
import java.io.FileNotFoundException;

public class Photographer
{
    private Map<String, String> photos;
    private String name;
    
    public Photographer(String name)
    {
        photos = new HashMap(); // An important line. Must go in the constructor.
        readPhotos(); // A very important line. this must go in the Photographer
        // constructor so that the photographer will be able to take Pictures. 
        this.name = name;
    }
        
    /**
     * A helper method you will need to use. 
     * 
     * @param description the description of the desired photo.
     * @return the name of a file with a photo matching the description.
     */
    private String takePicture(String description)
    {
        return photos.get(description);
    }
    
    /**
     * Don't look too hard at this method. this is how the photographer will
     * be able to return a photo file name given a description. There is a 
     * secret index in photos.txt that is read by this method. Ideally, this 
     * method would involve a photographer going out and taking a picture and
     * putting it in the system. That would take a lot of time though, so instead
     * the photos are already included. 
     */
    private void readPhotos()
    {
        Pattern commentPattern = Pattern.compile("^//.*");
        Pattern photoPattern = Pattern.compile("([a-zA-Z0-9\\.]+) (.*)");
        try
        {
            Scanner in = new Scanner(new File("./lesson8/photographyShop/photos.txt"));
            
            while (in.hasNextLine())
            {
                String line = in.nextLine();

                Matcher commentMatcher = commentPattern.matcher(line);
                Matcher photoMatcher = photoPattern.matcher(line);
                if (commentMatcher.find())
                {
                    // This line of the file is a comment. Ignore it.
                }
                else if (photoMatcher.find())
                {
                    String fileName = photoMatcher.group(1);
                    String description = photoMatcher.group(2);
                    photos.put(description, fileName);
                }
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e);
        }
    }
    
    public FinishedPhoto doAssignment(Assignment assignment)
    {
    	return new FinishedPhoto(takePicture(assignment.getDescription()), this.name);
    }
}