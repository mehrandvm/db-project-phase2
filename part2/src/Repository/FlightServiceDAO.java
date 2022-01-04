package Repository;

import java.util.Collection;
import java.util.List;

import Model.FlightService;
public class FlightServiceDAO implements Repository<FlightService,Long>{

    @Override
    public FlightService findById(Long aLong) {
        return null;
    }

    @Override
    public List<FlightService> findByIDs(Collection<Long> longs) {
        return null;
    }

    @Override
    public List<FlightService> findAll() {
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
    public FlightService save(FlightService E) {
        return null;
    }
}
