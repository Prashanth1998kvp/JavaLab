import org.eclipse.californium.core.CoapClient;

public class Client {
	public static void main(String[] args) {
		CoapClient cc = new CoapClient("Coap://127.0.0.1/hey");
		String txt;
		
		try {
			for(int i=0;i<=10;i++) {
				txt=cc.get().getResponseText();
				System.out.println("temp"+txt);
			}
		
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
	}
	

}
