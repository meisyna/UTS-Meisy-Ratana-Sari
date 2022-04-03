package com.meisy.utsmeisy.data

import com.meisy.utsmeisy.R
import com.meisy.utsmeisy.model.UTSMeisy

//Membuat kelas Datasource
class Datasource {
    //Menampilkan list berupa string dan juga gambar
    fun loadutsmeisy(): List<UTSMeisy> {
        return listOf<UTSMeisy>(
            UTSMeisy(R.string.utsmeisy1, R.drawable.image1),
            UTSMeisy(R.string.utsmeisy2, R.drawable.image2),
            UTSMeisy(R.string.utsmeisy3, R.drawable.image3),
            UTSMeisy(R.string.utsmeisy4, R.drawable.image4),
            UTSMeisy(R.string.utsmeisy5, R.drawable.image5),
            UTSMeisy(R.string.utsmeisy6, R.drawable.image6),
            UTSMeisy(R.string.utsmeisy7, R.drawable.image7),
            UTSMeisy(R.string.utsmeisy8, R.drawable.image8),
            UTSMeisy(R.string.utsmeisy9, R.drawable.image9),
            UTSMeisy(R.string.utsmeisy10, R.drawable.image10)
        )
    }
}