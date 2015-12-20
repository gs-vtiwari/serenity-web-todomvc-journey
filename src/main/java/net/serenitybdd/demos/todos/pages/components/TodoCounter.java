package net.serenitybdd.demos.todos.pages.components;

import net.serenitybdd.core.pages.PageObject;

public class TodoCounter extends PageObject {
    public Integer getValue() {
        String itemCount = $("#todo-count strong").getText();
        return Integer.parseInt(itemCount);
    }
}