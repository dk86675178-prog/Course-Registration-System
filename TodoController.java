package TodoCRUDApiDB.CrudAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todoclass")
@CrossOrigin("*")
public class TodoController {
    @Autowired
    TodoService todoService;
    @GetMapping("/getAll")
    public List<Studentclass> getAll(){
        return todoService.getAlltodos();
    }

    @GetMapping("/getdata/{rno}")
    public Studentclass gettodoclassByrno(@PathVariable Long rno) {
        return todoService.gettodoclassByrno(rno);
    }

    @PostMapping("/add")
    public String addtodo(@RequestBody Studentclass studentclass){
        todoService.addtodo(studentclass);
        return "Adding a new Student";
    }
    @PutMapping("/classupdate")
    public String updateclass(@RequestBody Studentclass studentclass){
        todoService.updateclass(studentclass);
        return "Todoclass updated";
    }
    @DeleteMapping("/deletetodo/{rno}")
    public String deletetodoclass(@PathVariable Long rno) {
        todoService.deletetodclass(rno);
        return "Deleted successfully";
    }

    @DeleteMapping("/deleteAll")
    public String deleteAll(){

         todoService.deleteclass();
        return "delete all ";
    }

}
