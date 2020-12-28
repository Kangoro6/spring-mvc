
package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {

    @Autowired
    private Car car;

    @Transactional
    public List<Car> carListOnService(int count) {
        return car.getCarsList()
                .stream()
                .filter(c -> (count > 0 && count <= 5))
                .limit(count).collect(Collectors.toList());
    }
}