package Jersey;
import javax.ws.rs.GET;  
import javax.ws.rs.Path;  
import javax.ws.rs.Produces;  
import javax.ws.rs.core.MediaType;  

@Path("/hello")
public class Hello {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	
	public String sayPlainHello(){
		
		return "Hello Jersey Plain"; 
	}
	
	 // This method is called if XML is requested  
	  @GET  
	  @Produces(MediaType.TEXT_XML)  
	  public String sayXMLHello() {  
	    return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";  
	  }  
	  
	  // This method is called if HTML is requested  
	  @GET  
	  @Produces(MediaType.TEXT_HTML)  
	  public String sayHtmlHello() {  
	    return "<html> " + "<title>" + "Hello Jersey" + "</title>"  
	        + "<body><h1>" + "Hello Jersey HTML" + "</h1></body>" + "</html> ";  
	  }  
	

}
