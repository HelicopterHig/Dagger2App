package com.example.Dagger2App.presentation

import androidx.appcompat.app.AppCompatActivity
import com.example.domain.usecase.SaveUserNameUseCase
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.Dagger2App.R
import com.example.domain.models.SaveUserNameParam
import com.example.domain.models.UserName
import com.example.domain.usecase.GetUserNameUseCase

class MainActivity : AppCompatActivity() {

    private  val getUserNameUseCase = GetUserNameUseCase(userRepository)
    private  val saveUserNameUseCase = SaveUserNameUseCase(userRepository)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataTextView = findViewById<TextView>(R.id.dataTextView)
        val dataEditView = findViewById<EditText>(R.id.dataEditText)
        val sendButton = findViewById<Button>(R.id.sendButton)
        val receiveButton = findViewById<Button>(R.id.receiveButton)

        sendButton.setOnClickListener {
            val text = dataEditView.text.toString()
            val params = SaveUserNameParam(name = text)
            val result: Boolean = saveUserNameUseCase.execute(param = params)
            dataTextView.text = "Save result = $result"
        }

        receiveButton.setOnClickListener {
            val userName: UserName = getUserNameUseCase.execute()
            dataTextView.text = "${userName.firstName} ${userName.lastName}"
        }






    }
}










































