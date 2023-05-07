package ru.practicum.shareit.booking.dto;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import ru.practicum.shareit.Create;

import javax.validation.constraints.Future;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
public class BookingInputDto {
    @NotNull(groups = {Create.class})
    Long itemId;
    @NotNull(groups = {Create.class})
    @DateTimeFormat(pattern = "yyyy-MM-ddTHH:mm:ss")
    @FutureOrPresent LocalDateTime start;
    @NotNull(groups = {Create.class})
    @DateTimeFormat(pattern = "yyyy-MM-ddTHH:mm:ss")
    @Future LocalDateTime end;
}
