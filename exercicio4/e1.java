class Ponto2D {
  private double x;
  private double y;
  
  public Ponto2D(double x, double y){
    this.x=x;
    this.y=y;
  }
  
  public double getX(){
    return x;
  }

  public void setX(double x){
    this.x=x;
  }
}

public class e1 {
  public static void main(String[] args) {
    Ponto2D p1 = new Ponto2D(2.0, 2.0);
    Ponto2D p2 = new Ponto2D(3.0, 3.0);
    p2 = p1;
    p1.setX(4.0);
    System.out.println(p2.getX());
  }
}
