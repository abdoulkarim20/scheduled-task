package cours.apprentissage.scheduleddemo;

import cours.apprentissage.scheduleddemo.avarnav.IAvarnav;
import cours.apprentissage.scheduleddemo.manifeste.IManifeste;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.Scheduled;


@SpringBootApplication
public class ScheduleddemoApplication {
    private final IManifeste iManifeste;
    private final IAvarnav iAvarnav;

    public ScheduleddemoApplication(IManifeste iManifeste, IAvarnav iAvarnav) {
        this.iManifeste = iManifeste;
        this.iAvarnav = iAvarnav;
    }

    public static void main(String[] args) {
        SpringApplication.run(ScheduleddemoApplication.class, args);
    }

    @Scheduled(cron = "0 34 11 * * *")
    public void scheduleCronGetTasksAnyDays() {
        System.out.println(
                "Appel a l'api de l'avarnav chaque a partir de 12H-00MM-00SS"
        );
        /** Appel a l'api de la douane pour enregistrer les avarnav*/
        iAvarnav.getAllAvarnavFromDouane();
        /** Test pour parcourir les manifeste douane et enregistrer*/
        /*iManifeste.getAllManfiesteAndSave();*/
    }

}
