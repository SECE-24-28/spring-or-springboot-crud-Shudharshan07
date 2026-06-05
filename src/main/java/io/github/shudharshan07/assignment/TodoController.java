package io.github.shudharshan07.assignment;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class TodoController {

    ArrayList<Task> data = new ArrayList<>();
    @GetMapping("/task/{id}")
    public ResponseEntity<Task> getTask(@PathVariable int id) {
        return ResponseEntity.ok(data.get(id));
    }


    @PostMapping("/task")
    public ResponseEntity<Task> addTask(@RequestBody Task task) {
        data.add(task);
        return ResponseEntity.ok(task);
    }

    @DeleteMapping("/task/{id}")
    public ResponseEntity<Task> deleteTask(@PathVariable int id) {
        return ResponseEntity.ok(data.remove(id));
    }

}
