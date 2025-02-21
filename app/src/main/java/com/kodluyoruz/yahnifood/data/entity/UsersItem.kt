package com.kodluyoruz.yahnifood.data.entity

import com.google.gson.annotations.SerializedName
import com.kodluyoruz.yahnifood.data.entity.Address

data class UsersItem(
    @SerializedName("address_list")
    var address: ArrayList<Address>?,
    @SerializedName("email")
    var email: String,
    @SerializedName("id")
    var id: Int,
    @SerializedName("name")
    var name: String,
    @SerializedName("password")
    var password: String,
    @SerializedName("phone_number")
    var phone_number: String,
    @SerializedName("photo_url")
    var photo_url: String,
    @SerializedName("surname")
    var surname: String
)


