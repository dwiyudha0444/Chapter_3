package com.example.chapter3_topic2_tugas.Parcelable

import android.os.Parcel
import android.os.Parcelable

data class DataAndroidPercel(val name : String, val age : Int, val email : String) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString().toString(),
        parcel.readInt(),
        parcel.readString().toString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeInt(age)
        parcel.writeString(email)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<DataAndroidPercel> {
        override fun createFromParcel(parcel: Parcel): DataAndroidPercel {
            return DataAndroidPercel(parcel)
        }

        override fun newArray(size: Int): Array<DataAndroidPercel?> {
            return arrayOfNulls(size)
        }
    }
}
