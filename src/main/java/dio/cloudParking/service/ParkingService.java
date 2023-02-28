package dio.cloudParking.service;

import dio.cloudParking.model.Parking;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.List;

@Service
public class ParkingService {


    private static Map<String, Parking> parkingMap = new HashMap();

    static {
        var id = getUUID();
        Parking parking = new Parking(id, "AAA-0002", "RJ", "Fiat Uno", "BRANCO");
        parkingMap.put(id, parking);
    }


    public List<Parking> findAll(){
        return parkingMap.values().stream().collect(Collectors.toList());
    }

    private static String getUUID(){
        return UUID.randomUUID().toString().replace("-","");

    }

}
