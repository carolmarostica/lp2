public class Mod {
  private int valor;
  public Mod(int valor){
    this.valor = valor;
  }
  public int setValor(int valor){
    this.valor = valor;
  }
  public int getValor(int valor){
    return valor;
  }
  public static void main(String[] args){
    Mod m1= new Mod(1);
    Mod m2 = m1;
    m2.setValor(2);
    System.out.println(m1.getValor());
  }
}
