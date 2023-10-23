package cours.apprentissage.scheduleddemo.avarnav;

import java.util.List;

public interface IAvarnav {
    void getAllAvarnavFromDouane();
    Avarnav save(Avarnav avarnav);

    List<Avarnav> getAll();
}
