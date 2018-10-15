package pt.andronikus.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pt.andronikus.domain.Hotel;

import java.util.ArrayList;
import java.util.List;

@Component
public class DBSeeder implements CommandLineRunner {

    private HotelRepository hotelRepository;

    @Autowired
    public DBSeeder(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Hotel marriot = new Hotel("Marriot", 5,true);
        Hotel ibis = new Hotel("Ibis", 3,false);
        Hotel goldenTulip = new  Hotel("Golden Tulip", 4,true);

        List<Hotel> hotels = new ArrayList<>();
        hotels.add(marriot);
        hotels.add(ibis);
        hotels.add(goldenTulip);

        hotelRepository.saveAll(hotels);
    }
}
