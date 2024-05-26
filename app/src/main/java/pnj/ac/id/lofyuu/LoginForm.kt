package pnj.ac.id.lofyuu

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginForm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login_form)

        val txtSignup = findViewById<TextView>(R.id.txt_signup)
        txtSignup.setOnClickListener {
            val intent = Intent(this, RegisterForm::class.java)
            startActivity(intent)
        }


    }

}