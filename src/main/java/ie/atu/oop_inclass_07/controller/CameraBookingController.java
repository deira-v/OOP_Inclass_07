package ie.atu.oop_inclass_07.controller;

import ie.atu.oop_inclass_07.model.CameraBooking;
import ie.atu.oop_inclass_07.service.CameraBookingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bookCamera")
public class CameraBookingController {
    private final CameraBookingService cameraBookingService;

    public CameraBookingController(CameraBookingService cameraBookingService){
        this.cameraBookingService = cameraBookingService;
    }

    @GetMapping
    public ResponseEntity<List<CameraBooking>> getAll(){
        return ResponseEntity.ok(cameraBookingService.getAll());
    }

}
