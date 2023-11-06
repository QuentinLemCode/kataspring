package com.kataspring;

import com.kataspring.todo.Todo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoListController {

    private static final List<Todo> todos = new ArrayList<>();

    @GetMapping("todo")
    public List<Todo> getTodos() {
        return TodoListController.todos;
    }

    @PostMapping("todo")
    public Todo createTodo(@RequestBody Todo todo) {
        TodoListController.todos.add(todo);
        return todo;
    }

    @DeleteMapping("todo/{id}")
    public void deleteTodo(@PathVariable int id) {
        TodoListController.todos.remove(id);
    }

}
