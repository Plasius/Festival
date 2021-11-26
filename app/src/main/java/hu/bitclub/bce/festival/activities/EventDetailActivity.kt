package hu.bitclub.bce.festival.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import hu.bitclub.bce.festival.R
import hu.bitclub.bce.festival.model.Event
import java.util.*

//ez jeleniti meg az egyes eventeket
class EventDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event_detail)

        val eventId = intent.getIntExtra("event_id", -1)
        if(eventId == -1){
            Toast.makeText(this, "Event could not be loaded", Toast.LENGTH_SHORT).show()
            finish()
        }

        //debug
        Toast.makeText(this, "Loaded event with id:"+eventId, Toast.LENGTH_SHORT).show()
        loadEventDetails(Event(12, "ez csak egy event, helyette majd be lesz toltve az igazi, de ugyancsak a loadEventDetailst fogja meghivni", Date(),"","", mutableListOf()))
    }

    //TODO az oldalon levo mezoket fel kell tolteni a megfelelo szoveggel az Event objectbol
    private fun loadEventDetails(event : Event){

    }

    //TODO ez a fuggveny fusson le ha ramennek valakinek a nevere a nevjegyzekbol
    //TODO hivd meg a ProfileViewActivity-t, az intent-nek extraként rakd be a User id-ját
    private fun launchProfile(){

    }
}