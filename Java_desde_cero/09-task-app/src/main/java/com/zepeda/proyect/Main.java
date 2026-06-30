package com.zepeda.proyect;

import com.zepeda.proyect.task.controller.TaskController;
import com.zepeda.proyect.task.model.TaskRepository;
import com.zepeda.proyect.task.view.TaskView;

public class Main {
    public static void main(String[] args) {

        TaskRepository repository = new TaskRepository();
        TaskController controller = new TaskController(repository);
        TaskView view = new TaskView(controller);

        view.showMenu();
    }
}