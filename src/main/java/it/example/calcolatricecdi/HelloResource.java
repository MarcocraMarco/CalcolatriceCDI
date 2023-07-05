package it.example.calcolatricecdi;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/hello-world")
public class HelloResource {
    @Inject
    Calculator calculator;


    @GET
    @Produces({"application/xml", "application/json"})
    @Path("/sum")
    public Response getSum(@QueryParam("firstNumber") int firstNumber, @QueryParam("secondNumber") int secondNumber) {
        return Response.ok(calculator.sum(firstNumber, secondNumber)).build();

    }
    @GET
    @Produces("text/plain")
    @Path("/saluta")
    public String getGreeting() {
        return "HEllo";

    }

    @GET
    @Produces({"application/xml", "application/json"})
    @Path("/subtraction")

    public Response getSubtraction(@QueryParam("firstNumber") int firstNumber, @QueryParam("secondNumber") int secondNumber) {
        return Response.ok(calculator.subtraction(firstNumber, secondNumber)).build();

    }

    @GET
    @Produces({"application/xml", "application/json"})
    @Path("/division")
    public Response getDivision(@QueryParam("firstNumber") int firstNumber, @QueryParam("secondNumber") int secondNumber) {
        return Response.ok(calculator.division(firstNumber, secondNumber)).build();

    }

    @GET
    @Produces({"application/xml", "application/json"})
    @Path("/product")
    public Response getProduct(@QueryParam("firstNumber") int firstNumber, @QueryParam("secondNumber") int secondNumber) {
        return Response.ok(calculator.product(firstNumber, secondNumber)).build();

    }
    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello, World!";
    }
}