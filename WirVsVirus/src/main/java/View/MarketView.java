package View;

import DBCommunication.DAOMarketInfo;
import DBCommunication.DAOProductInfo;
import DataObjects.Market;
import DataObjects.MarketInput;
import DataObjects.MarketSearch;
import DataObjects.Product;

import static java.util.Objects.isNull;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/market")
public class MarketView {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/id/{marketId}")
    public Response addMarketInformation(@PathParam("marketId") int marketId, MarketInput marketInput) {

        return Response.status(Response.Status.OK).entity(new Market(marketId)).build();
    }

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/id/{marketId}")
    public Response getMarketInformation(@PathParam("marketId") int marketId, MarketSearch marketSearch) {

        return Response.status(Response.Status.OK).entity(new Market(marketId)).build();
    }

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/place/ltdtude/{ltdtude}/lngtude/{lngtude}")
    public Response getMarketsCloseBy(@PathParam("ltdtude") float ltdtude,
                                      @PathParam("lngtude") float lngtude,
                                      List<Product> products) {
        if (products.size() == 0){
            //get all markets
        }else{
            //filter markets for products
        }
        List<Market> markets = new ArrayList<>();
        return Response.status(Response.Status.OK).entity(markets).build();
    }

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/products")
    public Response getAllProducts() {
        DAOProductInfo daoproduct = new DAOMarketInfo();
        return Response.status(Response.Status.OK).entity(daoproduct.getAllProducts()).build();
    }
}
