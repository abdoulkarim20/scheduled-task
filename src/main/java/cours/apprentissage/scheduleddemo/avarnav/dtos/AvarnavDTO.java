package cours.apprentissage.scheduleddemo.avarnav.dtos;

import java.util.List;

public class AvarnavDTO {
    private List<AvarnavPostDTO> data;

    public List<AvarnavPostDTO> getData() {
        return data;
    }

    public void setData(List<AvarnavPostDTO> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "AvarnavDTO{" +
                "data=" + data +
                '}';
    }
}
