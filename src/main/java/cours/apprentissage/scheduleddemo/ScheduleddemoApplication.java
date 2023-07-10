package cours.apprentissage.scheduleddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class ScheduleddemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScheduleddemoApplication.class, args);
    }

    @Scheduled(cron = "0 00 12 * * *")
    public void scheduleFixedRateWithInitialDelayTask() {
        System.out.println(
                "Appel a l'api de l'avarnav chaque 16h47mm00s ");
    }

}
