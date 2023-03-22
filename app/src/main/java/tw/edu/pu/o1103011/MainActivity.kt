package tw.edu.pu.o1103011

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

lateinit var txv: TextView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txv=findViewById(R.id.txv)
        if (txv.text =="木内您好！"){
          txv.text  =="海青班很棒"
        }
        else{
            txv.text ="木内您好！"
        }
    }
}