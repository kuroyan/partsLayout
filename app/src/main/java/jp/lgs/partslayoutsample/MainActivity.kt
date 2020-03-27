package jp.lgs.partslayoutsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickBtn(view: View){
        var switcha = switch1
        if(switcha.isChecked) {
            toastMake("Switch ON",0,200)
        }
        else {
            toastMake("Switch OFF",0,200)
        }
    }

    private fun toastMake(message: String, x: Int, y: Int) {
        val toast = Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT)
        // 位置調整
        toast.setGravity(Gravity.CENTER, x, y)
        toast.show()
    }


}
