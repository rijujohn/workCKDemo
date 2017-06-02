package SOAPRPC;

import javax.jws.WebService;


//Implementation
@WebService(endpointInterface="SOAPRPC.HelloWorld")

public class HelloWorldImpl implements HelloWorld
{
	


@Override
public String getHelloWorldAsString(String name) {
	// TODO Auto-generated method stub
	return "My name is Riju John. Hello Java -WS"+name;
	}

@Override
public String getHelloWorldAdd(int i,int j) {
	// TODO Auto-generated method stub
	return "The Sum is"+ (i+j);
	}

}