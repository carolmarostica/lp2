public class Palindrome {
  public static void main(String[] args){
    int p=0;
    int q=p+4;
    w=args[0].substring(p,q);
    for (int i=0; i<5; i++){
      for (int j=4; j>=0; j--){
        if((w[i]).equals(w[j])){
          System.out.println(i+"-"+j +"/");
        }else{
        
        }
      }
    }
    System.out.println("Conforme o parâmetro passado o palíndrome encontrado foi: " + w);
  }
}
