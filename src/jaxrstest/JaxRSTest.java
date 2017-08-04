package jaxrstest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.glassfish.jersey.server.ResourceConfig;


@ApplicationPath("rest")
public class JaxRSTest extends ResourceConfig {

  public JaxRSTest() {
    packages("jaxrstest");
  }

  @Path("hello")
  public static class Hello {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String get() {
      return "get: Hello world from using scp optional include TEXT_PLAIN!";
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getMessage() {
      return "getMessage: Hello world using scp optional include TEXT_HTML!";
    }
  }

}
