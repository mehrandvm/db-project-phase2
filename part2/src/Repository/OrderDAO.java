package Repository;

import java.util.Collection;
import java.util.List;

import Model.Order;

public class OrderDAO implements Repository<Order, Long> {

    @Override
    public Order findById(Long aLong) {
        return null;
    }

    @Override
    public List<Order> findByIDs(Collection<Long> longs) {
        return null;
    }

    @Override
    public List<Order> findAll() {
        return null;
    }

    @Override
    public Boolean deleteByID(Long aLong) {
        return null;
    }

    @Override
    public Boolean DeleteByIDs(Collection<Long> longs) {
        return null;
    }

    @Override
    public Order save(Order E) {
        return null;
    }
}
