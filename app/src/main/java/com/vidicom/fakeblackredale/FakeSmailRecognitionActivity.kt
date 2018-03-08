package com.vidicom.fakeblackredale

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_fake_small_recognition.*

class FakeSmailRecognitionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fake_small_recognition)
        smileButton.setOnClickListener {
            this.setResult(StartActivityWithAR.SMILE)
            this.finish()
        }
        noSmileButton.setOnClickListener {
            this.setResult(StartActivityWithAR.NO_SMILE)
            this.finish()
        }
    }
}
