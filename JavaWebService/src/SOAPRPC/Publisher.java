package SOAPRPC;
import javax.xml.ws.Endpoint; 

public class Publisher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endpoint.publish("http://localhost:7779/ws/hello2",new HelloWorldImpl());
		
		
///
	}

}
