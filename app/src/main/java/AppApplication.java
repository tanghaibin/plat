import com.plat.app.config.DataSourceConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(scanBasePackages = {"com.plat.app.config", "com.plat.app.controller, com.plat.service"})
@ImportResource("classpath:spring/spring-applicaion-master.xml")
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}
}
