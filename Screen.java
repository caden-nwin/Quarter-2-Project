import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;


import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;


public class Screen extends JPanel implements KeyListener {




	// instance variables
        


	// Initialization Constructor
    Pong p = new Pong();


	public Screen() {
             setFocusable(true);
             setLayout(null);


             // Set up KeyListening. requestFocusInWindow() directs focus to the current (this) JPanel
             this.requestFocusInWindow();
             this.addKeyListener(this);
	    
            // instantiate/initialize objects
            


	}

    


    //set the size of the JPanel container
	@Override
	public Dimension getPreferredSize(){
	    return new Dimension(800,600);
	}
	
    // Call the draw methods
	@Override
	public void paintComponent(Graphics g){
	    super.paintComponent(g);
        p.drawBackground(g);
        // Call the draw methods

        p.drawPaddle(g);
        p.drawBall(g);
       


	}

    public void animate() {
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            
            p.ballMovement();
            
            repaint();
        }
   }


        @Override


        public void keyPressed(KeyEvent e){


		//interpret key clicks
		if (e.getKeyCode() == 38){   // up arrow
			p.moveUp(2);
		}

        if (e.getKeyCode() == 87){   // up arrow
			p.moveUp(1);
		}


		//interpret key clicks
		if (e.getKeyCode() == 40){   // down arrow
			p.moveDown(2);
		}

        if (e.getKeyCode() == 83){   // down arrow
			p.moveDown(1);
		}

        repaint();

		
	}
    


    // Required KeyListener interface methods
    @Override public void keyTyped(KeyEvent e) {}
    @Override public void keyReleased(KeyEvent e) {}
	
}

