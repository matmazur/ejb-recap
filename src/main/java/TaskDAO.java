import java.util.List;

public interface TaskDAO {

    public Long create (Task task);
    public Task read (Long id);
    public void update (Task task);
    public void delete(Long id);
    public List findAll();
}
