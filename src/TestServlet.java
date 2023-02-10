
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nerea
 */
public class TestServlet extends HttpServlet {
    
 @Override
 public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    response.setContentType("/text/html");
    PrintWriter out = response.getWriter();
    String docType = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\n";
    out.println(docType +
        "<html>\n" +
        " <head><title>Test Servlet</title></head>\n" +
        "<body bgcolor=\"#FDF5E7\">\n" +
        " <center><h3>Test servlet </h3>\n" +
        //"<img src=\""+imagePath+"\">\n" +
        "<UL>\n"+
           "<LI><B>Name Client </B>:"+
                request.getParameter("param1")+"\n"+
            "<LI><B>Surname Client </B>:"+
                request.getParameter("param2")+"\n"+
            "<LI><B>Age Client </B>:"+
                request.getParameter("param3")+"\n"+
        "</UL>\n"+       
        "<center></body></html>");
 }
}
