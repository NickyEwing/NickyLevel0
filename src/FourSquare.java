// Copyright Wintriss Technical Schools 2013

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class FourSquare {
	public static void main(String[] args) {
		// 3. Make the tortoise move as fast as possible
		Tortoise.setSpeed(7);
		// 4. Set the pen width to 5
		Tortoise.setPenWidth(5);
		// 5. Do steps #6 and #7 four times...
			
			// 6. Change the color of the line the Tortoise draws to a random color 
		for (int i=0; i<6; i++) 
		{
			Tortoise.setPenColor(Colors.getRandomColor());
	
			// 1. Call the drawSquare() method
			drawSquare();
			// 7. Turn the tortoise 90 degrees to the right
			
			Tortoise.turn(300);
	}	
	}
	
	
	
	/* 2. Fill in the code to draw a square inside the method below. */
	static void drawSquare() {
		//JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		
		Tortoise.move(100);Tortoise.turn(90);
		Tortoise.move(100);Tortoise.turn(90);
		Tortoise.move(100);Tortoise.turn(90);
		Tortoise.move(100);Tortoise.turn(90);
	}
}



