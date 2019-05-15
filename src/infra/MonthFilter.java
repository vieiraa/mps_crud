package infra;

import java.util.List;
import java.util.stream.Collectors;

import business.model.Event;

public class MonthFilter implements FilterStrategy {

    @Override
    public void filter(List<Event> events, String month) {
        int m = Integer.valueOf(month);
        List<Event> ret = events.stream()
                .filter(e -> e.getPreco() == m)
                .collect(Collectors.toList());

        for (Event e : ret) {
            System.out.println(e.toString());
        }
    }
}
