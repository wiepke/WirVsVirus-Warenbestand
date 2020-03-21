package View;

import DataObjects.Market;
import DataObjects.MarketInput;
import DataObjects.MarketSearch;

import static java.util.Objects.isNull;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

//@Path("/market")
public class MarketView {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/id/{marketId}")
    public Response addMarketInformation(@PathParam("marketId") int marketId, MarketInput marketInput) {
        Response response =
                Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("error while adding user to chatRoom")
                        .build();

        return response;
    }

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/id/{marketId}")
    public Response getMarketInformation(@PathParam("marketId") int marketId, MarketSearch marketSearch) {
        Response response =
                Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("error while adding user to chatRoom")
                        .build();

        return Response.status(Response.Status.OK).entity(new Market(marketId)).build();
    }
}
