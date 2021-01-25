hepsi: derle calistir

derle:
	gcc -I ./inc/ -o ./lib/Kisi.o -c ./src/KISI.c
	gcc -I ./inc/ -o ./lib/Imeino.o -c ./src/IMEINO.c
	gcc -I ./inc/ -o ./lib/KIMLIKNO.o -c ./src/KIMLIKNO.c
	gcc -I ./inc/ -o ./lib/KONTROL.o -c ./src/KONTROL.c
	gcc -I ./inc/ -o ./lib/RASTGELE.o -c ./src/RASTGELE.c
	gcc -I ./inc/ -o ./lib/RASTGELEKISI.o -c ./src/RASTGELEKISI.c
	gcc -I ./inc/ -o ./bin/Test ./lib/Kisi.o ./lib/Imeino.o ./lib/KIMLIKNO.o ./lib/KONTROL.o ./lib/RASTGELE.o ./lib/RASTGELEKISI.o ./src/Test.c

calistir:
	./bin/Test