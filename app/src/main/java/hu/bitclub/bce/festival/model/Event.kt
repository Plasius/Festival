package hu.bitclub.bce.festival.model
import java.util.*

class Event (
    val id: Int,
    val name : String,
    val date : Date,
    val location : String,
    val description : String,
    val profiles: Collection<User>)