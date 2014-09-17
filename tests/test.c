#include <stdio.h>
#include "rocksdb/c.h"

int main(){
    rocksdb_t *db;
    const char * kDBPath = "/tmp/c_rocksdb_example";
    rocksdb_options_t *options = rocksdb_options_create();
    rocksdb_options_set_create_if_missing(options, 1);

    rocksdb_writeoptions_t *woptions;
    rocksdb_readoptions_t *roptions;

    char *err = NULL;

    db = rocksdb_open(options, kDBPath, &err);

    if (err != NULL){
        fprintf(stderr, "Open fail.\n");
        return 1;
    }

    woptions = rocksdb_writeoptions_create();
    rocksdb_put(db, woptions, "key", 3, "value", 5, &err);

    if (err != NULL){
        fprintf(stderr, "Open fail.\n");
        return 1;
    }

    roptions = rocksdb_readoptions_create();
    size_t vlen;
    char *read = rocksdb_get(db, roptions, "key", 3, &vlen, &err);

    if (err != NULL){
        fprintf(stderr, "Open fail.\n");
        return 1;
    }

    printf("key: %s\n", read);

    rocksdb_delete(db, woptions, "key", 3, &err);
    if (err != NULL){
        fprintf(stderr, "Open fail.\n");
        return 1;
    }

    rocksdb_close(db);

    rocksdb_destroy_db(options, kDBPath, &err);

    if (err != NULL){
        fprintf(stderr, "Open fail.\n");
        return 1;
    }

    return 0;

}
