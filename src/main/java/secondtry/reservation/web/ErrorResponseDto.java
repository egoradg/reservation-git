package secondtry.reservation.web;

import java.time.LocalDateTime;

public record ErrorResponseDto(
        String massage,
        String detailedMassage,
        LocalDateTime errorTime
) {
}
