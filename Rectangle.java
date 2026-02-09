// A Rectangle class
public class Rectangle {
  
  // 4 instance attributes
  private double width;
  private double height;
  private double originX = 0.0;
  private double originY = 0.0;

  public double getwidth() {
    return width;
  }

  public void setwidth(double width) {
    if (width >= 0) {
      this.width = width;
    }
  }

  public double getheight() {
    return height;
  }

  public void setheight(double height) {
    this.height = height;
  }

  public double getoriginX() {
    return originX;
  }

  public void setoriginX(double originX) {
    this.originX = originX;
  }
  public double getoriginY() {
    return originY;
  }

  public void setoriginY(double originY) {
    this.originY = originY;
  }


  // 1 static attributes
  public static final int NUMBER_OF_SIDES = 4;

  // main constructor
  public Rectangle(double width, double height, double originX, double originY) {
    this.width = width;
    this.height = height;
    this.originX = originX;
    this.originY = originY;
    }

  public Rectangle(double width, double height) {
    this(width, height, 0, 0);
  }

  public Rectangle() {
    this(1, 1);
  }

  public void scale(double scaleX, double scaleY) {
   this.width = this.width * scaleX;
    this.height = this.height * scaleY;
  }

  public void scale(double factor) {
    this.width = this.width * factor;
    this.height = this.height * factor;
  }
  
  public boolean isOverlappedWith(Rectangle r) {
    if (this.originX + this.width <= r.originX) {
      return false;
    }
    if (r.originX + r.width <= this.originX) {
      return false;
    }
    if (this.originY + this.height <= r.originY) {
      return false;
    }
    if (r.originY + r.height <= this.originY) {
      return false;
    }

    return true;
  }

  public static boolean areOverlapping(Rectangle r1, Rectangle r2) {
    if (r1.originX + r1.width <= r2.originX) {
      return false;
    }
    if (r2.originX + r2.width <= r1.originX) {
      return false;
    }
    if (r1.originY + r1.height <= r2.originY) {
      return false;
    }
    if (r2.originY + r2.height <= r1.originY) {
      return false;
    }

    return true;
  }

  public double calcRatio() {
    return width / height;
  }

  public boolean isSquare() { 
    double epsilon = 1e-10;  // very small tolerance
    if (Math.abs(width - height) < epsilon) {
        return true;  // width and height are close enough to be a square
    } else {
        return false; // not a square
    }
  }



  // method: move the rectangle
  public void move(double dx, double dy) {
    originX += dx;
    originY += dy;
  }

  // method: compute the area of the rectangle
  public double getArea() {
    return width * height;
  }
    
  // method: compute the area of the rectangle
  public double getPerimeter() {
    return 2 * (width + height);
  }
    
}
