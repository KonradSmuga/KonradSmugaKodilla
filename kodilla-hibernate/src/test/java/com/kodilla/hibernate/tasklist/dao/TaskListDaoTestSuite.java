package com.kodilla.hibernate.tasklist.dao;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest


public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;


    @Test
    public void testFindByListName() {

        TaskList taskList = new TaskList("music List", "List about music");
        taskListDao.save(taskList);
        String name = taskList.getListName();

        //When
        List<TaskList> readTasks = taskListDao.findByListName(name);

        Assert.assertEquals(1, readTasks.size());

        //CleanUp
        int id = readTasks.get(0).getId();
        taskListDao.delete(id);

    }


    @Test
    public void  testTaskListDaoSave() {

        //Given
        TaskList taskList = new TaskList("music List", "List about music");

        //When
        taskListDao.save(taskList);

        //Then
        int id = taskList.getId();
        TaskList readTask = taskListDao.findOne(id);
        Assert.assertEquals(id, readTask.getId());

        //CleanUp
        taskListDao.delete(id);
    }
}
