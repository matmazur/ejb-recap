package dao;

import model.Task;

import javax.ejb.Local;
import java.util.List;

@Local
public interface TaskDAOLocal {

    public Long create(Task task);

    public Task read(Long id);

    public void update(Task task);

    public void delete(Long id);

    public List findAll();
}
