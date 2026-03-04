package ie.atu.oop_inclass_07.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CameraBooking {
    private long bookingID;
    private long bookingTag;

    @Email
    @NotBlank(message = "Email can't be Blank")
    private String studentEmail;

    @Positive
    private int startHr;

    @Positive
    private int bookingDate;

    @Positive
    private int durationHr;

}
