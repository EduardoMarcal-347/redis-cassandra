package com.imobiliaria.cassandraredis.repositories;

import com.imobiliaria.cassandraredis.entities.Imovel;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ImovelRepository extends MongoRepository<Imovel, ObjectId> {
}
