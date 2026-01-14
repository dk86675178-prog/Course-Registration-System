package TodoCRUDApiDB.CrudAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    @Autowired
    TodoRepository todorepository;
    public List<Studentclass> getAlltodos(){
        return todorepository.findAll();
    }


    public void addtodo(Studentclass studentclass) {
        todorepository.save(studentclass);
    }

    public Studentclass gettodoclassByrno(Long rno) {
      return todorepository.findById(rno).
              orElse(new Studentclass());
    }

    public void updateclass(Studentclass studentclass) {
        todorepository.save(studentclass);
    }

    public void deletetodclass(Long rno) {
        todorepository.deleteById(rno);
    }

    public void deleteclass() {
        todorepository.deleteAll();
    }
}
