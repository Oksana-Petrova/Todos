package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TasksTest {

    @Test
    public void shouldMatchSimpleTaskTrue() {
        SimpleTask simpleTask = new SimpleTask(3, "Сходить в магазин");

        boolean expected = true;
        boolean actual = simpleTask.matches("магазин");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMatchSimpleTaskFalse() {
        SimpleTask simpleTask = new SimpleTask(3, "Сходить в магазин");

        boolean expected = false;
        boolean actual = simpleTask.matches("парк");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMatchEpicTrue() {
        String[] subtasks = { "Молоко", "Яйца", "Хлеб" };
        Epic epic = new Epic(55, subtasks);

        boolean expected = true;
        boolean actual = epic.matches("Хлеб");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMatchEpicFalse() {
        String[] subtasks = { "Молоко", "Яйца", "Хлеб" };
        Epic epic = new Epic(55, subtasks);

        boolean expected = false;
        boolean actual = epic.matches("Шоколад");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMatchMeetingTopicTrue() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean expected = true;
        boolean actual = meeting.matches("Выкатка");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMatchMeetingProjectTrue() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean expected = true;
        boolean actual = meeting.matches("Приложение");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMatchMeetingFalse() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean expected = false;
        boolean actual = meeting.matches("обед");

        Assertions.assertEquals(expected, actual);
    }
}