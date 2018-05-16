package com.github.atsumo.android_feature_module_sample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.github.atsumo.android_feature_module_sample.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.main_activity)
    if (savedInstanceState == null) {
      supportFragmentManager.beginTransaction()
        .replace(R.id.container, MainFragment.newInstance())
        .commitNow()
    }
  }
}
