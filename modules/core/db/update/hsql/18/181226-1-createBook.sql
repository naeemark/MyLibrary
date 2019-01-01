create table MYLIBRARY_BOOK (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TITLE varchar(255) not null,
    AUTHOR_NAME varchar(255),
    ISBN varchar(255) not null,
    COVER_IMAGE_URL varchar(255) not null,
    --
    primary key (ID)
);
