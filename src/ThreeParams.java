/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nerea
 */

public class ThreeParams extends HttpServlet {
   public void doGet (HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException {
        response.setContentType("/text/html");
        PrintWriter out = response.getWriter();
        String docType = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\n";
        String title = "Welcome";
        out.println ("<LIX<B>param3</B>: ");
        out.println(
                "<HTML>\n" +
                        "<HEADX<TITLE>"+title + "</TITLE></HEAD>\n" + title + "</H1>\n <UL>\n <LIX<B>param1/B>:"
                +request.getParameter ("param1") + "\n" +
                        "<LIX<B>param2</B>: "
                +request.getParameter ("param2") + "\n"
                +request.getParameter ("param3") + "\n" +
                 "</UL>\n" +
                 "</BODY</HTML>");

    }
}
