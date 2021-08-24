import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class MarkingAutoConfiguration {

    @Bean
    public Integer MarkingStringNums(String content){
        return new Random(content.length()).nextInt();
    }
}
