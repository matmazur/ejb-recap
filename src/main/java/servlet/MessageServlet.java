package servlet;

import jms.MailSender;
import jms.MailService;
import jms.MessageWrapper;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/mail")
public class MessageServlet extends HttpServlet {


    @Inject
    MailService service;


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html; charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");
        req.setCharacterEncoding("UTF-8");


        String recipient = req.getParameter("recipient");
        String message = req.getParameter("message");

        MessageWrapper wrapper = new MessageWrapper(message, recipient);

        service.sendEmail(wrapper);


        resp.sendRedirect("/");

    }
}
