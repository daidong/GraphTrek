#ifndef _VCR_H_
#define _VCR_H_

#include <sys/types.h>

typedef struct slice{
	int len;
	char *data;
} slice;

typedef struct nodeId{
	uint16_t type;
	uint64_t id;
} nodeId;

typedef struct edgeId{
	uint64_t sid;
	uint16_t type;
	uint64_t did;	
} edgeId;

typedef struct vcr{
	nodeId id;
	Node * np;
	
} vcr;

#endif