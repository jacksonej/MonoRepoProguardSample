package systems.keyvalue.monorepoprogurardsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import systems.keyvalue.sdkall.MainSdk

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MainSdk()

    }
}