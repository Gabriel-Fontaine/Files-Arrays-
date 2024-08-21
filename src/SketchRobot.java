import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

public class SketchRobot extends RobotSE{

	
	/**
	 * 
	 * 
	 * @param mC
	 * @param i
	 * @param j
	 * @param south
	 */
	
	public SketchRobot(City mC, int i, int j, Direction south) {
		super(mC, i, j, south);
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * 
	 * sketch is a method which is called to sketch the image on to the screen of the city, through having each of the pixels placed throughout
	 */
	
	public void sketch(){
		
		File f = new File("necron.jpg"); // obtains the image from the file on the computer
		BufferedImage image = tryRead(f); // creates an image file from given image
		
		
		if (image != null){ // ensures that the buffered image method acknowledges the image can be read
			
			
			int h = image.getHeight(); // gets the image height in pixels
			int w = image.getWidth(); // gets the image width in pixels
			
			Color imageMatrix[][] = new Color[w][h]; // will be used to store the colours of each pixel
			
			
			// Note: using h and w, create a nested for loop to access every pixel (x, y) in the image
			for (int imageHeightPos = 0; imageHeightPos < h; imageHeightPos += 1){ // assigns the pixel colour to each particular pixel corresponded to the location of the image
				for (int imageWidthPos = 0; imageWidthPos < w; imageWidthPos += 1){
					imageMatrix[imageWidthPos][imageHeightPos] = new Color(image.getRGB(imageWidthPos, imageHeightPos), true); // x, y of pixel, true is to preserve transparency
					
					Thing t = new Thing(getCity(), imageHeightPos, imageWidthPos); // the height and width must be swapped here to have the image turn 90 degrees from how it would initially display lengthwise
					t.setColor(new Color(image.getRGB(imageWidthPos, imageHeightPos), true)); // creates a thing at the designated location corresponding to the colour specified at this location of the image
				}
			
				
			}
		
			
			// sketches the drawing now that it has allocated all of its knowledge of the pixels' colours and locations
		
			
			
			
			
		}
		
		
	}
	
	
	
	// File Handling Method
	
	
	/**
	* Initializes image file path for BufferedImage.
	* @param f2 - image path
	* @return image reference to file if it exists or null if image cannot be rendered.
	*/
	
	public static BufferedImage tryRead(File f2) {
		try {
			BufferedImage imageRef = ImageIO.read(f2); // checks to see if the image can be read using the ImageIO reader
			return imageRef; // returns the fact that the image can be read
		} catch (Exception e) { // checks to see if there is no file at all, in which if there is no file present it will return a null value which simply just prevents an error from occurring throughout the code
			return null; // image reference cannot be created
		}
	}

	
	
	
	
	
	
	
	
	

}


