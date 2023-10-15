package org.knowm.xchange.binance;

import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("")
@Produces(MediaType.APPLICATION_JSON)
public interface BinanceOptionAuthenticated extends BinanceOption {

}