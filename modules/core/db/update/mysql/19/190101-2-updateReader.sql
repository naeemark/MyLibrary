alter table MYLIBRARY_READER add column PICTURE_URL varchar(255) ^
update MYLIBRARY_READER set PICTURE_URL = '' where PICTURE_URL is null ;
alter table MYLIBRARY_READER modify column PICTURE_URL varchar(255) not null ;
