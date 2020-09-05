package com.wxson.tws_player

import android.bluetooth.BluetoothDevice

class BluetoothDeviceWithStatus(device : BluetoothDevice) {
    val bluetoothDevice : BluetoothDevice = device
//    var isPaired : Boolean = false
    var status : Int = Constants.BluetoothNoBond
}