import kotlin.system.exitProcess

class Main {
    companion object : Callback {
        @JvmStatic
        fun main(args: Array<String>) {

            do {
                var menu = menuGame()
                print("Main lagi? Y/N")
                var lanjutMain = readLine()!!.toUpperCase()
            } while (lanjutMain == "Y")
        }


        var inputMenu = 0

        fun menuGame() {
            println("*********************************************")
            println(" Selamat Datang di Game Batu Gunting Kertas! ")
            println("*********************************************")
            println("  SILAHKAN PILIH : ")
            println("---------------------------------------------")
            println("   1. Pemain lawan Pemain")
            println("   2. Keluar")
            println("---------------------------------------------")
            print("Masukkan pilihanmu : ")
            inputMenu = readLine()!!.toInt()

            when (inputMenu) {
                1 -> {
                    var controller = Controller()
                    controller.mulai(this)
                }
                2 -> {
                    println("Keluar game")
                    exitProcess(0)
                }
                else -> {
                    println("Pilihanmu salah! coba lagi!")
                }
            }
        }
        
        override fun kirimNilaiBalik(cetakHasil: String) {
            println(cetakHasil)
        }
    }
}