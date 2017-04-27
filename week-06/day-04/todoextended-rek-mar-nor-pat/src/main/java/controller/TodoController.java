package controller;

import datasource.DataAccessObject;
import datasource.RunOptionDataAccessObject;
import datasource.TodoDataAccessObject;
import entity.RunOption;
import entity.Todo;
import entity.TodoFactory;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

public class TodoController {

  DataAccessObject<Todo> todoDao;
  DataAccessObject<RunOption> runOptionDao;

  public TodoController() {
    todoDao = new TodoDataAccessObject("tododata.csv");
    runOptionDao = new RunOptionDataAccessObject("basicinfo.csv");
  }

  public void listAllTodos() {
    List<Todo> todoList = todoDao.loadAll();
    for (Todo todo : todoList) {
      System.out.println(todo);
    }
  }

  public void addTodo(String todoText) {
    List<Todo> todoList = todoDao.loadAll();
    String[] todoStringArray = new String[4];
    todoStringArray[0] = String.valueOf(666);
    todoStringArray[1] = ZonedDateTime.now().toString();
    todoStringArray[2] = null;
    todoStringArray[3] = todoText;

    todoList.add(TodoFactory.createTodo(todoStringArray));
    todoDao.saveAll(todoList);
  }

  public void removeTodo(long todoId) {
    List<Todo> loadedTodoList = todoDao.loadAll();
    List<Todo> todoListToSave = new ArrayList<>();
    for (Todo todoEntity : loadedTodoList) {
      if (todoEntity.getTodoId() != todoId) {
        todoListToSave.add(todoEntity);
      }
    }
    todoDao.saveAll(todoListToSave);
  }

  public void setTodoCompleted(long todoId) {
    List<Todo> loadedTodoList = todoDao.loadAll();
    List<Todo> todoListToSave = new ArrayList<>();
    for (Todo todoEntity : loadedTodoList) {
      if (todoEntity.getTodoId() == todoId) {
        String[] changedTodoStringArray = new String[4];
        changedTodoStringArray[0] = String.valueOf(todoEntity.getTodoId());
        changedTodoStringArray[1] = todoEntity.getCreatedAt().toString();
        changedTodoStringArray[2] = ZonedDateTime.now().toString();
        changedTodoStringArray[3] = todoEntity.getTodoText();

        todoListToSave.add(TodoFactory.createTodo(changedTodoStringArray));
      } else {
        todoListToSave.add(todoEntity);
      }
    }
    todoDao.saveAll(todoListToSave);
  }

  public void changeTodoText(long todoId, String todoText) {
    List<Todo> loadedTodoList = todoDao.loadAll();
    List<Todo> todoListToSave = new ArrayList<>();
    for (Todo todoEntity : loadedTodoList) {
      if (todoEntity.getTodoId() == todoId) {
        String[] changedTodoStringArray = new String[4];
        changedTodoStringArray[0] = String.valueOf(todoEntity.getTodoId());
        changedTodoStringArray[1] = todoEntity.getCreatedAt().toString();
        changedTodoStringArray[2] = (todoEntity.isCompleted())
                ? todoEntity.getCreatedAt().toString()
                : null;
        changedTodoStringArray[3] = todoText;

        todoListToSave.add(TodoFactory.createTodo(changedTodoStringArray));
      } else {
        todoListToSave.add(todoEntity);
      }
    }
    todoDao.saveAll(todoListToSave);
  }

  public void printUsageInfo() {
    List<RunOption> runOptionList = runOptionDao.loadAll();
    for (RunOption runOption : runOptionList) {
      System.out.println(runOption);
    }
  }
}
