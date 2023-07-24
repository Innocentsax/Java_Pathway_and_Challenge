import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class HttpSun {

    public static void main(String[] args) throws IOException {
        InetSocketAddress inetSocketAddress = new InetSocketAddress(8083);
        HttpServer server =  HttpServer.create(inetSocketAddress,0);
        server.createContext("/", new HandlerHttp());
        server.start();
    }

    static class HandlerHttp implements HttpHandler {
        @Override
        public void handle(HttpExchange httpExchange) throws IOException {
            String response = (
                    "<h1>"+
                    "Welcome to HomePage"+
                    "</h1>"+
                    "<main>" +
                    "<h2>"+
                    "Network Socket communication." +
                    "</h2>" +
                    "<img alt='"+
                    "diagram illustrating socket communication'" +
                    "src='" +
                    "https://www.cs.dartmouth.edu/~campbell/cs50/wan.jpg'>"
                    +"</main>");
            if (httpExchange.getRequestURI().getPath().equals("/")) {
                httpExchange.sendResponseHeaders(200, response.length());
                OutputStream outputStream = httpExchange.getResponseBody();
                outputStream.write(response.getBytes("UTF-8"));
                outputStream.close();
            }
        }
    }

}
