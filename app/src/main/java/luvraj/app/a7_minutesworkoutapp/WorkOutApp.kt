package luvraj.app.a7_minutesworkoutapp

import android.app.Application
import luvraj.app.a7_minutesworkoutapp.HistoryDatabase

// create the application class
class WorkOutApp: Application() {

    val db: HistoryDatabase by lazy {
        HistoryDatabase.getInstance(this)
    }
}