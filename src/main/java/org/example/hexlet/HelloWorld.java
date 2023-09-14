package org.example.hexlet;

import io.javalin.Javalin;

public class HelloWorld {
    public static void main(String[] args) {
        // Создаем приложение
        var app = Javalin.create(config -> {
            config.plugins.enableDevLogging();
        });
        // Описываем что загрузится по адресу /
        app.get("/", ctx -> ctx.result("Hello World"));
        app.start(8080); // Стартуем веб-сервер
        System.out.println("test");
    }
}
