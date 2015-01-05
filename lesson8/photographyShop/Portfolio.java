package photographyShop;

import java.util.ArrayList;
import predefined.Picture;
import predefined.Text;

// Do you need a Portfolio object to simulate 
// the photography shop? 
// Write a class Portfolio if you need a portfolio
// to implement your design. 

public class Portfolio
{
	private ArrayList<FinishedPhoto> finished;
	
	public Portfolio(ArrayList<FinishedPhoto> finished)
	{
		this.finished = finished;
	}
	
	public void show()
	{
		int leftTop = 0;
		
		for (FinishedPhoto photo : finished)
		{
			Picture picture = new Picture("./predefined/pic/" + photo.getPhoto());
			picture.translate(leftTop, 0);
			picture.draw();
			int leftBottom = picture.getMaxY();
			Text name = new Text(leftTop, leftBottom, photo.getAuthor());
			name.draw();
			leftTop = picture.getMaxX();
		}		
	}
}