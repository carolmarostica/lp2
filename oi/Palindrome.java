public class Palindrome {
  public static void main(String[] args){
    int p;
    int q;
    p=0;
    q=p+4;
    String[] w = new String[q+1];
    w=args[0].substring(p,q);
    for (int i=p; i<5; i++){
      for (int j=q; j>=0; j--){
        if((w[i]).equals(w[j])){
          System.out.println(i+"-"+j +"/");
        }else{
        
        }
      }
    }
    
    System.out.println("Conforme o parâmetro passado o palíndrome encontrado foi: " + w);
  }
}
public static void main(String args[]) {
  int[] idades = new int[10];
  for (int i = 0; i < 10; i++) {
    idades[i] = i * 10;
