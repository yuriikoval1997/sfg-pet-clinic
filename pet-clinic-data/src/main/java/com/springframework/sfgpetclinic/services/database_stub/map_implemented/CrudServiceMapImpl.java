package com.springframework.sfgpetclinic.services.database_stub.map_implemented;

import com.springframework.sfgpetclinic.model.BaseEntity;
import com.springframework.sfgpetclinic.services.database_stub.CrudService;
import lombok.NonNull;

import java.util.*;

/**
 * Id has to be Long, because its default values is null. If you use primitive long, which default value is 0,
 * you will get an error, because usually it's responsibility of DataBAse to generate id.
 * @param <T>
 */
public abstract class CrudServiceMapImpl<T extends BaseEntity> implements CrudService<T, Long> {
    private long idCounter = 1;
    private Queue<Long> freeIds = new ArrayDeque<>();
    private Map<Long, T> map = new HashMap<>();

    @Override
    public Optional<T> findById(Long id) {
        return Optional.ofNullable(map.get(id));
    }

    @Override
    public T save(@NonNull T t) {
        long id = getNextFreeId();
        map.put(id, t);
        t.setId(id);
        return t;
    }

    private long getNextFreeId(){
        return freeIds
                .stream()
                .findAny()
                .orElse(idCounter++);
    }

    @Override
    public Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    @Override
    public void delete(final T t) {
        Optional<Long> id = map
                .values()
                .stream()
                .filter(entity -> entity.equals(t))
                .map(BaseEntity::getId)
                .findAny();
        id.ifPresent(this::deleteById);
        id.ifPresent(freeIds::add);
    }

    @Override
    public void deleteById(Long id) {
        map.remove(id);
        freeIds.add(id);
    }
}
