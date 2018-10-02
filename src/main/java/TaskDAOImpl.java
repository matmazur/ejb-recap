import javax.ejb.Stateless;
import javax.persistence.*;
import java.util.List;

@Stateless
public class TaskDAOImpl implements TaskDAO {

    @PersistenceContext
    EntityManager entityManager;


    @Override
    public Long create(Task task) {

        entityManager.persist(task);
        return task.getId();
    }

    @Override
    public Task read(Long id) {
        Task newTask = entityManager.find(Task.class, id);
        return newTask;
    }

    @Override
    public void update(Task task) {
        entityManager.merge(task);
    }

    @Override
    public void delete(Long id) {
        entityManager.remove(entityManager.find(Task.class,id));
    }

    @Override
    public List<Task> findAll() {

        TypedQuery<Task> query = entityManager.createNamedQuery("Task.findAll",Task.class);


        return query.getResultList();
    }
}
