public class Palindrome {
  public static void main(String[] args){
    int p;
    int q;
    q=0;
    p=0;
    String w=args[0].substring(0,5);
    for (int i=p; i<5; i++){
      for (int j=q; j>0; j--){
        if((w[i]).equals(w[j])){
          System.out.println("ok");
        }else{
          this.p=p++;
          this.q=q++;
        }
      }
    }
    
    System.out.println("Conforme o parâmetro passado o palíndrome encontrado foi: " + w);
  }
}
