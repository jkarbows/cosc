; Griffin Obeid
; Program that adds 2 integers
	
	.orig x3000 ;starting instruction at location x3000
	LD R0, A	;Initialize variable A
	LD R1, B	;Initialize variable B
	ADD R2, R1, R0	;Add A and B
	ST R2, SUM	;Retrieve sum of A and B
	HALT
	
A	.FILL x0004
B	.FILL x0003
SUM	.BLKW 1

	.END