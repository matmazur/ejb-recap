package dao;

import javax.annotation.PostConstruct;
import javax.ejb.Remove;
import javax.ejb.Stateful;
import java.util.ArrayList;
import java.util.List;

@Stateful
public class TaskDAOImpl implements TaskDAORemote {

    private List<String> list;

    @PostConstruct
    private void init() {
        list = new ArrayList<>();
    }

    @Override
    public void create(String task) {
        list.add(task);
    }

    @Override
    public List<String> findAll() {
       return list;
    }

    @Remove
    @Override
    public void closeSession() {

    }
}
