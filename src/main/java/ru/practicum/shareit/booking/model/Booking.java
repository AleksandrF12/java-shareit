package ru.practicum.shareit.booking.model;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import ru.practicum.shareit.item.model.Item;
import ru.practicum.shareit.user.model.User;

import java.time.LocalDate;

/**
 * TODO Sprint add-bookings.
 */
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class Booking {
    private Long id = null;
    private LocalDate start = null;
    private LocalDate end = null;
    private Item item = null;
    private User booker = null;
    private Status status = null;
}
