package com.example.Dagger2App.presentation

import androidx.appcompat.app.AppCompatActivity
import com.example.domain.usecase.SaveUserNameUseCase
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.Dagger2App.R
import com.example.Dagger2App.di.App
import com.example.domain.models.SaveUserNameParam
import com.example.domain.models.UserName
import com.example.domain.usecase.GetUserNameUseCase

class MainActivity : AppCompatActivity() {

   //private  val getUserNameUseCase = GetUserNameUseCase(userRepository)
   //private  val saveUserNameUseCase = SaveUserNameUseCase(userRepository)

    @javax.inject.Inject
    lateinit var vmFactory:  MainViewModelFactory
    private lateinit var vm: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (applicationContext as App).appComponent.inject(this)
        vm = ViewModelProvider(this, vmFactory)
            .get(MainViewModel::class.java)

        val dataTextView = findViewById<TextView>(R.id.dataTextView)
        val dataEditView = findViewById<EditText>(R.id.dataEditText)
        val sendButton = findViewById<Button>(R.id.sendButton)
        val receiveButton = findViewById<Button>(R.id.receiveButton)

        vm.resultLive.observe(this, { text ->
            dataTextView.text = text
        })


        sendButton.setOnClickListener {
           val text  = dataEditView.text.toString()
            vm.save(text)
        }

        receiveButton.setOnClickListener {
            val userName: UserName = getUserNameUseCase.execute()
            dataTextView.text = "${userName.firstName} ${userName.lastName}"
        }






    }
}










































