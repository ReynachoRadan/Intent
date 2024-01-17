package android.intenteksplisit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MoveWithDataActivity : AppCompatActivity(),
    View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_data)
        val tvDataReceived: TextView =
            findViewById(R.id.tv_data_recieved)
        val name = intent.getStringExtra(EXTRA_NAME)
        val age = intent.getIntExtra(EXTRA_AGE, 0)
        val text = "Name : $name, Your Age : $age"
        tvDataReceived.text = text
    }
    companion object{
        const val EXTRA_AGE = "extra_age"
        const val EXTRA_NAME = "extra_name"
    }

    override fun onClick(v:View){
        when(v.id){
            R.id.btn_back -> {
                val backintent2 = Intent(
                    this@MoveWithDataActivity,
                    MainActivity::class.java
                )
                startActivity(backintent2)
            }
        }
    }
}