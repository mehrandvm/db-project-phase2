package Repository;

import java.util.Collection;
import java.util.List;

import Model.Transaction;

public class TransactionDAO implements Repository<Transaction, Long> {


    @Override
    public Transaction findById(Long aLong) {
        return null;
    }

    @Override
    public List<Transaction> findByIDs(Collection<Long> longs) {
        return null;
    }

    @Override
    public List<Transaction> findAll() {
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
    public Transaction save(Transaction E) {
        return null;
    }
}
