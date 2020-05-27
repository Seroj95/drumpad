package kotlinblo.blogspot.com

import android.media.AudioManager
import android.media.SoundPool
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
lateinit var sp:SoundPool
var sound1:Int?=null
var sound2:Int?=null
var sound3:Int?=null
var sound4:Int?=null
var sound5:Int?=null
var sound6:Int?=null
var sound7:Int?=null
var sound8:Int?=null
var sound9:Int?=null
var sound00:Int?=null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sp= SoundPool(2,AudioManager.STREAM_MUSIC,0)
        sound1=sp.load(applicationContext,R.raw.sound1,1)
      sound2=sp.load(applicationContext,R.raw.sound2,2)
      sound3=sp.load(applicationContext,R.raw.sound3,3)
      sound4=sp.load(applicationContext,R.raw.sound4,4)
      sound5=sp.load(applicationContext,R.raw.sound5,5)
      sound6=sp.load(applicationContext,R.raw.sound6,6)
      sound7=sp.load(applicationContext,R.raw.sound7,7)
      sound8=sp.load(applicationContext,R.raw.sound8,8)
      sound9=sp.load(applicationContext,R.raw.sound9,9)
      sound00=sp.load(applicationContext,R.raw.sound00,1)
    }

    fun playsound1(view: View) {sp.play(sound1!!,1.0f,1.0f,0,0,10f)}
    fun playsound2(view: View) {sp.play(sound2!!,1.0f,1.0f,0,0,10f)}
    fun playsound3(view: View) {sp.play(sound3!!,1.0f,1.0f,0,0,10f)}
    fun playsound4(view: View) {sp.play(sound4!!,1.0f,1.0f,0,0,10f)}
    fun playsound5(view: View) {sp.play(sound5!!,1.0f,1.0f,0,0,10f)}
    fun playsound6(view: View) {sp.play(sound6!!,1.0f,1.0f,0,0,10f)}
    fun playsound7(view: View) {sp.play(sound7!!,1.0f,1.0f,0,0,10f)}
    fun playsound8(view: View) {sp.play(sound8!!,1.0f,1.0f,0,0,10f)}
    fun playsound9(view: View) {sp.play(sound9!!,1.0f,1.0f,0,0,10f)}
}