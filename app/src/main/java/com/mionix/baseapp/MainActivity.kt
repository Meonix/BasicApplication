package com.mionix.baseapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import com.mionix.baseapp.model.local.Preferences
import com.mionix.baseapp.ui.base.BaseActivity
import com.mionix.baseapp.viewmodel.LovePercentViewmodel
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : BaseActivity() {
    private val mPreferences by inject<Preferences>()
    private val mLovePercentViewmodel : LovePercentViewmodel by viewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mLovePercentViewmodel.getPercentage("Duy","My")
        mLovePercentViewmodel.percentage.observe(this, Observer {
            Toast.makeText(this,it.percentage.toString(),Toast.LENGTH_SHORT).show()
        })
    }

    override fun onClickActionLeftListener() {

    }

    override fun setTitleToolbar(): String? {
        return "Base"
    }
}
