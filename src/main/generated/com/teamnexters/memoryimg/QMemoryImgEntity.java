package com.teamnexters.memoryimg;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QMemoryImgEntity is a Querydsl query type for MemoryImgEntity
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QMemoryImgEntity extends EntityPathBase<MemoryImgEntity> {

    private static final long serialVersionUID = 1498627220L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMemoryImgEntity memoryImgEntity = new QMemoryImgEntity("memoryImgEntity");

    public final StringPath img = createString("img");

    public final com.teamnexters.memory.QMemoryEntity memory;

    public final NumberPath<Integer> seq = createNumber("seq", Integer.class);

    public QMemoryImgEntity(String variable) {
        this(MemoryImgEntity.class, forVariable(variable), INITS);
    }

    public QMemoryImgEntity(Path<? extends MemoryImgEntity> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QMemoryImgEntity(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QMemoryImgEntity(PathMetadata<?> metadata, PathInits inits) {
        this(MemoryImgEntity.class, metadata, inits);
    }

    public QMemoryImgEntity(Class<? extends MemoryImgEntity> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.memory = inits.isInitialized("memory") ? new com.teamnexters.memory.QMemoryEntity(forProperty("memory")) : null;
    }

}

