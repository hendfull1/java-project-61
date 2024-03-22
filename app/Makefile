setup: clean build run-dist
build:
	./gradlew installDist
clean:
	./gradlew clean
# не уверен что тут правильно понял с командой install
install:
	sudo apt-get update
	sudo apt-get install -y openjdk-11-jdk
run-dist:
	./build/install/app/bin/app