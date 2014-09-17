all: test

test: test.c
	g++ $@.c -o$@ /Users/daidong/Documents/gitrepos/github/rocksdb/librocksdb.a -I/Users/daidong/Documents/gitrepos/github/rocksdb/include -O2 -std=c++11 -lsnappy -lgflags -lz -lbz2  -DROCKSDB_PLATFORM_POSIX  -DOS_MACOSX -DROCKSDB_ATOMIC_PRESENT -DSNAPPY -DGFLAGS=google -DZLIB -DBZIP2

clean:
	rm ctest
