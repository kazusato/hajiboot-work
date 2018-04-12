package kazusato;

import kazusato.app.AddCalculator;
import kazusato.app.ArgumentResolver;
import kazusato.app.Calculator;
import kazusato.app.ScannerArgumentResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    Calculator calculator() {
        return new AddCalculator();
    }

    @Bean
    ArgumentResolver argumentResolver() {
        return new ScannerArgumentResolver();
    }

}
