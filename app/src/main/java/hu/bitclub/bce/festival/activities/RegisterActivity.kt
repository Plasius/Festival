package hu.bitclub.bce.festival.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import hu.bitclub.bce.festival.R

class RegisterActivity : AppCompatActivity() {
    //TODO A register függvény kér egy email-t és egy passwordot, amit az activity_register-ben létrehozott UI elementekből kellene megkapjon
    //TODO a UI-t úgy kell felépíteni, ahogy a design kéri

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

    fun login_click(view: View) {
        var pass1 = findViewById<EditText>(R.id.password1EditText)
        var pass2 = findViewById<EditText>(R.id.password2EditText)
        var email = findViewById<EditText>(R.id.emailEditText)
        if (pass1.text.toString() == pass2.text.toString()) {
        register(email.text.toString(),pass1.text.toString())
        }
        else {
            Toast.makeText( this,"nem sikerult", Toast.LENGTH_SHORT).show()}
    }
}