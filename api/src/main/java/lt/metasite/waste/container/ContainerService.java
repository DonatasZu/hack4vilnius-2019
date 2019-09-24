package lt.metasite.waste.container;

import java.time.LocalDate;
import java.util.List;

import lt.metasite.waste.container.dto.*;
import lt.metasite.waste.container.repository.WasteContainerRepository;

import org.springframework.stereotype.Service;

@Service
public class ContainerService {
    private final WasteContainerRepository repository;

    public ContainerService(
            WasteContainerRepository repository) {
        this.repository = repository;
    }

    public String save() {
        Container container = new Container();


        return repository.save(container).getId();
    }

    public List<ContainerListView> findByPosition(Double longitude, Double latitude, Double distance) {

        return repository.findByGeoLocation(longitude, latitude, distance);
    }

    public ContainerView getContainerView(String containerNo) {
        return repository.getContainerView(containerNo);
    }

    public List<Pickup> getPickupHistory(String containerNo, LocalDate date) {
        return repository.getPickupHistory(containerNo, date);
    }

    public List<ContainerPickupHistoryView> getLowRatioContainers(LocalDate date) {
        return repository.getLowRationContainers(date);
    }

    public List<ContainerForDateView> pickupsForDate(LocalDate date) {
        return repository.scheduledPickupContainers(date);
    }

}
