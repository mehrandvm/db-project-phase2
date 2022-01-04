package Repository;

import java.util.Collection;
import java.util.List;

import Model.User;

public class UserDAO implements Repository<User, Long> {

    @Override
    public User findById(Long aLong) {
        return null;
    }

    @Override
    public List<User> findByIDs(Collection<Long> longs) {
        return null;
    }

    @Override
    public List<User> findAll() {
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
    public User save(User E) {
        return null;
    }
}
