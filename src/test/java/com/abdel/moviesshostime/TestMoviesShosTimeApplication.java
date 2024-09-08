package com.abdel.moviesshostime;

import org.springframework.boot.SpringApplication;

public class TestMoviesShosTimeApplication {

    public static void main(String[] args) {
        SpringApplication.from(MoviesShosTimeApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
