package com.meisy.utsmeisy.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

//Membuat class data UTSMeisy dan mengambil data dari file strings dan gambar drawable
class UTSMeisy (
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)
