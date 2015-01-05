package photographyShop;

// TO-DO 
// Fill in the methods in the manager class so 
// that when the simulation runs, and simulates the
// story, the assignments are assigned to photographers
// in the correct order, and printed out with photographers 
// signatures below them in the order in which they are completed. 
import java.util.ArrayList;

public class Manager
{
    // YOUR CODE HERE
    // What does the manager need to remember to do his/her job?
	private ArrayList<Photographer> photographers;
	private ArrayList<Assignment> assignments;
	private ArrayList<FinishedPhoto> finishedPhotos;
    
    public Manager() 
    {
        // YOUR CODE HERE 
        // How do you need to initialize the instance variables?
    	photographers = new ArrayList<Photographer>();
    	assignments = new ArrayList<Assignment>();
    	finishedPhotos = new ArrayList<FinishedPhoto>();
    }
    
    /**
     * Called when it's time to hire a new photographer. 
     */
    public void hire(String photographer)
    {
        // YOUR CODE HERE
        // How will you keep track of the photographers you have hired? 
    	photographers.add(new Photographer(photographer));
    }
    
    /**
     * Called when it's time for the daily meeting where 
     * the highest priority assignments are given to photographers. 
     * Each photographer can take one assignment. The highest priority
     * assignment should be given out first and the highest priority 
     * assignment should go to the photographer who was hired first. 
     */
    public void giveOutAssignments()
    {
        // YOUR CODE HERE
        // Where did you store the photographers and unfinished assignments?
        // Assign the highest priority assignment first to the 
        // photographer who was hired first, then the next highest priority
        // assignment to the next photographer. 
    	for (Photographer person : photographers)
    	{
    		if (assignments.size() != 0)
    		{
    			finishedPhotos.add(person.doAssignment(assignments.remove(0)));
    		}
    	}
    }
    
    /**
     * A Customer came up with a new assignment. The manager should 
     * add it to the to-do list so that next time it's time to give
     * out assignments, the new assignment will be a possibility.
     */
    public void newAssignment(int priority, String description)
    {
        // YOUR CODE HERE 
        // How will you keep track of the unfinished assignments?
    	Assignment newAssignment = new Assignment(priority, description);
    	int i = 0;
    	while (i < assignments.size() && assignments.get(i).getPriority() >= newAssignment.getPriority())
    	{
    		i ++;
    	}
    	assignments.add(i, newAssignment);
    }
    
    /**
     * It's the end of the story for now. Time to look at all the 
     * work the company has done.
     */
    public void checkPortfolio()
    {
        // YOUR CODE HERE
        // You may need to display all the finished work when 
        // this method is called, or you may have been displaying
        // the photos as you went. If you have already displayed 
        // the photos, there is no need to do anything here. 
    	Portfolio status = new Portfolio(finishedPhotos);
    	status.show();
    }
}