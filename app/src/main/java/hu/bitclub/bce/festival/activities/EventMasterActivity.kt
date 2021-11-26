package hu.bitclub.bce.festival.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import hu.bitclub.bce.festival.R
import hu.bitclub.bce.festival.model.Event
import hu.bitclub.bce.festival.model.User
import java.util.*
import android.content.Intent




class EventMasterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        onEventsLoaded(createPlaceholderEvents())

        val myIntent = Intent(this, LoginActivity::class.java)
        startActivity(myIntent)
    }

    //TODO ezeket az eventeket felpakolni card-ok formájában a képernyőre (LinearLayout-ba)
    private fun onEventsLoaded(events : MutableList<Event>){

    }

    //amíg nem tudjuk letölteni a saját eventjeinket addig fake eventekkel dolgozunk
    private fun createPlaceholderEvents(): MutableList<Event> {
        var presenters = mutableListOf<User>()

        for(i in 0..11){
            presenters.add(User(i.toString()+"Izsak Attila", "ati@bit.hu", "https://static.independent.co.uk/2021/05/24/20/doge.jpg?width=982&height=726&auto=webp&quality=75"))
        }

        var events = mutableListOf<Event>()

        for(i in 0..10){
            events.add(Event(i.toString()+". event, ",Date(), "Szinpad"+i.toString(), "Leiráás", listOf(presenters[i],presenters[i+1])))
        }

        return events
    }
}