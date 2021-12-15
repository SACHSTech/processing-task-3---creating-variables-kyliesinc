import processing.core.PApplet;

public class Sketch extends PApplet {
  public float petalX = random(0, width);
  public float petalY = random(0, height);
  public float petalSize = random(25, 150);
  public float petalDistance = petalSize / 1.5f;
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
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
    //flower stem
    fill(75, 245, 66);
    rect(petalX, petalY, petalSize/10, petalSize*2);

    //flower petal white
    fill(255, 255, 255);

    ellipse (petalX + petalDistance, petalY, petalSize, petalSize);

    ellipse (petalX - petalDistance, petalY, petalSize, petalSize);

    ellipse(petalX, petalY + petalDistance, petalSize, petalSize);

    ellipse(petalX, petalY - petalDistance, petalSize,petalSize);

    // yellow center of flower
    fill(255, 241, 51);
    ellipse (petalX, petalY, petalSize, petalSize);
  }  
}