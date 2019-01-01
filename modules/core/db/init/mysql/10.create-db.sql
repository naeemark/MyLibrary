-- begin MYLIBRARY_BOOK
create table MYLIBRARY_BOOK (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    TITLE varchar(255) not null,
    AUTHOR_NAME varchar(255) not null,
    ISBN varchar(255) not null,
    COVER_IMAGE_URL varchar(255) not null,
    --
    primary key (ID)
)^
-- end MYLIBRARY_BOOK
-- begin MYLIBRARY_READER
create table MYLIBRARY_READER (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    PICTURE_URL varchar(255) not null,
    EMAIL varchar(255) not null,
    DATE_OF_BIRTH date not null,
    --
    primary key (ID)
)^
-- end MYLIBRARY_READER
