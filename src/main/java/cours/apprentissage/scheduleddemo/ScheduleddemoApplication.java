package cours.apprentissage.scheduleddemo;

import cours.apprentissage.scheduleddemo.avarnav.IAvarnav;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class ScheduleddemoApplication {
    private final IAvarnav iAvarnav;

    public ScheduleddemoApplication(IAvarnav iAvarnav) {
        this.iAvarnav = iAvarnav;
    }

    public static void main(String[] args) {
        SpringApplication.run(ScheduleddemoApplication.class, args);
    }

    @Scheduled(cron = "0 5 12 * * *")
    public void scheduleCronGetTasksAnyDays() {
        System.out.println(
                "Appel a l'api de l'avarnav chaque a partir de 12H-00MM-00SS"
        );
        /*Appel a l'api de la douane pour enregistrer les avarnav*/
        iAvarnav.getAllAvarnavFromDouane();
    }

}
