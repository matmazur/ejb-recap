package servlet;

import dao.TaskDAORemote;
import model.Task;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("")
public class TaskServlet extends HttpServlet {


    @Inject
    TaskDAORemote dao;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List tasks = dao.findAll();

        req.setAttribute("tasks", tasks);
        req.getRequestDispatcher("index.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("taskName");
        String desc = req.getParameter("taskDesc");

        if (!(name.trim().isEmpty() || desc.trim().isEmpty())) {
            Task task = new Task();
            task.setDescription(desc);
            task.setName(name);

            dao.create(task);
        }
        resp.sendRedirect(req.getContextPath());

    }
}
