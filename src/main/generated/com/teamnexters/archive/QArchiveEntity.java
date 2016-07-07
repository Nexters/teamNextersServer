package com.teamnexters.archive;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QArchiveEntity is a Querydsl query type for ArchiveEntity
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QArchiveEntity extends EntityPathBase<ArchiveEntity> {

    private static final long serialVersionUID = 1493490292L;

    public static final QArchiveEntity archiveEntity = new QArchiveEntity("archiveEntity");

    public final StringPath desc = createString("desc");

    public final NumberPath<Integer> no = createNumber("no", Integer.class);

    public final StringPath prizeYN = createString("prizeYN");

    public final StringPath title = createString("title");

    public QArchiveEntity(String variable) {
        super(ArchiveEntity.class, forVariable(variable));
    }

    public QArchiveEntity(Path<? extends ArchiveEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QArchiveEntity(PathMetadata<?> metadata) {
        super(ArchiveEntity.class, metadata);
    }

}

