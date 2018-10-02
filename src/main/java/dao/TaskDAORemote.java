package dao;

import javax.ejb.Remote;
import java.util.List;

@Remote
public interface TaskDAORemote {

    public void create(String task);

    public List<String> findAll();

    public void closeSession();
}
