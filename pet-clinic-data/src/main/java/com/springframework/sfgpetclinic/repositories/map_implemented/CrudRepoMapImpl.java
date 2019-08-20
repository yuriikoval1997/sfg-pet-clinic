package com.springframework.sfgpetclinic.repositories.map_implemented;

import com.springframework.sfgpetclinic.model.BaseEntity;
import com.springframework.sfgpetclinic.repositories.CrudRepo;

import java.util.*;

public abstract class CrudRepoMapImpl<T extends BaseEntity> implements CrudRepo<T, Long> {
    private long idCounter;
    private Queue<Long> freeIds = new ArrayDeque<>();
    private Map<Long, T> map = new HashMap<>();

    @Override
    public T findById(Long id) {
        return map.get(id);
    }

    @Override
    public T save(T t) {
        long id = getNextFreeId();
        map.put(id, t);
        t.setId(id);
        return t;
    }

    private long getNextFreeId(){
        if (freeIds.isEmpty()){
            return idCounter++;
        }
        return freeIds.remove();
    }

    @Override
    public Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    @Override
    public void delete(T t) {
        final long[] idWrap = new long[1];
        map
                .entrySet()
                .removeIf(entry -> {
                    if (entry.getValue().equals(t)) {
                        idWrap[0] = entry.getKey();
                        return true;
                    }
                    return false;
                });
        freeIds.add(idWrap[0]);
    }

    @Override
    public void deleteById(Long id) {
        map.remove(id);
        freeIds.add(id);
    }
}
