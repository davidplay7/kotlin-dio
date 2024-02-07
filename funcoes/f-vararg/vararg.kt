fun main(){
    //vararg recebe varios valores em uma mesma variavel
    fun printAll(vararg menssages: String){
        for (m in menssages) println(m)
    }
    fun printAllWithPrefix(vararg menssages: String, prefix: Int ){
        var cont = prefix
        for (m in menssages) {
            cont = cont+1
            println("$cont: $m")
            }
    }
    
    printAll("A","R","Y","E","L","I")
    printAllWithPrefix(
        "David","E","Ariely","Se","Amam", prefix = 0
        )
    fun log(vararg entries: String){
        printAll(*entries)
    }
    log("D","A","V","I","D")
}