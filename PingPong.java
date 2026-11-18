import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;  


public class PingPong {


       // Instance Variables
       Font fontPayout;
       Color blue, yellow;
       int y, y2;


      // Constructor
      public PingPong() {
        //Example: Initialize/instantiate instance variables
        fontPayout = new Font("Arial", Font.BOLD, 20); //20 is font size. 
        blue = new Color(0, 0, 255);
        yellow = new Color(255, 255, 0);


      }

      


      // Example: Draw a payout table. 
      

      /* Draw the machine (this can be just a box or you can import an image) with the 3 numbers, current balance, 
         and calls drawPayOut() */
        public void drawPaddle(Graphics g) {
        g.fillRect(50, 50+y, 15, 100);
        g.fillRect(750, 50+y2, 15,100);
    }

    public void moveUp(int i) {
        if (i == 1) {
            if (y > -50) {
                y-=5;
		}
        } else if (i == 2) { //differentiates movement between the respective paddles
            if (y2 > -50) {
                y2-=5;
		}
        }
	}

    public void moveDown(int j) {
        if (j == 1) {
            if(y+150 < 600) {
		   y+=5;
		}
        } else if (j  ==2) {
            if(y2+150 < 600) {
		   y2+=5;
		}

        }
		
	}




      /* Generate 3 new random numbers for num1, num2 and num3.  Calculate the winnings.  Updates the balance and 
         winnings. */
      public void play(){
      }  




      // Return true if balance > 0. Return false otherwise.
      public boolean keepPlaying() {
        return true;
      } 


}
