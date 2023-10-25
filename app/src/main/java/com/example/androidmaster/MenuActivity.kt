  package com.example.androidmaster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.androidmaster.firstapp.FirstAppActivity
import com.example.androidmaster.imccalculator.ImcCalculatorActivity
import com.example.androidmaster.settings.SettingsActivity
import com.example.androidmaster.superHeroApp.SuperHeroListActivity
import com.example.androidmaster.todoapp.TodoActivity

  class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnSaludarApp = findViewById<Button>(R.id.btnSaludarApp)
        val btnImcApp = findViewById<Button>(R.id.btnIMCApp)
        val btnTODO = findViewById<Button>(R.id.btnTODO)
        val btnSuperHero = findViewById<Button>(R.id.btnSuperHero)
        val btnSetting = findViewById<Button>(R.id.btnSettings)

        btnSaludarApp.setOnClickListener { navigateToSaludarApp() }
        btnImcApp.setOnClickListener { navigateToImcApp() }
        btnTODO.setOnClickListener { navigateToTodoApp() }
        btnSuperHero.setOnClickListener { navigateToSuperHeroApp() }
        btnSetting.setOnClickListener { navigateToSettings() }
    }

      private fun navigateToSettings() {
          val intent = Intent(this, SettingsActivity::class.java)
          startActivity(intent)
      }

      private fun navigateToTodoApp() {
        val intent = Intent(this, TodoActivity::class.java)
        startActivity(intent)
      }

      private fun navigateToImcApp() {
          val intent = Intent(this, ImcCalculatorActivity::class.java)
          startActivity(intent)
      }

      private fun navigateToSaludarApp(){
          val intent = Intent(this, FirstAppActivity::class.java)
          startActivity(intent)
      }

      private fun navigateToSuperHeroApp(){
          val intent = Intent(this, SuperHeroListActivity::class.java )
          startActivity(intent)
      }
}