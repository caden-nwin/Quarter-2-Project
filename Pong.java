import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;  


public class Pong { // testing github


       // Instance Variables
    Font fontPayout;
    Color blue, yellow;
    int y, y2, ballX, ballY, realPY2, realPY, realCX, realCY;
    boolean play = true;
    int xMovement = -4;
    int yMovement = -4;



      // Constructor
      public Pong() {
        //Example: Initialize/instantiate instance variables
        fontPayout = new Font("Arial", Font.BOLD, 20); //20 is font size. 
        blue = new Color(0, 0, 255);
        yellow = new Color(255, 255, 0); //testing

      }

      


      
      


      // Example: Draw a score table. 

      public void drawScore() {

      }
      

      /* Draw the machine (this can be just a box or you can import an image) with the 3 numbers, current balance, 
         and calls drawPayOut() */
    public void drawPaddle(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(50, 50+y, 15, 100);
        g.fillRect(750, 50+y2, 15,100);

        realPY = 50+y;
        realPY2 = 50+y2;
        
    }

   

    public void drawBall(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillOval(400+ballX,300+ballY,50,50);

        realCX = 400+ballX;
        realCY = 300+ballY;
        
    }

    /*  realPY = 50+y;
        realPY2 = 50+y2;
        */
    public void drawBackground(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0,0,800,600);
    }

    public void ballMovement() {
        
        ballX += xMovement;
        ballY += yMovement;

        if (ballY <= -300) {

        yMovement = 4;

        } else if (ballY >= 250) {

        yMovement = -4;

        }

        if (realCX >= 0 && realCX <= 800) {

            if (realCX <= 75 && realCY > realPY-50 && realCY < realPY+50) {
            xMovement = 4;

        } else if (realCX >= 700 && realCY > realPY2-50 && realCY < realPY2+50) {
            xMovement = -4;
        }

        }


        

        

        
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




      // Return true if balance > 0. Return false otherwise.
     

}
