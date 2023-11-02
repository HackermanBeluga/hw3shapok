package com.example.shapokapp

import android.os.Parcel
import android.os.Parcelable

data class Sneacker(val image:Int, val name:String) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(image)
        parcel.writeString(name)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Sneacker> {
        override fun createFromParcel(parcel: Parcel): Sneacker {
            return Sneacker(parcel)
        }

        override fun newArray(size: Int): Array<Sneacker?> {
            return arrayOfNulls(size)
        }
    }
}
