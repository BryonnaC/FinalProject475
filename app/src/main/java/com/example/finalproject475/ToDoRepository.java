package com.example.finalproject475;

import android.content.Context;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.List;

public class ToDoRepository {

    private static ToDoRepository instance;
    private List<ToDo> mToDos;

/*    public static ToDoRepository getInstance(Context context) {
        if (instance == null) {
            instance = new ToDoRepository(context);
        }
        return instance;
    }*/

/*    private ToDoRepository(Context context) {
        mToDos = new ArrayList<>();
        Resources res = context.getResources();
        String[] todos = res.getStringArray(R.array.todos);
        String[] descriptions = res.getStringArray(R.array.descriptions);
        for (int i = 0; i < todos.length; i++) {
            mToDos.add(new ToDo(i + 1, todos[i], descriptions[i]));
        }
    }*/

    public List<ToDo> getBands() {
        return mToDos;
    }

    public ToDo getToDo(int todoId) {
        for (ToDo todo : mToDos) {
            if (todo.getId() == todoId) {
                return todo;
            }
        }
        return null;
    }
}
