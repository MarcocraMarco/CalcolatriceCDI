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
    @Produces({"text/plain"})
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
    @Produces({"text/plain"})
    @Path("/subtraction")

    public Response getSubtraction(@QueryParam("firstNumber") int firstNumber, @QueryParam("secondNumber") int secondNumber) {
        return Response.ok(calculator.subtraction(firstNumber, secondNumber)).build();

    }

    @GET
    @Produces({"text/plain"})
    @Path("/division")
    public Response getDivision(@QueryParam("firstNumber") int firstNumber, @QueryParam("secondNumber") int secondNumber) {
        return Response.ok(calculator.division(firstNumber, secondNumber)).build();

    }

    @GET
    @Produces({"text/plain"})
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