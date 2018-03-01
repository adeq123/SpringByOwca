package info.adro.springtutorial;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({LoggerConfiguration.class, RespositoriesConifuration.class})
public class AppConfiguration {

}
