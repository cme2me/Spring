import entity.Product;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@WebServlet(name = "ProductsList", urlPatterns = "/products")
public class ProductServlet implements Servlet {
    private transient ServletConfig config;
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.config = servletConfig;
    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.setContentType("text/html");
        List<Product> products = new ArrayList<>();
        Product productEntity = new Product();
        for (int i = 0; i < 10; i++) {
            productEntity.setCost(2);
            productEntity.setId(UUID.randomUUID());
            productEntity.setTitle("random title");
            products.add(productEntity);
        }

        servletResponse.getWriter().println("<html><body>");

        for (Product product : products) {
            servletResponse.getWriter().println("<h4>" +
                    product.toString() + "</h4>");
        }

        servletResponse.getWriter().println("<html><body>");
    }

    @Override
    public String getServletInfo() {
        return "some info";
    }

    @Override
    public void destroy() {

    }
}
