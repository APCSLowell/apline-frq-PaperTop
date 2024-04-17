public class APLine
{
  /* your code here */
  private double a, b, c;
  public APLine(double x, double y, double z){
    a = x;
    b = y;
    c = z;
  }
  public double getSlope(){
    return (double)-a/b;
  }
  public boolean isOnLine(int x, int y){
    return (a*x)+(b*y)+c == 0;
  }
}
