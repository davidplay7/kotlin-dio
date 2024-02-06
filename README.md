# kotlin-dio
## Conectado

**Instalação no Ubuntu do JRE, JDK e Kotlin:**
#### JRE
```sh 
sudo apt install default-jre
```
#### JDK
```sh 
sudo apt install default-jdk
```
#### Kotlin
```sh 
sudo snap install --classic kotlin
```

#### Verificar a versão
```sh 
kotlin -version
```


#### Compilar o codigo
```sh 
kotlinc xxx.kt -include-runtime -d xxx.jar
```
Onde xxx.kt e o nome do arquivo que se quer compilar e o xxx.jar e o nome do arquivo executavel.

#### Executar o codigo
```sh 
java -jar xxx.jar
```