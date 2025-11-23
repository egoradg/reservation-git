package secondtry.reservation.reservations.availability;

public record CheckAvailabilityResponse(
        String massage,

        AvailabilityStatus status
) {
}
