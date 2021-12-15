import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(600, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(80, 179, 250);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// draw stem for the flower
  stroke(100);
  fill(21, 250, 0);
  rect(width/2, height/2, width/120, height/2);
  
  // draw white flower petals with circles
  stroke(100);
  fill(255, 255, 255); // red
  ellipse(width/2.857f, height/2, width/6, height/6);
  
  stroke(100);
  fill(255, 255, 255); //orange
  ellipse(width/2.308f, height/1.622f, width/6, height/6);
  
  stroke(100);
  fill(255, 255, 255); //green
  ellipse(width/1.714f, height/1.621f, width/6, height/6);
  
  stroke(100);
  fill(255, 255, 255); //blue
  ellipse(width/1.538f, height/2, width/6, height/6);
  
  stroke(100);
  fill(255, 255, 255); //pink
  ellipse(width/1.714f, height/2.609f, width/6, height/6);
 
  stroke(100);
  fill(255, 255, 255); //white
  ellipse(width/2.308f, height/2.609f, width/6, height/6);
  
  // yellow center of the flower 
  stroke(100);
  fill(255, 241, 51);
  ellipse(width/2, height/2, width/6, height/6);
  
  }  
}