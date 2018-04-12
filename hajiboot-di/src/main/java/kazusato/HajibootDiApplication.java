package kazusato;

import kazusato.app.Argument;
import kazusato.app.ArgumentResolver;
import kazusato.app.Calculator;
import kazusato.app.Frontend;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import java.util.Scanner;

@EnableAutoConfiguration
@ComponentScan
public class HajibootDiApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(HajibootDiApplication.class, args);
        Frontend frontend = context.getBean(Frontend.class);
        frontend.run();
    }

}
