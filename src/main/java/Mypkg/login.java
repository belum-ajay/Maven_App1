package Mypkg;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class login extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       resp.setContentType("text/html");
       PrintWriter pw=resp.getWriter();
       String un=req.getParameter("un");
       String psw=req.getParameter("psw");
       if(un.equals("ajay") && psw.equals("ajju")){
           pw.print("<div align='center'>");
           pw.print("<h1>Hey ajay..! Logged in successfully...!!!</h1>");
           pw.print("</div>");
       }
       else{
           RequestDispatcher rd=req.getRequestDispatcher("index.html");
           rd.include(req, resp);
           pw.print("<div align='center'>");
           pw.print("<h1>Sorry..!! Incorrect username or password...!</h1>");
           pw.print("</div>");
       }
    }
   
}
