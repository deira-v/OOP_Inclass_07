package ie.atu.oop_inclass_07.service;

import ie.atu.oop_inclass_07.model.CameraBooking;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CameraBookingService {
    private final List<CameraBooking> cameraBookings = new ArrayList<>();
    private long nextID = 1;

    public CameraBooking addCameraBooking(CameraBooking cameraBooking){
        cameraBooking.setBookingID(nextID);
        cameraBookings.add(cameraBooking);
        return cameraBooking;
    }

    public List<CameraBooking> getAll() {
        return cameraBookings;
    }

}
