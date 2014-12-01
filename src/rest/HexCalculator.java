package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import model.ParseadorCalculadora;

@Path("/calcule")
public class HexCalculator {

	@GET
	@Produces("text/plain")
	public String calcule(@QueryParam("numero1") String numero1,
						  @QueryParam("operador") String operador,
					  	  @QueryParam("numero2") String numero2){
		
		
		ParseadorCalculadora parser = new ParseadorCalculadora();
		
		String[] input = {numero1, operador, numero2};

		String[] output = parser.expToRPN(input);
		String retorno = parser.RPNtoDouble( output );
		
		return retorno;
		
	}
}
