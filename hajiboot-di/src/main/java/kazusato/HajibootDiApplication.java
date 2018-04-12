package kazusato;

import kazusato.app.Argument;
import kazusato.app.ArgumentResolver;
import kazusato.app.Calculator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

import java.util.Scanner;

@EnableAutoConfiguration
@Import(AppConfig.class)
public class HajibootDiApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(HajibootDiApplication.class, args);
        System.out.println("Enter 2 numbers like 'a b' : ");
        ArgumentResolver argumentResolver = context.getBean(ArgumentResolver.class);
        Argument argument = argumentResolver.resolve(System.in);
        Calculator calculator = context.getBean(Calculator.class);
        int result = calculator.calc(argument.getA(), argument.getB());
        System.out.println("result = " + result);
    }

}
