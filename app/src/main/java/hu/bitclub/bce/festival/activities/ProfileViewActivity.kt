package hu.bitclub.bce.festival.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import hu.bitclub.bce.festival.R
import hu.bitclub.bce.festival.model.User

class ProfileViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_view)

        val userEmail = intent.getStringExtra("user_email")

        if (userEmail == null){
            Toast.makeText(this, "User profile could not be loaded.", Toast.LENGTH_SHORT).show()
            finish()
        }else{
            Toast.makeText(this, "Loaded user with ID:"+userEmail, Toast.LENGTH_SHORT).show()
        }

        displayUserInfo(User("mintauser egyelore", "email", "url"))

    }

    //TODO toltsd fel a megfelelo UI elementeket a user adataival
    private fun displayUserInfo(user : User){

    }
}