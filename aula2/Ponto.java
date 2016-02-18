public class Ponto{
	double latitude;
	double longitude;
	public void imprimirCoordenadas(){
		System.out.println("Latitude: " + this.latitude + "Longitude: " + this.longitude);
	}
	public static void main (String[]args){
		Ponto coordCefet = new Ponto();
		coordCefet.latitude= -21.55;
		coordCefet.longitude= -45.42;
		coordCefet.imprimirCoordenadas();
		System.out.println("Referencia do objeto na memoria: " + coordCefet);	
	}
}
