class Controller {

    val pilihan = mutableListOf<String>("batu", "gunting", "kertas")
    var cetakHasil = String()


    fun mulai(listener: Callback) {
        println("Masukkan pilihan Pemain 1 : ")
        var playerSatu = readLine()!!.toLowerCase()
        println("Masukkan pilihan Pemain 2 : ")
        var playerDua = readLine()!!.toLowerCase()
        println("Hasilnya : ")


        if (playerSatu.equals(playerDua)) {
            cetakHasil = "Seri"
        } else if (playerSatu == "batu" && playerDua == "gunting" || playerSatu == "gunting" && playerDua == "kertas" ||
            playerSatu == "kertas" && playerDua == "batu"
        ) {
            cetakHasil = "Player satu menang! $playerSatu mengalahkan $playerDua "
        } else if (playerDua == "batu" && playerSatu == "gunting" || playerDua == "gunting" && playerSatu == "kertas" ||
            playerDua == "kertas" && playerSatu == "batu"
        ) {
            cetakHasil = "Player Dua menang! $playerDua mengalahkan $playerSatu"
        } else {
            cetakHasil = "Input salah! Silahkan masukkan ulang "
        }
        listener.kirimNilaiBalik(cetakHasil)
    }

}