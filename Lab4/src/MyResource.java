import org.eclipse.californium.core.CoapResource;
import org.eclipse.californium.core.CoapServer;
import org.eclipse.californium.core.server.resources.CoapExchange;

public class MyResource extends CoapResource {
	int i=9;
	MyResource(String str) {
		super(str);
	}
	
	@Override
	public void handleGET(CoapExchange exchange) {
		exchange.respond("temp"+i++);
		super.handleGET(exchange);
	}
	
	public static void main(String [] args) {
		CoapServer cs = new CoapServer();
		cs.add(new MyResource("hey"));
		cs.start();
	}
	

}
