import entity.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

@WebServlet(name = "FirstServlet", urlPatterns = "/someservlet")
public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Product product = new Product();
        for (int i = 0; i < 10; i++) {
            product.setCost(2);
            product.setId(UUID.randomUUID());
            product.setTitle("random title");
        }

        resp.getWriter().printf(product.toString());
    }

}
