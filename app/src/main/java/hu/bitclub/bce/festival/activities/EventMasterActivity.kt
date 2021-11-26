package hu.bitclub.bce.festival.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import hu.bitclub.bce.festival.R
import hu.bitclub.bce.festival.model.Event
import hu.bitclub.bce.festival.model.User
import java.util.*
import android.content.Intent
import com.google.common.primitives.UnsignedInts.toLong
import com.google.firebase.auth.FirebaseAuth


//ez listazza az osszes eventet
class EventMasterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        onEventsLoaded(createPlaceholderEvents())

        //ha nincs beloginolt user akkor iranyitsd at a login oldalra
        if(FirebaseAuth.getInstance().currentUser == null){
            val myIntent = Intent(this, LoginActivity::class.java)
            startActivity(myIntent)
            finish()
        }

    }

    //TODO ezeket az eventeket felpakolni card-ok formájában a képernyőre (LinearLayout-ba)
    private fun onEventsLoaded(events : MutableList<Event>){

    }

    //TODO egy eventre kattintva, ezt a fuggvenyt kell meghivja es kinyilik az event egy kulon oldalon
    private fun viewEvent(id : Long){
        val myIntent = Intent(this, EventDetailActivity::class.java)
        myIntent.putExtra("event_id", id)
        startActivity(myIntent)
    }

    //amíg nem tudjuk letölteni a saját eventjeinket addig fake eventekkel dolgozunk
    private fun createPlaceholderEvents(): MutableList<Event> {
        var presenters = mutableListOf<User>()

        for(i in 0..11){
            presenters.add(User(i.toString()+"Izsak Attila", "ati@bit.hu", "https://static.independent.co.uk/2021/05/24/20/doge.jpg?width=982&height=726&auto=webp&quality=75"))
        }

        var events = mutableListOf<Event>()

        for(i in 0..10){
            events.add(Event(1000*i, i.toString()+". event, ", Date(), "Szinpad"+i.toString(), "Leiráás", listOf(presenters[i], presenters[i+1])))
        }

        return events
    }
}