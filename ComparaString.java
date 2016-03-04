public class ComparaString{
  public static void main(String[] args){
      if (args[0].equals(args[1])){
        System.out.println("Os parâmetros passados são iguais: " + args[1]);
      }else {
        System.out.println("Os parâmetros passados são diferentes. O primeiro parâmetro foi: " + args[0] + ", o segundo parâmetro foi: " + args[1]);
      }
  }
}
