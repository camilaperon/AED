all: build run

build:
	javac -d bin CorrecaoT3.java

run:
	@java -cp bin CorrecaoT3

t3: t3-build
	java -cp bin CorrecaoT3
	
t3-build:
	javac -d bin CorrecaoT3.java trabalhos/T3.java	

git:
	@echo "=== Configuraçõe para Git ==="
	@bash -c ' read -p "Email: " EMAIL; git config --global user.email $$EMAIL '
	@bash -c ' read -p "Nome: "  NOME ; git config --global user.name  $$NOME  '