import java.util.List;

public interface TaskDAO {

    public Long create (Task task);
    public Task read (Long id);
    public void update (Task task);
    public Long delete(Long id);
    public List<Task> findAll();
}
