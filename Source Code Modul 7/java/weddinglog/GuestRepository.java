package weddinglog;

import java.util.ArrayList;
import java.util.List;

public class GuestRepository implements GuestService {

    private List<Guest> guestList;

    public GuestRepository() {
        this.guestList = new ArrayList<>();
    }

    @Override
    public void addGuest(Guest guest) {
        guestList.add(guest);
    }

    @Override
    public List<Guest> getAllGuests() {
        return guestList;
    }

    @Override
    public void updateGuest(int index, Guest guest) {
        if (index >= 0 && index < guestList.size()) {
            guestList.set(index, guest);
        }
    }

    @Override
    public void deleteGuest(Guest guest) {
        guestList.remove(guest);
    }
}