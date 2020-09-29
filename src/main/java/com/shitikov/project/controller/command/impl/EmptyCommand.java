package com.shitikov.project.controller.command.impl;

import com.shitikov.project.controller.command.Command;

import javax.servlet.http.HttpServletRequest;
import java.util.ResourceBundle;

public class EmptyCommand implements Command {

    @Override
    public String execute(HttpServletRequest request) {
        return ResourceBundle.getBundle("properties.config").getString("path.page.index");
    }
}
