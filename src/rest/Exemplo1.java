package rest;

//http://localhost:8080/prjRest1/rest1?word=vasco

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/rest1")
public class Exemplo1 {
	
	@GET
	@Produces("text/plain")
	public String echo(@QueryParam("word") String palavra)
	{
		return "echo: " + palavra;
	}

}
