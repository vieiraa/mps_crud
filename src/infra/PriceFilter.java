package infra;

import java.util.List;
import java.util.stream.Collectors;

import business.model.Event;

public class PriceFilter implements FilterStrategy {

    @Override
    public void filter(List<Event> events, String price) {
        float p = Float.valueOf(price);
        List<Event> ret = events.stream()
                .filter(e -> e.getPreco() == p)
                .collect(Collectors.toList());

        for (Event e : ret) {
            System.out.println(e.toString());
        }
    }
}
