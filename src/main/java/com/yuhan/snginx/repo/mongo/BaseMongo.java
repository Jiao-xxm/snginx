package com.yuhan.snginx.repo.mongo;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @author yuzhuJiao
 * @since 2023/08/27
 */
@Component
public abstract class BaseMongo<T> {

    @Autowired
    private MongoTemplate mongoTemplate;

    protected MongoTemplate getMongoTemplate() {
        return this.mongoTemplate;
    }

    public void save(T obj) {
        mongoTemplate.save(obj);
    }

    public void del(String id) {
        mongoTemplate.remove(Criteria.where("_id").is(new ObjectId(id)));
    }

    public Collection<T> findAll(Class<T> clazz){
       return mongoTemplate.findAll(clazz);
    }

}
