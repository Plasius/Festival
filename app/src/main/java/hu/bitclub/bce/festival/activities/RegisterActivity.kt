package hu.bitclub.bce.festival.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import hu.bitclub.bce.festival.R

class RegisterActivity : AppCompatActivity() {
    //A register függvény kér egy email-t és egy passwordot, amit az activity_register-ben létrehozott UI elementekből kellene megkapjon
    //a UI-t úgy kell felépíteni, ahogy a design kéri

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        register("asdasd@test.com", "123456")
    }

    fun register(email: String, password: String) {
        FirebaseAuth.getInstance()
            .createUserWithEmailAndPassword(email, password)
            .addOnSuccessListener { Toast.makeText(this, "register sikeres", Toast.LENGTH_SHORT).show() }
    }
}