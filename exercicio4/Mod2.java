public class Mod2 {
  private int valor;
  public Mod(int valor){
    this.valor = valor;
  }
  public void setValor(int valor){
    this.valor = valor;
  }
  
  public int getValor() {
    return valor;
  }
  
  public static void main(String[] args) {
    Mod m1 = new Mod(1);
    Mod m2 = m1;
    m1=null;
    m2.setValor(2);
    System.out.println(m1.getValor());
  }
}
