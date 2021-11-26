package hu.bitclub.bce.festival.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import hu.bitclub.bce.festival.R
import hu.bitclub.bce.festival.model.Event
import hu.bitclub.bce.festival.model.User
import java.util.*

class ContactListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_list)

        onUsersLoaded(createPlaceholderUsers())
    }

    //TODO a megadott usereket feltűntetni egymás után sorban (LinearLayout-ban)
    private fun onUsersLoaded(users : MutableList<User>){

    }

    //amíg nem tudjuk letölteni a saját eventjeinket addig fake eventekkel dolgozunk
    private fun createPlaceholderUsers(): MutableList<User> {
        var users = mutableListOf<User>()

        for(i in 0..11){
            users.add(User(i.toString()+"Izsak Attila", "ati@bit.hu", "https://static.independent.co.uk/2021/05/24/20/doge.jpg?width=982&height=726&auto=webp&quality=75"))
        }

        return users
    }
}