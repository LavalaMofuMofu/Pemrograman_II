package weddinglog;

import java.util.List;

public interface GuestService {
    void addGuest(Guest guest);
    List<Guest> getAllGuests();
    void updateGuest(int index, Guest guest); // Update
    void deleteGuest(Guest guest);
}