// Joseph Sciorilli
// Button Color Changer
float r, g, b;
float counter = 0;
int buttonX = 100;
int buttonY = 100;

void setup()
{
  size(640, 480);
  reset();
  rectMode(CENTER);
}
void reset()
{
  r = random(255);
  g = random(255);
  b = random(255);
}

void draw()
{
  background(r, g, b);
  fill(100, 200, 200);
  rect(buttonX, buttonY, 100, 50 );
  fill(0);
  text("Click", buttonX-12, buttonY );
}

void keyPressed()
{
  if (key == 'q') exit();
  if (key == 'r') reset();
}
void mousePressed() 
{
  if ( hit( mouseX,mouseY, 100, 75, 50, 50) ) 
  {
    counter = counter + 1;
    if (counter % 2 > 0) 
    {
      r=  random(255);
      g=  random(255);
      b=  random(255);
    } 
    else 
    {
      reset();
    }
  }
}

boolean hit( float x1, float y1, float x2, float y2, float w, float h ) 
{
  boolean result;
  if ( abs(x1-x2) < w && abs(y1-y2) < h ) 
  {
    result = true;
  }
  else 
  {
    result = false;
  }

  return result;
}
