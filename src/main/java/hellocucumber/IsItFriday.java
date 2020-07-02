package hellocucumber;

import org.springframework.stereotype.Service;

@Service
class IsItFriday {

    String isItFriday(String today) {
        return "Friday".equals(today) ? "TGIF" : "Nope";
    }
}