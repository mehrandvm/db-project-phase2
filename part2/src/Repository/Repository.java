package Repository;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

public interface Repository<Entity, ID extends Serializable> {
    Entity findById(ID id);

    List<Entity> findByIDs(Collection<ID> ids);

    List<Entity> findAll();

    Boolean deleteByID(ID id);

    Boolean DeleteByIDs(Collection<ID> ids);

    Entity save(Entity E); // saves the Entity, if already exists updates it, then return the entity with the given id by the database
}

