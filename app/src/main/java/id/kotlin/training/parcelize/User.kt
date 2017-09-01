package id.kotlin.training.parcelize

import android.annotation.SuppressLint
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@SuppressLint("ParcelCreator")
@Parcelize
data class User(var id: Int,
                var name: String,
                var age: Int) : Parcelable