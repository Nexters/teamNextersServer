package com.teamnexters.useractive;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QUserActiveEntity is a Querydsl query type for UserActiveEntity
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QUserActiveEntity extends EntityPathBase<UserActiveEntity> {

    private static final long serialVersionUID = 666950412L;

    public static final QUserActiveEntity userActiveEntity = new QUserActiveEntity("userActiveEntity");

    public final StringPath completeYN = createString("completeYN");

    public final NumberPath<Integer> gener = createNumber("gener", Integer.class);

    public final StringPath userNo = createString("userNo");

    public QUserActiveEntity(String variable) {
        super(UserActiveEntity.class, forVariable(variable));
    }

    public QUserActiveEntity(Path<? extends UserActiveEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUserActiveEntity(PathMetadata<?> metadata) {
        super(UserActiveEntity.class, metadata);
    }

}

