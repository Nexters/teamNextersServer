package com.teamnexters.memory;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QMemoryEntity is a Querydsl query type for MemoryEntity
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QMemoryEntity extends EntityPathBase<MemoryEntity> {

    private static final long serialVersionUID = 994757228L;

    public static final QMemoryEntity memoryEntity = new QMemoryEntity("memoryEntity");

    public final StringPath desc = createString("desc");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final SetPath<com.teamnexters.memoryimg.MemoryImgEntity, com.teamnexters.memoryimg.QMemoryImgEntity> memoryImgs = this.<com.teamnexters.memoryimg.MemoryImgEntity, com.teamnexters.memoryimg.QMemoryImgEntity>createSet("memoryImgs", com.teamnexters.memoryimg.MemoryImgEntity.class, com.teamnexters.memoryimg.QMemoryImgEntity.class, PathInits.DIRECT2);

    public final StringPath title = createString("title");

    public QMemoryEntity(String variable) {
        super(MemoryEntity.class, forVariable(variable));
    }

    public QMemoryEntity(Path<? extends MemoryEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMemoryEntity(PathMetadata<?> metadata) {
        super(MemoryEntity.class, metadata);
    }

}

