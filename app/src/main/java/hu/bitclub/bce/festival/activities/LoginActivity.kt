package hu.bitclub.bce.festival.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import hu.bitclub.bce.festival.R

class LoginActivity : AppCompatActivity() {
    //TODO A login függvény kér egy email-t és egy passwordot, amit az activity_login-ban létrehozott UI elementekből kellene megkapjon
    //TODO a UI-t úgy kell felépíteni, ahogy a design kéri

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        login("asdasd@test.com", "123456")
    }



    fun login(email: String, password: String) {
        FirebaseAuth.getInstance()
            .signInWithEmailAndPassword(email, password)
            .addOnSuccessListener { Toast.makeText(this, "login sikeres", Toast.LENGTH_SHORT).show() }
    }
}