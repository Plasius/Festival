package hu.bitclub.bce.festival.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import hu.bitclub.bce.festival.R

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        register("asdasd@test.com", "123456")
        login("asdasd@test.com", "123456")
    }

    fun register(email: String, password: String) {
        FirebaseAuth.getInstance()
            .createUserWithEmailAndPassword(email, password)
            .addOnSuccessListener { Toast.makeText(this, "register sikeres", Toast.LENGTH_SHORT).show() }
    }

    fun login(email: String, password: String) {
        FirebaseAuth.getInstance()
            .signInWithEmailAndPassword(email, password)
            .addOnSuccessListener { Toast.makeText(this, "login sikeres", Toast.LENGTH_SHORT).show() }
    }
}