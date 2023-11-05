fun main() {
    val nama = "Samsul Hadi"
    //nama = "testing"
    //val = finish
    var nim = "220441100138"
    var ipk:Double = 3.8
    val univ:String = "Universitas Trunojoyo Madura"
    var matkul = arrayOf("ALPRO", "Logika Enginering", "Manajemen Organisasi", 123)
    matkul[0] = "Keterampilan Interpersonal"
    
    println("Nama Saya "+nama+" dan NIM saya "+nim)
    println("IPK saya "+ipk)
    println("Saya lulusan " + univ)
    println(matkul[0])
    println(matkul[3])
    
    var status = false
    if(status == true){
        println("Udah punya pasangan")
    }else{
        println("Belum punya pasangan")
    }
    
    val nilai = 8
    if(nilai % 2 == 0){
        println("Bilangan Genap")
    }else{
        println("Bilangan Ganjil")
    }
    
	var test:Int = 3
    for(i in 1..10){
        test++
        println(test)
        println("nilai ke-"+i)
    }
    
    var test3 = 1
    while(test3 <= 4){
        test3++
        println("Haloo")
    }
    
    var test4 = 0
    while(true){
        test4++
        println("Testing")
        if(test4 == 5){
            break
        }
    }
}

fun tambah(a:Int, b:int){
    println(a + b)
}

fun kurangi(a:Int, b:int){
    println(a - b)
}

fun kali(a:Int, b:int){
    println(a * b)
}

fun bagi(a:Int, b:int){
    println(a / b)
}

class Human{
    fun Hands(){
	print("Hallo")
    }
}
