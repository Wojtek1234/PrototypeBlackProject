package com.vidicom.fakeblackredale

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_start_with_ar.*

class StartActivityWithAR : AppCompatActivity() {

    companion object {
        val SMILE = 12
        val NO_SMILE = 13
    }
    private  val requestCode = 123;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_with_ar)

        stopsTalkingButton.setOnClickListener {
            Intent(this, FakeSmailRecognitionActivity::class.java).let {
                this.startActivityForResult(it,requestCode)
            }
        }
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if(requestCode == this.requestCode){
            if(resultCode == SMILE){
                text.text = "SMILE detected, is doing now what is supposed to be when there is a smile "
                stopsTalkingButton.text = "Finish test project"
                stopsTalkingButton.setOnClickListener {
                    finish()
                }
            }else if(resultCode == NO_SMILE){
                text.text = "SMILE NOT detected, is doing now what is supposed to be when there is no smile "
                stopsTalkingButton.text = "Finish test project"
                stopsTalkingButton.setOnClickListener {
                    finish()
                }
            }
        }
    }
}
