package dao;

import model.Task;

import javax.ejb.Remote;
import java.util.List;

@Remote
public interface TaskDAORemote {

    public Long create(String task);

    public List<String> findAll();

    public void closeSession();
}
