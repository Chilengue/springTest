package api.springTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
// @EnableEurekaServer
@EnableScheduling
public class SpringTestgeApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTestgeApiApplication.class, args);
    }

}
