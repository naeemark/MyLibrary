update MYLIBRARY_BOOK set AUTHOR_NAME = '' where AUTHOR_NAME is null ;
alter table MYLIBRARY_BOOK alter column AUTHOR_NAME set not null ;
