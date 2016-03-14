public class teste {
  public static void main(String[] args){
    int fim =0;
    while( fim != 5){
      int b = args[0].length();
      System.out.println("Número de caracteres passados: " + b);
      int p=0;
      int q=p+4;
      String w[];
      w = new String[5];
      w[0]=args[0].substring(p,p);
      w[1]=args[0].substring(p+1,p+1);
      w[2]=args[0].substring(p+2,p+2);
      w[3]=args[0].substring(p+3,p+3);
      w[4]=args[0].substring(q,q);
      int j=4;
      for (int i=0; i<b; i++){
        if((w[i]).equals(w[j])){
          System.out.println(i + "=" + j + w[0]);
          j--;
          fim++;
        }else{
          j++;
        }
      }  
    }
  }
}
