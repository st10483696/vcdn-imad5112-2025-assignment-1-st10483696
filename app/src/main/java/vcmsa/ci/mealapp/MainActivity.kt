package vcmsa.ci.mealapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val editViewTIMEOFDAY = findViewById<EditText>(R.id.timeofday)
        val button1 = findViewById<Button>(R.id.enterbutton)
        val textView = findViewById<TextView>(R.id.suggestedfoods)
        val button2 = findViewById<Button>(R.id.resetbutton)

        button1.setOnClickListener {
            val text = editViewTIMEOFDAY.text.toString()
            if (text == "Morning" || text == "morning") {
                textView.text = "Eggs and toast"
            }else if (text == "Afternoon" || text == "afternoon"){
                textView.text = "Cold meats"
        } else if (text == "Late-snack")
        textView.text = "Rice cakes with peanut butter"
    }
    button2.setOnClickListener {
        editViewTIMEOFDAY.text.clear()
        textView.text = "Enter information"
    }
}
}






        
        
        

